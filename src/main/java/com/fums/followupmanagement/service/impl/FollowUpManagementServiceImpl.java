package com.fums.followupmanagement.service.impl;

import com.fums.followupmanagement.dao.FollowPatientDAO;
import com.fums.followupmanagement.dao.FollowUpDAO;
import com.fums.followupmanagement.dao.HospitalDepartmentDAO;
import com.fums.followupmanagement.service.FollowUpManagementService;
import com.fums.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class FollowUpManagementServiceImpl implements FollowUpManagementService {
    @Autowired
    FollowPatientDAO followPatientDAO;
    @Autowired
    FollowUpDAO followUpDAO;
    @Autowired
    HospitalDepartmentDAO hospitalDepartmentDAO;
    @Override
    public List<FollowPatient> findAllFollowUpManagement(FollowPatient followPatient, Integer[] list,String setOfDate1,String setOfDate2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1;
        Date date2;
        try {
            date1 = sdf.parse(setOfDate1);
            date2 = sdf.parse(setOfDate2);
        }catch (Exception e){
            date1 = null;
            date2 = null;
        }


        return followPatientDAO.selectAll(followPatient,list,date1,date2);
    }

    @Override
    public Map findFollowUpGroupAndHospitalDepartment() {
        Map map = new HashMap();
        FollowUpExample followUpExample = new FollowUpExample();
        HospitalDepartmentExample hospitalDepartmentExample = new HospitalDepartmentExample();
        List<FollowUp> followUpList = followUpDAO.selectByExample(followUpExample);
        List<HospitalDepartment> hospitalDepartmentList = hospitalDepartmentDAO.selectByExample(hospitalDepartmentExample);
        map.put("followUpList",followUpList);
        map.put("hospitalDepartmentList",hospitalDepartmentList);
        return map;
    }

    @Override
    public List<Map> findCalendarData() {
        Map<String,Integer> allDays = new HashMap<String, Integer>();
        Map<String,Integer> intradayCheckedNumber = new HashMap<String, Integer>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        FollowPatient followPatient = new FollowPatient();
        List<FollowPatient> followPatientList = followPatientDAO.selectAll(followPatient,null,null,null);
        for (int i=0;i<followPatientList.size();i++){
            String dateTime = sdf.format(followPatientList.get(i).getDateOfNextFollowUp());
            //System.err.println(allDays.containsKey(dateTime));
            /*
            allDays用来存当天所有要随访人数
            * 判断key是否存在
            * 不存在将该key存到map
            * 存在key对应的value+1*/
            if (!allDays.containsKey(dateTime)){
                allDays.put(dateTime,1);
            }else {
                allDays.put(dateTime,allDays.get(dateTime)+1);
            }
            /*intradayCheckedNumber用来存当天已随访人数*/
            if (!intradayCheckedNumber.containsKey(dateTime)){
                if (followPatientList.get(i).getFollowUpSetdate()==1){
                    intradayCheckedNumber.put(dateTime,1);
                }else {
                    /*该key不存在并且未随访*/
                    intradayCheckedNumber.put(dateTime,0);
                }
            }else if (followPatientList.get(i).getFollowUpSetdate()==1){
                    intradayCheckedNumber.put(dateTime,intradayCheckedNumber.get(dateTime)+1);
            }
            //System.err.println(intradayCheckedNumber);
        }
        List<Map> mapList = new ArrayList<Map>();
        mapList.add(allDays);
        mapList.add(intradayCheckedNumber);
        return mapList;
    }
}
