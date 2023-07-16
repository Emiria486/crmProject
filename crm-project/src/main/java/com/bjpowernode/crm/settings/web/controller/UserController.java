package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.commons.contants.Consts;
import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.commons.utils.DateUtils;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.workbench.transaction.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
//    url要和controller方法处理完请求之后，响应信息返回的页面目录保存一致
    @RequestMapping("/settings/qx/user/toLogin.do")
    public String toLogin(){
        return "settings/qx/user/login";
    }
    @RequestMapping("settings/qx/user/login.do")
    public @ResponseBody  Object login(String loginAct, String loginPwd, String isRemPwd, HttpServletRequest request, HttpServletResponse response, HttpSession session){
        Map<String,Object> map=new HashMap<>();
        map.put("LoginAct",loginAct);
        map.put("loginPwd",loginPwd);
//        调用service层方法，查询用户
        User user=userService.queryUserByLoginActAndPwd(map);
//        根据查询结果，生成响应信息
        ReturnObject returnObject=new ReturnObject();
//        根据查询结构，生成响应信息
        if(user==null){
//          登录失败，用户名或密码错误
            returnObject.setCode(Consts.RETURN_OBJECT_CODE_FAIL);
            returnObject.setMessage("用户名或密码错误");
        }else {
            if (DateUtils.formatDateTime(new Date()).compareTo(user.getExpireTime())>0){
//                登录失败，账号已过期
                returnObject.setCode(Consts.RETURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("账号已过期");
            }else if("0".equals(user.getLockState())){
//                登录失败，状态被锁定
                returnObject.setCode(Consts.RETURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("状态被锁定");
            } else if (user.getAllowIps().contains(request.getRemoteAddr())) {
//                登录失败，IP受限
                returnObject.setCode(Consts.RETURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("ip受限");
            }else {
//                登录成功
                    returnObject.setCode(Consts.RETURN_OBJECT_CODE_SUCCESS);
//                    将user保存到session，方便传递数据
                session.setAttribute(Consts.SESSION_USER,user);
//                如果需要记住密码，则往外写cookie
                if("true".equals(isRemPwd)){
                    Cookie c1 = new Cookie("loginAct", user.getLoginAct());
//                    设置cookie保活时间
                    c1.setMaxAge(10 * 24 * 60 * 60);
                    response.addCookie(c1);
                    Cookie c2=new Cookie("loginPwd",user.getLoginPwd());
                    c2.setMaxAge(10*24*60*60);
                    response.addCookie(c2);
                }else {
//                    把没有过期cookie删除
                    Cookie c1=new Cookie("loginAct","1");
                    c1.setMaxAge(0);    //maxAge设置为0相当于删除cookie
                    response.addCookie(c1);
                    Cookie c2 = new Cookie("loginPwd", "1");
                    c2.setMaxAge(0);
                    response.addCookie(c2);
                }
            }
        }
        return returnObject;
    }
    @RequestMapping("/setting/qs/user/logout.do")
    public String logout(HttpServletResponse response,HttpSession session){
//        清空cookie
        Cookie c1 = new Cookie("loginAct", "1");;
        c1.setMaxAge(0);
        response.addCookie(c1);
        Cookie c2 = new Cookie("loginPwd", "1");
        c2.setMaxAge(0);
        response.addCookie(c2);
//        销毁session
        session.invalidate();
//        跳转到首页
        return "redirect:/"; //借助springmvc来重定向,底层实现response.sendRedirect("/crm/");
    }
}
