package com.example.demoapp;

public class BloodPressureData {
    private String name;
    private int sistolic;
    private int diastolic;
    private String status;

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public void setSistolic(int sistolic) {
        this.sistolic = sistolic;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public int getSistolic() {
        return sistolic;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
