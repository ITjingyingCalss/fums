package com.fums.template_setting.dao;
import com.fums.template_setting.pojo.contacts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface contactsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(contacts record);

    int insertSelective(contacts record);

    contacts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(contacts record);

    int updateByPrimaryKey(contacts record);
}