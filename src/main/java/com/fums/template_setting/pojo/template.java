package com.fums.template_setting.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: 赵林
 * @Date: 2020/7/11 22:51
 * @Description: 模板Vo类
 */
@Data
public class template implements Serializable {
    //姓名
    private String name;
    //性别
    private int sex;
    //出生日期
    private Date bronTime;
    //民族
    private int nation;
    //身高
    private double height;
    //体重
    private double weight;
    //BMI
    private double bmi;
    //症状
    private int symptom;

    @Override
    public String toString() {
        return "template{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", bronTime=" + bronTime +
                ", nation=" + nation +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                ", symptom=" + symptom +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBronTime() {
        return bronTime;
    }

    public void setBronTime(Date bronTime) {
        this.bronTime = bronTime;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int getSymptom() {
        return symptom;
    }

    public void setSymptom(int symptom) {
        this.symptom = symptom;
    }

    public template() {
    }
}
