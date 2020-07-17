package com.fums.template_setting.dao;
import com.fums.template_setting.pojo.middle;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface middleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(middle record);

    int insertSelective(middle record);

    middle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(middle record);

    int updateByPrimaryKey(middle record);
}