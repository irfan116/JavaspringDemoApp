package com.example.demoapp.domain.user;


import javax.persistence.*;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@NamedQuery(name = "query_find_all_groups", query = "select g from Group g")
@Table(name = "groups")
public class Group implements GroupListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(PROPERTY)
    private Integer id;

    private String groupName;// Not perfect!! Should be a proper object!

    @Column(name = "short_code",columnDefinition = "char(2)")
    private char[] shortCode;// Not perfect!! An enum should be a better choice!

    private String emergencyEmail;

    private Integer enableBoxDefault;

    private Integer enableMessages;

    private String customImage;

    @Column(name="triage_phone", columnDefinition = "char(100)")
    private String triagePhone;

    @Column(name="emergency_fax", columnDefinition = "char(10)")
    private String emergencyFax;

    private String timezone;

    private Integer hasAlt;

    private String altEmergencyEmail;

    @Column(name="alt_triage_phone", columnDefinition = "char(100)")
    private String altTriagePhone;

    @Column(name="alt_emergency_fax", columnDefinition = "char(10)")
    private String altEmergencyFax;

    private String triageDays;

    private String triageOpenHours;

    private String triageCloseHours;

    @Column(name="invite_code", columnDefinition = "char(10)")
    private String inviteCode;

    private String hash;

    private String customImage2;

    private String prefPrenatalProgram;

    private String prefBirthingClass;

    private String hospitalRegistrationLink;

    private String virtualHospitalTour;

    private String preffPediatriciansLink;

    private Boolean agreeTriggers;

    private Boolean ama;

    private Boolean bmi;

    private Boolean diabetes;

    private Boolean cHypertension;

    private Boolean anticoagulation;

    private Boolean andoridIphone;

    private Boolean pregMultiple;

    private Boolean speakEnglish;

    private Boolean gestation;

    private String otherGest;

    private Boolean step;

    private Integer isMod;

    private Integer status;

    private Boolean newOnBoarding;

    private Boolean showGraphType;

    private Boolean enableMrn;

    private String awsApiKey;

    @Column(name="redox_identifier", columnDefinition = "varchar(63)")
    private String redoxIdentifier;

   // @Column(name="language_id")
    //@Convert(converter = LanguageConverter.class)
   // private Language language;

    private byte scheduleOptimization;

    private byte careNavigation;

    private byte bodytraceId;

    private byte clientType;

    protected Group() {
    }

    public Group(String name) {
        super();
        this.groupName = name;
    }

    @Override
    public Integer getId(){
        return this.id;
    }

    public Group setId(Integer id){
        this.id = id;
        return  this;
    }
    public char[] getShortCode() {
        return shortCode;
    }

    public Group setShortCode(char[] shortCode) {
        this.shortCode = shortCode;
        return this;
    }

    @Override
    public String getGroupName() {
        return groupName;
    }

}
