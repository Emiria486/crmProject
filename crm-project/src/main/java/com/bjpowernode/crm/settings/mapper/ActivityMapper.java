package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.Activity;
import org.springframework.expression.spel.ast.Literal;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    int deleteByPrimaryKey(String id);

    /**保存软件的市场活动
     * @param activity 保存的市场活动
     * @return
     */
    int insertActivity(Activity activity);

    int insertSelective(Activity row);

    Activity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Activity row);

    int updateByPrimaryKey(Activity row);

    /**根据条件分页查询市场活动的列表
     * @param map 查询条件
     * @return
     */
    List<Activity>  selectActivityByConditionForPage(Map<String,Object> map);

    /**根据条件分页查询市场活动的列表
     * @param map
     * @return
     */
    int selectCountOfActivityByCondition(Map<String,Object> map);

    /**根据ids批量删除市场活动
     * @param ids
     * @return
     */
    int deleteActivityByIds(String[] ids);

    /**根据id查询市场活动的信息
     * @param id
     * @return
     */
    Activity selectActivityById(String id);

    /**保存修改的市场活动
     * @param activity
     * @return
     */
    int updateActivity(Activity activity);
    List<Activity> selectAllActivity();

    /**批量保存创建的市场活动
     * @param activityList
     * @return
     */
    int insertActivityByList(List<Activity> activityList);

    /**根据id查询市场活动的明细信息
     * @param id
     * @return
     */
    Activity selectActivityForDetailById(String id);

    /**
     * 根据clueId查询该线索相关联的市场活动的明细信息
     *
     * @param clueId
     * @return
     */
    List<Activity> selectActivityForDetailByClueId(String clueId);

    /**
     * 根据name模糊查询市场活动，并且把已经跟clueId关联过的市场活动排除
     *
     * @param map
     * @return
     */
    List<Activity> selectActivityForDetailByNameClueId(Map<String, Object> map);

    /**
     * 根据ids查询市场活动的明细信息
     *
     * @param ids
     * @return
     */
    List<Activity> selectActivityForDetailByIds(String[] ids);

    /**根据name模糊查询市场活动，并且查询那些跟clueId关联过的市场活动
     * @param map
     * @return
     */
    List<Activity> selectActivityForConvertByNameClueId(Map<String,Object> map);
}