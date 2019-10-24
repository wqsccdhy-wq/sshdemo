package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "behavior_statistics_unit_govdoc", schema = "test", catalog = "")
public class BehaviorStatisticsUnitGovdoc {
    private long id;
    private String name;
    private Long unitId;
    private Timestamp createTime;
    private Long num;
    private Short year;
    private Short month;
    private Short day;
    private Short conValue;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "UNIT_ID")
    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "NUM")
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Basic
    @Column(name = "YEAR")
    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    @Basic
    @Column(name = "MONTH")
    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
    }

    @Basic
    @Column(name = "DAY")
    public Short getDay() {
        return day;
    }

    public void setDay(Short day) {
        this.day = day;
    }

    @Basic
    @Column(name = "CON_VALUE")
    public Short getConValue() {
        return conValue;
    }

    public void setConValue(Short conValue) {
        this.conValue = conValue;
    }
}
