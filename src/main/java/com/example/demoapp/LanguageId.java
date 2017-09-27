package com.example.demoapp;

public enum  LanguageId {
    ENGLISH (1, "en"),
    SPANISH (2, "es");

    private Integer id;
    private String abbr;

    LanguageId(Integer id,String abbr){
        this.id = id;
        this.abbr = abbr;
    }

    public Integer getId(){return id;}
    public String getAbbr(){return abbr;}

    public static LanguageId formId(Integer id){
        for(LanguageId I : values()){
            if(I.id.equals(id)){
                return I;
            }
        }
        throw new IllegalArgumentException();
    }

    public static LanguageId formAbbr(String abbr){
        for(LanguageId l: values()){
            if(l.abbr.toLowerCase().equals(abbr.toLowerCase())){
                return l;
            }
        }

        throw new IllegalArgumentException();
    }
}
