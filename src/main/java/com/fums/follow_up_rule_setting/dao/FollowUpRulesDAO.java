package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.FollowUpRules;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * FollowUpRulesDAO继承基类
 */
@Repository
@Mapper
public interface FollowUpRulesDAO  {

    List<FollowUpRules> selectAll();

}