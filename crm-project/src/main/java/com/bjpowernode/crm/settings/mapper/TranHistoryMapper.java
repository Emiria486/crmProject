package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.TranHistory;

public interface TranHistoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(TranHistory row);

    int insertSelective(TranHistory row);

    TranHistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TranHistory row);

    int updateByPrimaryKey(TranHistory row);
}