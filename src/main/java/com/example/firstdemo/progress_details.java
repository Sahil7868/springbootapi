package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class progress_details {

    @Id
    @GeneratedValue
    private Integer pid;
    private Double measurement ;
    private Date datee;
    private Integer tid;
    private String email;

    public progress_details() {
    }

    public progress_details(String email, Date datee, Double measurement, Integer tid) {
        this.email=email;
        this.measurement=measurement;
        this.datee=datee;
        this.tid=tid;

    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid=pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid=tid;
    }

    public Double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Double measurement) {
        this.measurement=measurement;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee=datee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }
}

