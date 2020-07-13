package com.fums.follow_up_rule_setting.controller;

import com.fums.follow_up_rule_setting.pojo.FollowUpRules;
import com.fums.follow_up_rule_setting.service.impl.FollowUpRulesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FollowUpRulesControler {

    @Autowired
    FollowUpRulesImpl followUpRulesImpl;


    @ResponseBody
    @RequestMapping("selectAll")
    public List<FollowUpRules> selectAll(){
        List<FollowUpRules> followUpRules = followUpRulesImpl.selectAll();
        return followUpRules;
    }


}
