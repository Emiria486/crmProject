package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.workbench.transaction.model.DicValue;

import java.util.List;

public interface DicValueService {
    List<DicValue> queryDicValueByTypeCode(String typeCode);
}
