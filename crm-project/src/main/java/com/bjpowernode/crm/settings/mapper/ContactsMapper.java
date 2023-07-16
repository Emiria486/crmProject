package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.Contacts;

public interface ContactsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Contacts row);

    int insertSelective(Contacts row);

    Contacts selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Contacts row);

    int updateByPrimaryKey(Contacts row);
}