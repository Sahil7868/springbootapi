package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class exercise {

    @Id
    @GeneratedValue
    private Integer eid;

    private String ename;
    private Integer calorie;

    public exercise() {
    }

    public exercise(Integer eid, String ename, Integer calorie) {


        this.eid=eid;
        this.ename=ename;
        this.calorie=calorie;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid=eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename=ename;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(Integer calorie) {
        this.calorie=calorie;
    }

}

