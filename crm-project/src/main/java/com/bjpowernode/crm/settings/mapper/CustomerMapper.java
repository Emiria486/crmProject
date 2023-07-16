package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Customer row);

    int insertSelective(Customer row);

    Customer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Customer row);

    int updateByPrimaryKey(Customer row);

    List<String> selectCustomerNameByName(String name);

    Customer selectCustomerByName(String name);
}