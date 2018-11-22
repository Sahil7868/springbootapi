package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class type {

    @Id
    @GeneratedValue
    private Integer tid;
    private String tname;



    public type() {
    }

    public type(String tname) {

      this.tname=tname;

    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid=tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTid(String tname) {
        this.tname=tname;
    }



}


