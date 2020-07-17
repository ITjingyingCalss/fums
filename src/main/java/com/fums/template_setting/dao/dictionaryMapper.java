package com.fums.template_setting.dao;


import com.fums.template_setting.pojo.dictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface dictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(dictionary record);

    int insertSelective(dictionary record);

    dictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(dictionary record);

    int updateByPrimaryKey(dictionary record);

    List<dictionary> selectDictionary();
}