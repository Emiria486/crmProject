package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.TranRemark;

import java.util.List;

public interface TranRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(TranRemark row);

    int insertSelective(TranRemark row);

    TranRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TranRemark row);

    int updateByPrimaryKey(TranRemark row);
    int insertTranRemarkByList(List<TranRemark> list);
}