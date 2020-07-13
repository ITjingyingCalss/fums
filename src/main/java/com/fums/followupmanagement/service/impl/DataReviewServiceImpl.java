package com.fums.followupmanagement.service.impl;

import com.fums.followupmanagement.dao.ControlTreeDictionaryDAO;
import com.fums.followupmanagement.dao.DataReviewDAO;
import com.fums.followupmanagement.dao.PatientDAO;
import com.fums.followupmanagement.service.DataReviewService;
import com.fums.pojo.DataReview;
import com.fums.pojo.DataReviewExample;
import com.fums.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataReviewServiceImpl implements DataReviewService {
    @Autowired
    DataReviewDAO dataReviewDAO;
    @Autowired
    ControlTreeDictionaryDAO controlTreeDictionaryDAO;
    @Autowired
    PatientDAO patientDAO;
    @Override
    public List<DataReview> findAllDataReview(DataReview dataReview,Integer[] list) {
        //DataReviewExample dataReviewExample = new DataReviewExample();
        List<DataReview> dataReviewList = dataReviewDAO.selectAll(dataReview,list,null,null);
        return dataReviewList;
    }

    @Override
    public DataReview findOneDataReview(Integer id) {

        return dataReviewDAO.selectByPrimaryKey(id);
    }

    @Override
    public void seveDataReview(Integer id,String dataItem, Integer patientId, String amend, String revision) {
        DataReview dataReview = new DataReview();
        dataReview.setId(id);
        dataReview.setReviewState(1);
        dataReview.setValue(amend);
        String field = controlTreeDictionaryDAO.selectByFieldsChinaese(dataItem);
        Map map = new HashMap();
        map.put("id",id);
        map.put("field",field);
        map.put("amend",amend);
        map.put("patientId",patientId);
        int i = patientDAO.updateByField(map);
        int j = dataReviewDAO.updateByPrimaryKeySelective(dataReview);
        System.err.println(i+","+j);
    }
}
