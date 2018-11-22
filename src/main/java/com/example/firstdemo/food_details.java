package com.example.firstdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class food_details {

    @Id
    @GeneratedValue
    private Integer fid;
private String fname;
    private Double fats;
    private Double carbohydrate;
    private Double protein;
    private Double calorie;
    private Double saturatedfat;
    private Double polyunsaturatedfat;
    private Double monounsaturatedfat;
    private Double transfat;
    private Double cholestrol;
    private Double sodium;
    private Double potassium;
    private Double fibers;
    private Double sugar;
    private Double vitaminA;
    private Double vitaminC;
    private Double calcium;
    private Double iron;


    public food_details() {
    }

    public food_details(Double fats ,String fname, Double carbohydrate, Double protein, Double calorie, Double saturatedfat,
                        Double polyunsaturatedfat, Double monounsaturatedfat, Double transfat, Double cholestrol,
                        Double sodium, Double potassium, Double fibers, Double sugar, Double vitaminA, Double vitaminC,
                        Double calcium, Double iron)

    {
        this.fats=fats;
        this.carbohydrate=carbohydrate;
        this.protein=protein;
        this.calorie=calorie;
        this.saturatedfat=saturatedfat;
        this.polyunsaturatedfat=polyunsaturatedfat;
        this.monounsaturatedfat=monounsaturatedfat;
        this.transfat=transfat;
        this.cholestrol=cholestrol;
        this.sodium=sodium;
        this.potassium=potassium;
        this.fibers=fibers;
        this.sugar=sugar;
        this.vitaminA=vitaminA;
        this.vitaminC=vitaminC;
        this.calcium=calcium;
        this.iron=iron;
        this.fname=fname;
    }

    public Integer getFid()
    {
        return  fid;
    }
    public void setFid(Integer fid)
    {
        this.fid=fid;
    }


    public Double getIron() {
        return iron;
    }

    public void setIron(Double iron) {
        this.iron=iron;
    }
    public Double getCalcium() {
        return calcium;
    }

    public void setCalcium(Double calcium) {
        this.calcium=calcium;
    }
    public Double getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(Double vitaminA) {
        this.vitaminA=vitaminA;
    }
    public Double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(Double vitaminC) {
        this.vitaminC=vitaminC;
    }
    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar=sugar;
    }
    public Double getFibers() {
        return fibers;
    }

    public void setFibers(Double fibers) {
        this.fibers=fibers;
    }
    public Double getPotassium() {
        return potassium;
    }

    public void setPotassium(Double potassium) {
        this.potassium=potassium;
    }
    public Double getSodium() {
        return sodium;
    }

    public void setSodium(Double sodium) {
        this.sodium=sodium;
    }

    public Double getTransfat() {
        return transfat;
    }

    public void setTransfat(Double transfat) {
        this.transfat=transfat;
    }

    public Double getCholestrol() {
        return cholestrol;
    }

    public void setCholestrol(Double cholestrol) {
        this.cholestrol=cholestrol;
    }
    public Double getMonounsaturatedfat() {
        return monounsaturatedfat;
    }

    public void setMonounsaturatedfat(Double monounsaturatedfat) {
        this.monounsaturatedfat=monounsaturatedfat;
    }

    public Double getPolyunsaturatedfat() {
        return polyunsaturatedfat;
    }

    public void setPolyunsaturatedfat(Double polyunsaturatedfat) {
        this.polyunsaturatedfat=polyunsaturatedfat;
    }
    public Double getSaturatedfat() {
        return saturatedfat;
    }

    public void setSaturatedfat(Double saturatedfat) {
        this.saturatedfat=saturatedfat;
    }

    public Double getCalorie() {
        return calorie;
    }

    public void setCalorie(Double calorie) {
        this.calorie=calorie;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein=protein;
    }
    public Double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Double carbohydrate) {
        this.carbohydrate=carbohydrate;
    }
    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats=fats;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname=fname;
    }


}



