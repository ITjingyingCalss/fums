package com.fums.followupmanagement.dao;

import com.fums.pojo.Patient;
import com.fums.pojo.PatientExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PatientDAO继承基类
 */
@Repository
@Mapper
public interface PatientDAO extends MyBatisBaseDao<Patient, Integer, PatientExample> {
}