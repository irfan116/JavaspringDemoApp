package com.example.demoapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Mapper {
    public static final ObjectMapper mapper = new ObjectMapper();

    public static Map toMap(String str) throws IOException{
        return mapper.readValue(str,Map.class);
    }

    public static Map toMapFromObject(Object obj) throws IOException{
        return mapper.convertValue(obj, Map.class);
    }

    public static String toString(Object in){
        try {
            return mapper.writeValueAsString(in);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }
}
