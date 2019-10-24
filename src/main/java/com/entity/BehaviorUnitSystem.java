package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "behavior_unit_system", schema = "test", catalog = "")
public class BehaviorUnitSystem {
    private long id;
    private String name;
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
    @Column(name = "CON_VALUE")
    public Short getConValue() {
        return conValue;
    }

    public void setConValue(Short conValue) {
        this.conValue = conValue;
    }
}
