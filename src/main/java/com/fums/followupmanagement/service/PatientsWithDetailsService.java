package com.fums.followupmanagement.service;

import com.fums.pojo.Patient;

public interface PatientsWithDetailsService {
    Patient findPatientsById(Integer id);
}
