package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.DiagnosisAndTreatmentPlan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DiagnosisAndTreatmentPlanDAO继承基类
 */
@Repository
@Mapper
public interface DiagnosisAndTreatmentPlanDAO  {
    //id查询
    DiagnosisAndTreatmentPlan selectByPlanId(Integer id);
}