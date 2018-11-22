package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class consumption_details {

    @Id
    @GeneratedValue
    private Integer consumpid;
    private Integer fid;

    private Date datee;
    private Integer cid;
    private Integer calories;
    private String email;

    public consumption_details() {
    }

    public consumption_details(Integer fid, Date datee, Integer cid, Integer calories, String email) {
        this.fid=fid;
        this.datee=datee;
        this.cid=cid;
        this.calories=calories;
        this.email=email;
    }

    public Integer getConsumpid() {
        return consumpid;
    }

    public void setConsumpid(Integer consumpid) {
        this.consumpid=consumpid;
    }
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid=fid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid=cid;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories=calories;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee=datee;
    }




}



