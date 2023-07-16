package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.ClueActivityRelation;

import java.util.List;

public interface ClueActivityRelationMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClueActivityRelation row);

    int insertSelective(ClueActivityRelation row);

    ClueActivityRelation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClueActivityRelation row);

    int updateByPrimaryKey(ClueActivityRelation row);

    /**
     * 批量保存创建的线索和市场活动的关联关系
     * @param list
     * @return
     */
    int insertClueActivityRelationByList(List<ClueActivityRelation> list);

    /**
     * 根据clueId和activityId删除线索和市场活动的关联关系
     *
     * @param clueActivityRelation
     * @return
     */
    int deleteClueActivityRelationByClueIdActivityId(ClueActivityRelation clueActivityRelation);
    List<ClueActivityRelation> selectClueActivityRelationByClueId(String clueId);
    int deleteClueActivityRelationByClueId(String clueId);
}