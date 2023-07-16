package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.ContactsActivityRelation;

import java.util.List;

public interface ContactsActivityRelationMapper {
    int deleteByPrimaryKey(String id);

    int insert(ContactsActivityRelation row);

    int insertSelective(ContactsActivityRelation row);

    ContactsActivityRelation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ContactsActivityRelation row);

    int updateByPrimaryKey(ContactsActivityRelation row);
    int insertContactsActivityRelationByList(List<ContactsActivityRelation> list);
}