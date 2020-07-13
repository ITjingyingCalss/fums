package com.fums.followupmanagement.dao;

import com.fums.pojo.ControlTreeDictionary;
import com.fums.pojo.ControlTreeDictionaryExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ControlTreeDictionaryDAO继承基类
 */
@Mapper
@Repository
public interface ControlTreeDictionaryDAO extends MyBatisBaseDao<ControlTreeDictionary, Integer, ControlTreeDictionaryExample> {
}