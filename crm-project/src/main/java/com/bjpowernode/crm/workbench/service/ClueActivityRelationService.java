package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.transaction.model.ClueActivityRelation;

import java.util.List;

public interface ClueActivityRelationService {
    int saveCreateClueActivityRelationByList(List<ClueActivityRelation> list);
    int deleteClueActivityRelationByClueIdActivityId(ClueActivityRelation relation);
}
