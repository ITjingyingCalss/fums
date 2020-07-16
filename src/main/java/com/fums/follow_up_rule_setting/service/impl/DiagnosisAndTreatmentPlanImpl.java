package com.fums.follow_up_rule_setting.service.impl;

import com.fums.follow_up_rule_setting.dao.DiagnosisAndTreatmentPlanDAO;
import com.fums.follow_up_rule_setting.pojo.DiagnosisAndTreatmentPlan;
import com.fums.follow_up_rule_setting.service.DiagnosisAndTreatmentPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisAndTreatmentPlanImpl implements DiagnosisAndTreatmentPlanService {

    @Autowired
    DiagnosisAndTreatmentPlanDAO diagnosisAndTreatmentPlanDAO;

    @Override
    public DiagnosisAndTreatmentPlan selectByPlanId(Integer id) {
        return diagnosisAndTreatmentPlanDAO.selectByPlanId(id);
    }
}
