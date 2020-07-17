package com.fums.template_setting.controller;

import com.alibaba.fastjson.JSON;
import com.fums.template_setting.pojo.*;
import com.fums.template_setting.service.treeService;
import com.fums.template_setting.utils.Dto;
import com.fums.template_setting.utils.DtoUtil;
import com.fums.template_setting.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * @author: 赵林
 * @Date: 2020/6/29 11:41
 * @Description:
 */
@RestController
public class TreeController {
    @Autowired
    private treeService treeService;
    @Resource
    private RedisTemplate<String,template> redisTemplate;




    /**
     * 所有表内容
     */
    public static int i = 0;
    @RequestMapping(value = "/selectSymptom" ,produces = "application/json;charset=utf-8")
    public String selectSymptom(@RequestParam(value = "symId",required = false) Integer symId){
        if(symId!=null&&symId<=0){
            symId=null;
        }
        String result="";
        List<detail> details = treeService.selectSymptom(symId);
         result = JSON.toJSONString(details);
       return result;
    }
    /**
     * 症状表内容
     */
    @RequestMapping(value = "/selectSymptom2" ,produces = "application/json;charset=utf-8")
    public String selectSymptom2(){
        String result="";
        List<detail> details = treeService.selectSymptom2();
        result = JSON.toJSONString(details);
        return result;
    }
    /**
     * 症状表
     */
    @RequestMapping(value = "/queryid" ,produces = "application/json;charset=utf-8")
    public String queryid(){
        List<Symptom> queryid = treeService.queryid();
        String s = JSON.toJSONString(queryid);
        return s;
    }
    /**
     * 多id查询
     */
    @RequestMapping(value = "/selectMoreId" ,produces = "application/json;charset=utf-8")
    public String selectMoreId(@RequestParam("importId[]") Integer[] importId){
        List<Symptom> symptoms = treeService.selectMoreId(Arrays.asList(importId));
        String result = JSON.toJSONString(symptoms);
        return result;
    }
    /**
     * 添加至树节点
     */
    @RequestMapping(value = "/insertTree" ,produces = "application/json;charset=utf-8")
    public String insertTree(detail detail){
        int i = treeService.insertTree(detail);
        String s = JSON.toJSONString(i);
        return s;
    }
    /**
     * 模板添加
     */
    @RequestMapping(value = "/saveTemplate" ,produces = "application/json;charset=utf-8")
    public Dto saveTemplate(@RequestParam(value = "name") String name,
                            @RequestParam(value = "sex") int sex,
                            @RequestParam(value = "bronTime") Date bronTime,
                            @RequestParam(value = "nation") int nation,
                            @RequestParam(value = "height") double height,
                            @RequestParam(value = "weight") double weight,
                            @RequestParam(value = "bmi") double bmi,
                            @RequestParam(value = "symptom") int symptom){
        template template = new template();
        template.setName(name);
        template.setSex(sex);
        template.setBronTime(bronTime);
        template.setNation(nation);
        template.setHeight(height);
        template.setWeight(weight);
        template.setBmi(bmi);
        template.setSymptom(symptom);
        String a = "dayTemplate"+i;
        redisTemplate.opsForValue().set(a,template,60 * 10,
                TimeUnit.SECONDS);
        i ++;
        //设置过期时间2000秒
//        redisTemplate.expire("song",2000, TimeUnit.SECONDS);
        return DtoUtil.returnSuccess();
    }
    /**
     * 模板取值
     */
    @RequestMapping(value = "/obtainTemplate" ,produces = "application/json;charset=utf-8")
    public String obtainTemplate(){
        List<Object> list = new ArrayList<>();
        int a = 0;
        String key = "dayTemplate" + a;
        while (redisTemplate.hasKey(key)){
            Object dayTemplate = redisTemplate.opsForValue().get(key);
//            list.add(JSON.toJSONString(dayTemplate));
            list.add(dayTemplate);
            a ++;
            key = "dayTemplate" + a;

        }
        return JSON.toJSONString(list);
    }
    /**
     * js拖拽查询
     */
    @RequestMapping(value = "/selectBasicInformation" ,produces = "application/json;charset=utf-8")
    public String selectBasicInformation(){
        List<basicinformation> basicinformations = treeService.selectBasicInformation();
        return JSON.toJSONString(basicinformations);
    }
    //只需要加上下面这段即可，注意不能忘记注解
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
    /**
     * 添加至树节点
     */
    @RequestMapping(value = "/insertSelective" ,produces = "application/json;charset=utf-8")
    public String insertSelective(@RequestParam("ids") String ids){
        middle middle = new middle();
        String[] split = ids.split(",");
        String ss="";
        String vv="";
        String substring="";
        for (String s : split) {
            int num =Integer.parseInt(s);
                if(num>10){
                    ss+=num+",";
                    substring = ss.substring(0, ss.length() - 1);
                    System.out.println(substring);
                    middle.setCid(substring);
                 }else{
                    vv+=num+",";
                    substring = vv.substring(0, vv.length() - 1);
                    System.out.println(substring);
                    middle.setDid(substring);
            }
        }
        int i = treeService.insertSelective(middle);
        String s = JSON.toJSONString(i);
        return s;
    }
    /**
     * 树查询
     */
    @RequestMapping(value = "/selectDictionary" ,produces = "application/json;charset=utf-8")
    public String selectDictionary(){
        List<dictionary> dictionaries = treeService.selectDictionary();
        return JSON.toJSONString(dictionaries);
    }
}
