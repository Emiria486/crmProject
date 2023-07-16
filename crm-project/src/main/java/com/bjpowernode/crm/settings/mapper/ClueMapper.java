package com.bjpowernode.crm.settings.mapper;

import com.bjpowernode.crm.workbench.transaction.model.Clue;

public interface ClueMapper {
    int deleteByPrimaryKey(String id);

    int insert(Clue row);

    int insertSelective(Clue row);

    Clue selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Clue row);

    int updateByPrimaryKey(Clue row);

    /**
     * 保存创建的线索
     *
     * @param recode
     * @return
     */
    int insertClue(Clue recode);

    /**
     * 根据id查询线索的明细信息
     *
     * @param id
     * @return
     */
    Clue selectClueForDetailById(String id);

    /**
     * 根据id查询线索的信息
     *
     * @param id
     * @return
     */
    Clue selectClueById(String id);

    /**根据id删除线索
     * @param id
     * @return
     */
    int deleteClueById(String id);
}