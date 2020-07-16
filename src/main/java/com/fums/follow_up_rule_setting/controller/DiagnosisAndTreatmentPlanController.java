package com.fums.follow_up_rule_setting.controller;

import com.fums.follow_up_rule_setting.pojo.DiagnosisAndTreatmentPlan;
import com.fums.follow_up_rule_setting.service.impl.DiagnosisAndTreatmentPlanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiagnosisAndTreatmentPlanController {
    @Autowired
    DiagnosisAndTreatmentPlanImpl diagnosisAndTreatmentPlanImpl;

    @ResponseBody
    @RequestMapping("selectByPlanId")
    public DiagnosisAndTreatmentPlan selectByPlanId(Integer id){
        DiagnosisAndTreatmentPlan diagnosisAndTreatmentPlan = this.diagnosisAndTreatmentPlanImpl.selectByPlanId(id);
        return diagnosisAndTreatmentPlan;
    }
}
