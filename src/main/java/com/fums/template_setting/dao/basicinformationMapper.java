package com.fums.template_setting.dao;

import com.fums.template_setting.pojo.basicinformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface basicinformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(basicinformation record);

    int insertSelective(basicinformation record);

    basicinformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(basicinformation record);

    int updateByPrimaryKey(basicinformation record);

    List<basicinformation> selectBasicInformation();
}