package com.fums.follow_up_rule_setting.service.impl;

import com.fums.follow_up_rule_setting.dao.FollowUpRulesDAO;
import com.fums.follow_up_rule_setting.pojo.FollowUpRules;
import com.fums.follow_up_rule_setting.service.FollowUpRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FollowUpRulesImpl implements FollowUpRulesService {

    @Autowired
    FollowUpRulesDAO followUpRulesDAO;

    @Override
    public List<FollowUpRules> selectAll() {
        List<FollowUpRules> followUpRules = followUpRulesDAO.selectAll();
        return followUpRules;
    }
}
