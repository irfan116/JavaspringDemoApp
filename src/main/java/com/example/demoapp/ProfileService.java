package com.example.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfileService {
    private Environment environment;

    @Autowired
    public ProfileService(Environment environment) {
        this.environment = environment;
    }

    public String getEnv(){
        List profiles = Arrays.asList(environment.getActiveProfiles());
        if(profiles.contains("local")){
            return "local";
        }else if (profiles.contains("demo")){
            return "demo";
        }else if (profiles.contains("staging")){
            return "staging";
        }

        throw new IllegalArgumentException("No environment property found in the environment");
    }

    public String getProperty(String name){
        return environment.getProperty(name);
    }
}
