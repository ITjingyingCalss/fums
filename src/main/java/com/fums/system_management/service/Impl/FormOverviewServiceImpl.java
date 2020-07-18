package com.fums.system_management.service.Impl;


import com.fums.pojo.FormOverview;
import com.fums.system_management.dao.FormOverviewDAO;

import com.fums.system_management.service.FormOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/15 0015 下午 2:20
 * Desc: 描述
 */
@Service
public class FormOverviewServiceImpl implements FormOverviewService {

    @Autowired
    FormOverviewDAO formOverviewDAO;


    @Override
    public List<FormOverview> seleForm(String followUpName, Date creationDate, Date updatedDate, String templateName, String theReator) {
        return formOverviewDAO.seleForm(followUpName,creationDate, updatedDate, templateName,  theReator);
    }
}
