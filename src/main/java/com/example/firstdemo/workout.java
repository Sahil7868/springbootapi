package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class workout {

    @Id
    @GeneratedValue
    private Integer wid;
    private Integer eid;
    private Integer calories;
private Date datee;
    private String email;

    public workout() {
    }

    public workout(String email, Date datee, Integer wid, Integer eid, Integer calories) {
        this.email=email;
        this.datee=datee;
        this.wid=wid;
        this.eid=eid;
        this.calories=calories;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid=wid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid=eid;
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


