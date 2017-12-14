package com.example.demoapp.domain.user;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Id;
import javax.persistence.Transient;

public enum Role {
    ADMINISTRATOR (4, "Administrator"),
    BANNED (3, "Banned"),
    CALL_CENTER (11, "Call Center"),
    CLIENT_ADMIN (8, "Client Admin"),
    PATIENT (2, "Patient"),
    PROVIDER (6, "Provider"),
    REPORTING_ANALYST (9, "Reporting Analyst"),
    RN (7, "RN"),
    SHIPPING_ANALYST (10, "Shipping Analyst"),
    SUPER_ADMINISTRATOR (1, "Super Administrator"),
    POPULATION_HEALTH_ANALYST (13, "Populatation health Analyst"),
    BENEFITS_MANAGER (14, "Benefits Manager");

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
