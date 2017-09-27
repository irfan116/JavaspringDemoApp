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


    public Greeting(long id, String content, UserInfoService userInfoService) {
        this.id = id;
        this.content = content;
        this.userInfoService = userInfoService;

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

    public String showBP(BloodPressurePublisher bp){
        Integer systolic = bp.getSystolic();
        Integer diastolic = bp.getDiastolic();
        return String.format("%d,%d",systolic,diastolic);
    }

    public UsersContact process(String universalId) throws IOException{
        return userInfoService.getUserContact(universalId);
    }


}