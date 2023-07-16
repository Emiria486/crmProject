package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.ClueRemark;

import java.util.List;

public interface ClueRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClueRemark row);

    int insertSelective(ClueRemark row);

    ClueRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClueRemark row);

    int updateByPrimaryKey(ClueRemark row);

    /**
     * 根据clueID查询该线索下所有的备注
     *
     * @param clueId
     * @return
     */
    List<ClueRemark> selectCLueRemarkForDetailByClueId(String clueId);

    /**
     * 根据clueId查询该线索下所有的备注信息
     *
     * @param clueId
     * @return
     */
    List<ClueRemark> selectClueRemarkByClueId(String clueId);

    int deleteClueRemarkByClueId(String clueId);
}