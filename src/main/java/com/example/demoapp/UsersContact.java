package com.example.demoapp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.context.annotation.Profile;

public class UsersContact {
    private Long id;
    private String universal_id;
    private String phone;
    private String email;
    private String location;
    private Integer language_id;

    public UsersContact(Long id, String universal_id, String phone, String email, String location, Integer language_id) {
        this.id = id;
        this.universal_id = universal_id;
        this.phone = phone;
        this.email = email;
        this.location = location;
        this.language_id = language_id;
    }
    public UsersContact() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversal_id() {
        return universal_id;
    }

    public void setUniversal_id(String universal_id) {
        this.universal_id = universal_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    @JsonIgnore
    public LanguageId getLanguageId() { return LanguageId.formId(language_id);
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    @Override
    public String toString() {
        //return String.format("%d, %s, %s, %d, %s, %s", getId(), getEmail(),getLocation(), getLanguage_id(), getPhone(), getUniversal_id());
        return "UserInfo {id:" + getId() + ", " +
                "email=" + getEmail() + "," +
                "location=" + getLocation() + "," +
                "language_id=" + getLanguage_id() + "," +
                "phone=" + getPhone()+"," +
                "universal_id="+getUniversal_id()+"}";
    }
    }



