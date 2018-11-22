package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class user_details {

    @Id
    private String email;

    private String uname;
    private String password;
    private Double height;
    private Double weight;
    private Integer activity_level;
    private String goal;
    private Integer budget;
    private Integer frequency;
    private String gender;
    private Double bmi;
    private Date dob;
    private Double goalweight ;
    private Double goalperweek;
    private Integer role;
    public user_details() {
    }

    public user_details(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public user_details(Integer role,String email, String uname, String password, Integer activity_level, String goal, String gender, Double height,
                        Double weight, Double bmi, Integer budget, Integer frequency, Date dob, Double goalweight, Double goalperweek  ) {

        this.email=email;
        this.uname = uname;
        this.password=password;
        this.activity_level=activity_level;
        this.goal=goal;
        this.gender=gender;
        this.height=height;
        this.weight=weight;
        this.bmi=bmi;
        this.budget=budget;
        this.frequency=frequency;
        this.dob=dob;
        this.goalweight=goalweight;
        this.goalperweek=goalperweek;
        this.role=role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname=uname;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public Integer getActivity_level() {
        return activity_level;
    }

    public void setActivity_level(Integer activity_level) {
        this.activity_level=activity_level;
    }
    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal=goal;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height=height;
    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight=weight;
    }
    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi=bmi;
    }
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget=budget;
    }
    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency=frequency;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob=dob;
    }

    public Double getGoalweight() {
        return goalweight;
    }

    public void setGoalweight(Double goalweight) {
        this.goalweight=goalweight;
    }

    public Double getGoalperweek() {
        return goalperweek;
    }

    public void setGoalperweek(Double goalperweek) {
        this.goalperweek=goalperweek;
    }

    public Integer getRole(){
        return role;
    }

    public void setRole(Integer role) {
        this.role=role;
    }




}
