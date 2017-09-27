package com.example.demoapp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.IOException;
import java.util.Map;

public class BloodPressurePublisher {
    private String accessToken;
    private Integer systolic;
    private Integer diastolic;

    public BloodPressurePublisher(){}
    public BloodPressurePublisher(Integer systolic,Integer diastolic){
        //this.accessToken = accessToken;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public void setAccessToken(String accessToken){ this.accessToken = accessToken;}
    public void setSystolic(Integer systolic){ this.systolic = systolic;}
    public void setDiastolic(Integer diastolic){ this.diastolic = diastolic;}

    public String getAccessToken(){ return accessToken;}

    public Integer getSystolic() { return systolic;}

    public Integer getDiastolic() { return diastolic; }

    @JsonIgnore
    @Override
    public String toString() {
        return Mapper.toString(this);
    }

    public Map toMap(){
        try {
            return Mapper.toMapFromObject(this);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
