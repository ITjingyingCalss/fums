package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * point_of_time
 * @author 
 */
public class PointOfTime implements Serializable {
    private Integer id;

    /**
     * 基准事件id（默认id=1）
     */
    private Integer benchmarkEventsId;

    /**
     * 筛选事件id（默认id=1）
     */
    private Integer filterEventsId;

    /**
     * 起始年
     */
    private Integer startYear;

    /**
     * 起始月
     */
    private Integer startMonth;

    /**
     * 持续次数
     */
    private Integer duration;

    /**
     * 提前天数
     */
    private Integer daysAhead;

    /**
     * 起始日
     */
    private Integer startDay;

    /**
     * 间隔年
     */
    private Integer intervalYear;

    /**
     * 间隔月
     */
    private Integer intervalMonth;

    /**
     * 间隔日
     */
    private Integer intervalDay;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBenchmarkEventsId() {
        return benchmarkEventsId;
    }

    public void setBenchmarkEventsId(Integer benchmarkEventsId) {
        this.benchmarkEventsId = benchmarkEventsId;
    }

    public Integer getFilterEventsId() {
        return filterEventsId;
    }

    public void setFilterEventsId(Integer filterEventsId) {
        this.filterEventsId = filterEventsId;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDaysAhead() {
        return daysAhead;
    }

    public void setDaysAhead(Integer daysAhead) {
        this.daysAhead = daysAhead;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getIntervalYear() {
        return intervalYear;
    }

    public void setIntervalYear(Integer intervalYear) {
        this.intervalYear = intervalYear;
    }

    public Integer getIntervalMonth() {
        return intervalMonth;
    }

    public void setIntervalMonth(Integer intervalMonth) {
        this.intervalMonth = intervalMonth;
    }

    public Integer getIntervalDay() {
        return intervalDay;
    }

    public void setIntervalDay(Integer intervalDay) {
        this.intervalDay = intervalDay;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PointOfTime other = (PointOfTime) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBenchmarkEventsId() == null ? other.getBenchmarkEventsId() == null : this.getBenchmarkEventsId().equals(other.getBenchmarkEventsId()))
            && (this.getFilterEventsId() == null ? other.getFilterEventsId() == null : this.getFilterEventsId().equals(other.getFilterEventsId()))
            && (this.getStartYear() == null ? other.getStartYear() == null : this.getStartYear().equals(other.getStartYear()))
            && (this.getStartMonth() == null ? other.getStartMonth() == null : this.getStartMonth().equals(other.getStartMonth()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getDaysAhead() == null ? other.getDaysAhead() == null : this.getDaysAhead().equals(other.getDaysAhead()))
            && (this.getStartDay() == null ? other.getStartDay() == null : this.getStartDay().equals(other.getStartDay()))
            && (this.getIntervalYear() == null ? other.getIntervalYear() == null : this.getIntervalYear().equals(other.getIntervalYear()))
            && (this.getIntervalMonth() == null ? other.getIntervalMonth() == null : this.getIntervalMonth().equals(other.getIntervalMonth()))
            && (this.getIntervalDay() == null ? other.getIntervalDay() == null : this.getIntervalDay().equals(other.getIntervalDay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBenchmarkEventsId() == null) ? 0 : getBenchmarkEventsId().hashCode());
        result = prime * result + ((getFilterEventsId() == null) ? 0 : getFilterEventsId().hashCode());
        result = prime * result + ((getStartYear() == null) ? 0 : getStartYear().hashCode());
        result = prime * result + ((getStartMonth() == null) ? 0 : getStartMonth().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getDaysAhead() == null) ? 0 : getDaysAhead().hashCode());
        result = prime * result + ((getStartDay() == null) ? 0 : getStartDay().hashCode());
        result = prime * result + ((getIntervalYear() == null) ? 0 : getIntervalYear().hashCode());
        result = prime * result + ((getIntervalMonth() == null) ? 0 : getIntervalMonth().hashCode());
        result = prime * result + ((getIntervalDay() == null) ? 0 : getIntervalDay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", benchmarkEventsId=").append(benchmarkEventsId);
        sb.append(", filterEventsId=").append(filterEventsId);
        sb.append(", startYear=").append(startYear);
        sb.append(", startMonth=").append(startMonth);
        sb.append(", duration=").append(duration);
        sb.append(", daysAhead=").append(daysAhead);
        sb.append(", startDay=").append(startDay);
        sb.append(", intervalYear=").append(intervalYear);
        sb.append(", intervalMonth=").append(intervalMonth);
        sb.append(", intervalDay=").append(intervalDay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}