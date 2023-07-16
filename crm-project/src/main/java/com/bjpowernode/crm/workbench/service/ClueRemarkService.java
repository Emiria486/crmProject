package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.transaction.model.ClueRemark;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ClueRemarkService {
    List<ClueRemark> queryClueRemarkForDetailByClueId(String clueId);
}
