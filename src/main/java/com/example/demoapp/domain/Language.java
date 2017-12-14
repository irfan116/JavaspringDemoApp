package com.example.demoapp.domain;

public enum Language {
    ENGLISH (1, "en"),
    SPANISH (2, "es"),
    FRENCH  (3, "fr");

    private Integer id;
    private String abbr;

    Language(Integer id, String abbr) {
        this.id = id;
        this.abbr = abbr;
    }

    public Integer getId() {
        return id;
    }

    public String getAbbr() {
        return abbr;
    }

    public static Language fromId(Integer id) {
        for(Language l : values()) {
            if(l.id.equals(id)) {
                return l;
            }
        }
        throw new IllegalArgumentException();
    }

    public static Language fromAbbr(String abbr) {
        for(Language l : values()) {
            if(l.abbr.toLowerCase().equals(abbr.toLowerCase())) {
                return l;
            }
        }
        throw new IllegalArgumentException();
    }
}
