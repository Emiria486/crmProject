package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.FunnelVO;
import com.bjpowernode.crm.workbench.transaction.model.Tran;

import java.util.List;

public interface TranMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tran row);

    int insertSelective(Tran row);

    Tran selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tran row);

    int updateByPrimaryKey(Tran row);

    /**查询交易表各个阶段的数据量
     * @return
     */
    List<FunnelVO> selectCountOfTranGroupByStage();
}