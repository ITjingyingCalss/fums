package com.fums.followupmanagement.controller;

import com.fums.followupmanagement.service.PatientsWithDetailsService;
import com.fums.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patientsWithDetailsController")
public class PatientsWithDetailsController {
    @Autowired
    PatientsWithDetailsService patientsWithDetailsServiceImpl;
    @RequestMapping("findPatientsById")
    public Patient findPatientsById(@RequestParam("id") Integer id){
        return patientsWithDetailsServiceImpl.findPatientsById(id);
    }
}
