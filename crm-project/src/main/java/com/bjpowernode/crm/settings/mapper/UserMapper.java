package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
public interface UserMapper {
    int deleteByPrimaryKey(String id);


    int insert(User record);


    int insertSelective(User record);


    User selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User selectUserByLoginActAndPwd(Map<String, Object> map);
    List<User> selectAllUsers();
}