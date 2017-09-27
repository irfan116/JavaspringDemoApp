package com.example.demoapp;

import org.joda.time.DateTime;

public class MysqlInfo {
    private String providerId;

    private String clinicName;
    private String locationName;
    private LanguageId languageId;
    private String mrn;
    private DateTime dob;
    private DateTime edd;

    public MysqlInfo(String providerId,String clinicName, String locationName,LanguageId languageId,String mrn, DateTime dob, DateTime edd){
        this.providerId = providerId;
        this.clinicName = clinicName;
        this.locationName = locationName;
        this.languageId = languageId;
        this.dob = dob;
        this.edd = edd;
        this.mrn = mrn;
    }

    public String getClinicName(){ return clinicName;}
    public String getLocationName() {return locationName;}
    public String getProviderId() {return providerId;}

    public DateTime getDob() { return dob; }
    public DateTime getEdd() { return edd; }
    public LanguageId getLanguageId(){ return languageId;}
    public String getMrn(){return mrn;}
}
