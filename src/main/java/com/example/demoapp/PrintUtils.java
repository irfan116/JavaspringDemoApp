package com.example.demoapp;

import com.cedarsoftware.util.io.JsonWriter;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.ir.debug.JSONWriter;

public class PrintUtils {
    private static final ObjectMapper om = new ObjectMapper();

    public String print(Object object){
        String result = "";
        try {
            result = JsonWriter.formatJson(om.writerWithDefaultPrettyPrinter().writeValueAsString(object));
            System.out.println(JsonWriter.formatJson(result));
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return result;
    }
}
