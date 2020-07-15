package com.fums.template_setting.dao;


import com.fums.template_setting.pojo.certificates;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface certificatesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(certificates record);

    int insertSelective(certificates record);

    certificates selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(certificates record);

    int updateByPrimaryKey(certificates record);
}