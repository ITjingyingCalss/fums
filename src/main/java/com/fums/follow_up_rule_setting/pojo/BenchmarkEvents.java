package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * benchmark_events
 * @author 
 */
public class BenchmarkEvents implements Serializable {
    /**
     * 基准事件id
     */
    private Integer benchmarkEventsId;

    /**
     * 基准事件名称
     */
    private String benchmarkEventsName;

    private static final long serialVersionUID = 1L;

    public Integer getBenchmarkEventsId() {
        return benchmarkEventsId;
    }

    public void setBenchmarkEventsId(Integer benchmarkEventsId) {
        this.benchmarkEventsId = benchmarkEventsId;
    }

    public String getBenchmarkEventsName() {
        return benchmarkEventsName;
    }

    public void setBenchmarkEventsName(String benchmarkEventsName) {
        this.benchmarkEventsName = benchmarkEventsName;
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
        BenchmarkEvents other = (BenchmarkEvents) that;
        return (this.getBenchmarkEventsId() == null ? other.getBenchmarkEventsId() == null : this.getBenchmarkEventsId().equals(other.getBenchmarkEventsId()))
            && (this.getBenchmarkEventsName() == null ? other.getBenchmarkEventsName() == null : this.getBenchmarkEventsName().equals(other.getBenchmarkEventsName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBenchmarkEventsId() == null) ? 0 : getBenchmarkEventsId().hashCode());
        result = prime * result + ((getBenchmarkEventsName() == null) ? 0 : getBenchmarkEventsName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", benchmarkEventsId=").append(benchmarkEventsId);
        sb.append(", benchmarkEventsName=").append(benchmarkEventsName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}