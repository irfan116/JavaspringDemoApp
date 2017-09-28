package com.example.demoapp;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.UserCredentialsDataSourceAdapter;


import javax.sql.DataSource;
import java.io.IOException;

public class Greeting {

    private final long id;
    private final String content;
    private UserInfoService userInfoService;
    private BloodPressureEvaluationService bloodPressureEvaluationService;


    public Greeting(long id, String content, UserInfoService userInfoService,BloodPressureEvaluationService bloodPressureEvaluationService) {
        this.id = id;
        this.content = content;
        this.userInfoService = userInfoService;
        this.bloodPressureEvaluationService = bloodPressureEvaluationService;

    }



    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


    public String userInfo(String universalid) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String info = mapper.writeValueAsString(this.process(universalid));
        //return this.process(universalid).toString();
        return info;
    }
    // test

    public String showBP(BloodPressurePublisher bp){
        String str = String.format("%d,%d",bp.getSystolic(),bp.getDiastolic());
        switch (bloodPressureEvaluationService.getStatus(bp.getSystolic(),bp.getDiastolic())){
            case CRITICAL:
                str = String.format("BP:%d/%d is Critical",bp.getSystolic(),bp.getDiastolic());
                break;
            case ELEVATED:
                str = String.format("BP:%d/%d is Evalated",bp.getSystolic(),bp.getDiastolic());
                break;
            case NORMAL:
                str = String.format("BP:%d/%d is Evalated",bp.getSystolic(),bp.getDiastolic());
                break;
        }
        //return String.format("%d,%d",bp.getSystolic(),bp.getDiastolic();
        return str;
    }

    public UsersContact process(String universalId) throws IOException{
        return userInfoService.getUserContact(universalId);
    }


}