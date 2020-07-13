package com.fums.followupmanagement.controller;

import com.fums.followupmanagement.service.DataReviewService;
import com.fums.pojo.DataReview;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DataReviewController")
public class DataReviewController {
    @Autowired
    DataReviewService dataReviewService;
    @RequestMapping("/findAllDataReview")
    public PageInfo findAllDataReview(DataReview dataReview,Integer pageNum,Integer[] list){
        //System.err.println(dataReview);
        //System.err.println(list[0]);
        PageHelper.startPage(pageNum,5);
        List<DataReview> dataReviewList = dataReviewService.findAllDataReview(dataReview,list);
        return new PageInfo(dataReviewList);
    }
    @RequestMapping("/seveDataReview")
    public void seveDataReview(@RequestParam("id") Integer id, @RequestParam("dataItem") String dataItem,@RequestParam("patientId") Integer patientId,@RequestParam("amend") String amend,@RequestParam("revision") String revision){
        System.err.println(dataItem);
        System.err.println(amend);
        System.err.println(revision);
                dataReviewService.seveDataReview(id,dataItem,patientId,amend,revision);
    }
    @RequestMapping("/findOneDataReview")
    public DataReview findOneDataReview(@RequestParam Integer id){
        System.err.println(id);
        return dataReviewService.findOneDataReview(id);
    }
}
