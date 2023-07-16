package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.ActivityRemark;

import java.util.List;

public interface ActivityRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityRemark row);

    int insertSelective(ActivityRemark row);

    ActivityRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityRemark row);

    int updateByPrimaryKey(ActivityRemark row);

    /**根据activity查询市场活动下所有备注的明细信息
     * @param activity
     * @return
     */
    List<ActivityRemark> selectActivityRemarkForDetailByActivityId(String activity);

    /**保存创建的市场活动备注
     * @param remark
     * @return
     */
    int insertActivityRemark(ActivityRemark remark);

    /**根据id删除市场活动备注
     * @param id
     * @return
     */
    int deleteActivityRemarkById(String id);

    /**保存修改的市场活动备注
     * @param remark
     * @return
     */
    int updateActivityRemark(ActivityRemark remark);
}