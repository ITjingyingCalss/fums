package com.fums.system_management.dao;

import com.fums.pojo.UserDepartment;
import org.springframework.stereotype.Repository;

/**
 * UserDepartmentDAO继承基类
 */
@Repository
public interface UserDepartmentDAO extends MyBatisBaseDao<UserDepartment, Integer> {
}