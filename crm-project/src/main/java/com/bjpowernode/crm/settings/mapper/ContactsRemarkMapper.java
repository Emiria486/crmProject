package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.ContactsRemark;

import java.util.List;

public interface ContactsRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(ContactsRemark row);

    int insertSelective(ContactsRemark row);

    ContactsRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ContactsRemark row);

    int updateByPrimaryKey(ContactsRemark row);
    int insertContactsRemarkByList(List<ContactsRemark> list);
}