package com.fums.system_management.controller;

import com.alibaba.fastjson.JSON;
import com.fums.system_management.pojo.FormOverview;
import com.fums.system_management.pojo.User;
import com.fums.system_management.service.FormOverviewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *Huangdebao
 * @outher:
 * @Date: 2020/7/15 0015 下午 2:21
 * Desc: 描述
 */

@RestController
@RequestMapping("FormOverviewController")
public class FormOverviewController {

    @Autowired
    FormOverviewService formOverviewService;
    @ResponseBody
    @RequestMapping(value = "seleForm" ,produces = "application/json;charset=utf-8")
    public String seleForm(String followUpName,
                           String creationDate,
                           String updatedDate,
                           String templateName,
                           String theReator,
                           @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum) throws ParseException {

        Date da = (Date) new  SimpleDateFormat("yyyy-MM-dd").parse(creationDate);
        Date dada = (Date) new  SimpleDateFormat("yyyy-MM-dd").parse(updatedDate);
        PageHelper.startPage(pageNum,5);
        List<FormOverview> list = formOverviewService.seleForm(followUpName,da, dada, templateName, theReator);

       PageInfo<FormOverview> pageInfo = new PageInfo<>(list);

        return JSON.toJSONString(list);

    }




}
