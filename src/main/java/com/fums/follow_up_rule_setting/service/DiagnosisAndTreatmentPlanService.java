package com.fums.follow_up_rule_setting.service;

import com.fums.follow_up_rule_setting.pojo.DiagnosisAndTreatmentPlan;

public interface DiagnosisAndTreatmentPlanService {
    //id查询
    public DiagnosisAndTreatmentPlan selectByPlanId(Integer id);
}
