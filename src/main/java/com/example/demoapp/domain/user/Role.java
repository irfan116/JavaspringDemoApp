package com.example.demoapp.domain.user;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Id;
import javax.persistence.Transient;

public enum Role {
    ADMINISTRATOR (1, "Admin"),
    BANNED (4, "Banned");

    @Id
    private Integer id;

    @Transient
    private String label;

    Role(Integer id,String label){
        this.id = id;
        this.label = label;
    }
    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    @JsonCreator
    public static Role getRoleFromId(Integer id) throws NoSuchFieldException {
        for(Role r : values()) {
            if(r.getId().equals(id)) {
                return r;
            }
        }
        throw new NoSuchFieldException();
    }

    public static Role getRoleFromLabel(String label) throws NoSuchFieldException {
        for(Role r : values()) {
            if(r.getLabel().equals(label)) {
                return r;
            }
        }
        throw new NoSuchFieldException();
    }

}
