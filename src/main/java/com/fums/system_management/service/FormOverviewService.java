package com.fums.system_management.service;

import com.fums.system_management.pojo.FormOverview;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/15 0015 下午 2:19
 * Desc: 描述
 */
public interface FormOverviewService {

    List<FormOverview> seleForm(@Param("followUpName") String followUpName,
                                @Param("creationDate") Date creationDate,
                                @Param("updatedDate")Date updatedDate,
                                @Param("templateName")String templateName,
                                @Param("theReator")String theReator);

}
