package com.example.demoapp;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.UserCredentialsDataSourceAdapter;


import javax.sql.DataSource;
import java.io.IOException;

public class Greeting {

    private UserInfoService userInfoService;
    private BloodPressureEvaluationService bloodPressureEvaluationService;

    public Greeting(){}

    public Greeting(UserInfoService userInfoService,BloodPressureEvaluationService bloodPressureEvaluationService) {
        //this.id = id;
        //this.content = content;
        this.userInfoService = userInfoService;
        this.bloodPressureEvaluationService = bloodPressureEvaluationService;

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
        String[] arrayStr = new String[]{"Sistolic", Integer.toString(bp.getSystolic()), "Diastolic", Integer.toString(bp.getDiastolic()),"Critical"};
        ObjectMapper objectMapper = new ObjectMapper();
        String status = "Normal";


        switch (bloodPressureEvaluationService.getStatus(bp.getSystolic(),bp.getDiastolic())){
            case CRITICAL:
                str = String.format("BP:%d/%d is Critical",bp.getSystolic(),bp.getDiastolic());
                arrayStr = new String[]{"Sistolic",Integer.toString(bp.getSystolic()), "Diastolic", Integer.toString(bp.getDiastolic()),"Critical"};
                status = "Critical";
                break;
            case ELEVATED:
                str = String.format("BP:%d/%d is Evalated",bp.getSystolic(),bp.getDiastolic());
                arrayStr = new String[]{"Sistolic", Integer.toString(bp.getSystolic()), "Diastolic", Integer.toString(bp.getDiastolic()),"Evalated"};
                status = "Evalated";
                break;
            case NORMAL:
                str = String.format("BP:%d/%d is Normal",bp.getSystolic(),bp.getDiastolic());
                arrayStr = new String[]{"Sistolic", Integer.toString(bp.getSystolic()), "Diastolic", Integer.toString(bp.getDiastolic()),"Normal"};
                status = "Normal";
                break;
            default:
                status = "Normal";
        }

        try {
            return objectMapper.writeValueAsString(this.printdata(bp.getSystolic(),bp.getDiastolic(),status));
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

        PrintUtils printUtils = new PrintUtils();
        return  printUtils.print(arrayStr);
     }

    public UsersContact process(String universalId) throws IOException{
        return userInfoService.getUserContact(universalId);
    }

    public BloodPressureData printdata(Integer sistolic,Integer distolic,String status){
        BloodPressureData bloodPressureData = new BloodPressureData();
        bloodPressureData.setName("BP");
        bloodPressureData.setSistolic(sistolic);
        bloodPressureData.setDiastolic(distolic);
        bloodPressureData.setStatus(status);

    return bloodPressureData;
    }


}