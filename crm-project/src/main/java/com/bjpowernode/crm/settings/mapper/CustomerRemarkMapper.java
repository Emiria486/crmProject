package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.CustomerRemark;

import java.util.List;

public interface CustomerRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(CustomerRemark row);

    int insertSelective(CustomerRemark row);

    CustomerRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CustomerRemark row);

    int updateByPrimaryKey(CustomerRemark row);

    /**批量保存创建的客户备注
     * @param list
     * @return
     */
    int insertCustomerRemarkByList(List<CustomerRemark> list);
}