package com.fums.followupmanagement.service.impl;

import com.fums.followupmanagement.dao.PatientDAO;
import com.fums.followupmanagement.service.PatientsWithDetailsService;
import com.fums.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsWithDetailsServiceImpl implements PatientsWithDetailsService {
    @Autowired
    PatientDAO patientDAO;
    @Override
    public Patient findPatientsById(Integer id) {
        return patientDAO.selectByPrimaryKey(id);
    }
}
