package com.example.demoapp.domain.user;

import com.example.demoapp.domain.Language;
import com.example.demoapp.domain.util.LanguageConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Integer id;

    private String username;

    private String email;

    private String location;

    private Boolean notify_me_personal_message;

    private Boolean receive_personal_messages;

    private Boolean banned_from_sending_personal_messages;

    private Boolean boxUser;

    private String redirect_to;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private LocalDateTime recruited_at;

    private LocalDateTime last_login;

    private Boolean ftue;

    private Boolean progressftue;

    private Boolean appointmentftue;

    private String phone;

    private Boolean notify_via_email;

    private Boolean notify_via_sms;

    private Date dob;

    private String gender;

    private String race;

    private String ethnicity;

    private String marital_status;

    private String language;

    private Integer family_size;

    @Column(name = "universal_id",columnDefinition = "char(36)")
    private String universalId;

    private String withings_key;

    private String withings_secret;

    private String unsubscribe_hash;

    private Integer withings_id;

    private LocalDateTime last_emailed_at;

    private LocalDateTime last_texted_at;

    private String questionaire_token;

    private LocalDateTime last_kick_email_at;

    private Boolean is_real;

    private String ihealth_id;

    private String ihealth_token;

    private String ihealth_rt;

    private String shipment_type;

    private String tracking_id;

    private String tracking_status;

    private Integer tracker_status;

    private Integer status;

    private Integer extended_status;

    private String bodytrace_id;

    private String archive_reason;

    private LocalDateTime archive_date;

    private LocalDateTime password_reset_link_expiry;

    @Column(name="timezonename")
    private String timeZoneName;

    private Boolean is_chronic;

    private LocalDateTime tracking_updated_at;

    private LocalDateTime last_activity;

    private Integer primary_location;

    private String bp_cuff_device;

    private Boolean appointment_screen;

    private Boolean is_mod;

    private Boolean is_test;

    private String mrn;

    private String reason_exculsion;

    private String openfire_username;

    private String openfire_password;

    private Boolean optimized_schedule;

    private Boolean bpftue;

    private Boolean is_chat;

    @Column(name="comments", columnDefinition = "text")
    private String comments;

    @Convert(converter=LanguageConverter.class)
    private Language language_id;

    private Byte scale;

    private String insurance = "N/A";

    private Boolean intakeAssessmentAssigned;

    private String emailHash = "N/A";

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Boolean getBoxUser() {
        return boxUser;
    }

    public User setBoxUser(Boolean boxUser) {
        this.boxUser = boxUser;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public User setLocation(String location) {
        this.location = location;
        return this;
    }

    public Boolean getNotify_me_personal_message() {
        return notify_me_personal_message;
    }

    public User setNotify_me_personal_message(Boolean notify_me_personal_message) {
        this.notify_me_personal_message = notify_me_personal_message;
        return this;
    }

    public Boolean getReceive_personal_messages() {
        return receive_personal_messages;
    }

    public User setReceive_personal_messages(Boolean receive_personal_messages) {
        this.receive_personal_messages = receive_personal_messages;
        return this;
    }

    public Boolean getBanned_from_sending_personal_messages() {
        return banned_from_sending_personal_messages;
    }

    public User setBanned_from_sending_personal_messages(Boolean banned_from_sending_personal_messages) {
        this.banned_from_sending_personal_messages = banned_from_sending_personal_messages;
        return this;
    }

    public String getRedirect_to() {
        return redirect_to;
    }

    public User setRedirect_to(String redirect_to) {
        this.redirect_to = redirect_to;
        return this;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public User setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
        return this;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public User setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public LocalDateTime getRecruited_at() {
        return recruited_at;
    }

    public User setRecruited_at(LocalDateTime recruited_at) {
        this.recruited_at = recruited_at;
        return this;
    }

    public LocalDateTime getLast_login() {
        return last_login;
    }

    public User setLast_login(LocalDateTime last_login) {
        this.last_login = last_login;
        return this;
    }

    public Boolean getFtue() {
        return ftue;
    }

    public User setFtue(Boolean ftue) {
        this.ftue = ftue;
        return this;
    }

    public Boolean getProgressftue() {
        return progressftue;
    }

    public User setProgressftue(Boolean progressftue) {
        this.progressftue = progressftue;
        return this;
    }

    public Boolean getAppointmentftue() {
        return appointmentftue;
    }

    public User setAppointmentftue(Boolean appointmentftue) {
        this.appointmentftue = appointmentftue;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Boolean getNotify_via_email() {
        return notify_via_email;
    }

    public User setNotify_via_email(Boolean notify_via_email) {
        this.notify_via_email = notify_via_email;
        return this;
    }

    public Boolean getNotify_via_sms() {
        return notify_via_sms;
    }

    public User setNotify_via_sms(Boolean notify_via_sms) {
        this.notify_via_sms = notify_via_sms;
        return this;
    }

    public Date getDob() {
        return dob;
    }

    public User setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getRace() {
        return race;
    }

    public User setRace(String race) {
        this.race = race;
        return this;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public User setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public User setMarital_status(String marital_status) {
        this.marital_status = marital_status;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public User setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Integer getFamily_size() {
        return family_size;
    }

    public User setFamily_size(Integer family_size) {
        this.family_size = family_size;
        return this;
    }

    public String getUniversalId() {
        return universalId;
    }

    public User setUniversalId(String universalId) {
        this.universalId = universalId;
        return this;
    }

    public String getWithings_key() {
        return withings_key;
    }

    public User setWithings_key(String withings_key) {
        this.withings_key = withings_key;
        return this;
    }

    public String getWithings_secret() {
        return withings_secret;
    }

    public User setWithings_secret(String withings_secret) {
        this.withings_secret = withings_secret;
        return this;
    }

    public String getUnsubscribe_hash() {
        return unsubscribe_hash;
    }

    public User setUnsubscribe_hash(String unsubscribe_hash) {
        this.unsubscribe_hash = unsubscribe_hash;
        return this;
    }

    public Integer getWithings_id() {
        return withings_id;
    }

    public User setWithings_id(Integer withings_id) {
        this.withings_id = withings_id;
        return this;
    }

    public LocalDateTime getLast_emailed_at() {
        return last_emailed_at;
    }

    public User setLast_emailed_at(LocalDateTime last_emailed_at) {
        this.last_emailed_at = last_emailed_at;
        return this;
    }

    public LocalDateTime getLast_texted_at() {
        return last_texted_at;
    }

    public User setLast_texted_at(LocalDateTime last_texted_at) {
        this.last_texted_at = last_texted_at;
        return this;
    }

    public String getQuestionaire_token() {
        return questionaire_token;
    }

    public User setQuestionaire_token(String questionaire_token) {
        this.questionaire_token = questionaire_token;
        return this;
    }

    public LocalDateTime getLast_kick_email_at() {
        return last_kick_email_at;
    }

    public User setLast_kick_email_at(LocalDateTime last_kick_email_at) {
        this.last_kick_email_at = last_kick_email_at;
        return this;
    }

    public Boolean getIs_real() {
        return is_real;
    }

    public User setIs_real(Boolean is_real) {
        this.is_real = is_real;
        return this;
    }

    public String getIhealth_id() {
        return ihealth_id;
    }

    public User setIhealth_id(String ihealth_id) {
        this.ihealth_id = ihealth_id;
        return this;
    }

    public String getIhealth_token() {
        return ihealth_token;
    }

    public User setIhealth_token(String ihealth_token) {
        this.ihealth_token = ihealth_token;
        return this;
    }

    public String getIhealth_rt() {
        return ihealth_rt;
    }

    public User setIhealth_rt(String ihealth_rt) {
        this.ihealth_rt = ihealth_rt;
        return this;
    }

    public String getShipment_type() {
        return shipment_type;
    }

    public User setShipment_type(String shipment_type) {
        this.shipment_type = shipment_type;
        return this;
    }

    public String getTracking_id() {
        return tracking_id;
    }

    public User setTracking_id(String tracking_id) {
        this.tracking_id = tracking_id;
        return this;
    }

    public String getTracking_status() {
        return tracking_status;
    }

    public User setTracking_status(String tracking_status) {
        this.tracking_status = tracking_status;
        return this;
    }

    public Integer getTracker_status() {
        return tracker_status;
    }

    public User setTracker_status(Integer tracker_status) {
        this.tracker_status = tracker_status;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public User setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getExtended_status() {
        return extended_status;
    }

    public User setExtended_status(Integer extended_status) {
        this.extended_status = extended_status;
        return this;
    }

    public String getBodytrace_id() {
        return bodytrace_id;
    }

    public User setBodytrace_id(String bodytrace_id) {
        this.bodytrace_id = bodytrace_id;
        return this;
    }

    public String getArchive_reason() {
        return archive_reason;
    }

    public User setArchive_reason(String archive_reason) {
        this.archive_reason = archive_reason;
        return this;
    }

    public LocalDateTime getArchive_date() {
        return archive_date;
    }

    public User setArchive_date(LocalDateTime archive_date) {
        this.archive_date = archive_date;
        return this;
    }

    public LocalDateTime getPassword_reset_link_expiry() {
        return password_reset_link_expiry;
    }

    public User setPassword_reset_link_expiry(LocalDateTime password_reset_link_expiry) {
        this.password_reset_link_expiry = password_reset_link_expiry;
        return this;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public User setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
        return this;
    }

    public Boolean getIs_chronic() {
        return is_chronic;
    }

    public User setIs_chronic(Boolean is_chronic) {
        this.is_chronic = is_chronic;
        return this;
    }

    public LocalDateTime getTracking_updated_at() {
        return tracking_updated_at;
    }

    public User setTracking_updated_at(LocalDateTime tracking_updated_at) {
        this.tracking_updated_at = tracking_updated_at;
        return this;
    }

    public LocalDateTime getLast_activity() {
        return last_activity;
    }

    public User setLast_activity(LocalDateTime last_activity) {
        this.last_activity = last_activity;
        return this;
    }

    public Integer getPrimary_location() {
        return primary_location;
    }

    public User setPrimary_location(Integer primary_location) {
        this.primary_location = primary_location;
        return this;
    }

    public String getBp_cuff_device() {
        return bp_cuff_device;
    }

    public User setBp_cuff_device(String bp_cuff_device) {
        this.bp_cuff_device = bp_cuff_device;
        return this;
    }

    public Boolean getAppointment_screen() {
        return appointment_screen;
    }

    public User setAppointment_screen(Boolean appointment_screen) {
        this.appointment_screen = appointment_screen;
        return this;
    }

    public Boolean getIs_mod() {
        return is_mod;
    }

    public User setIs_mod(Boolean is_mod) {
        this.is_mod = is_mod;
        return this;
    }

    public Boolean getIs_test() {
        return is_test;
    }

    public User setIs_test(Boolean is_test) {
        this.is_test = is_test;
        return this;
    }

    public String getMrn() {
        return mrn;
    }

    public User setMrn(String mrn) {
        this.mrn = mrn;
        return this;
    }

    public String getReason_exculsion() {
        return reason_exculsion;
    }

    public User setReason_exculsion(String reason_exculsion) {
        this.reason_exculsion = reason_exculsion;
        return this;
    }

    public String getOpenfire_username() {
        return openfire_username;
    }

    public User setOpenfire_username(String openfire_username) {
        this.openfire_username = openfire_username;
        return this;
    }

    public String getOpenfire_password() {
        return openfire_password;
    }

    public User setOpenfire_password(String openfire_password) {
        this.openfire_password = openfire_password;
        return this;
    }

    public Boolean getOptimized_schedule() {
        return optimized_schedule;
    }

    public User setOptimized_schedule(Boolean optimized_schedule) {
        this.optimized_schedule = optimized_schedule;
        return this;
    }

    public Boolean getBpftue() {
        return bpftue;
    }

    public User setBpftue(Boolean bpftue) {
        this.bpftue = bpftue;
        return this;
    }

    public Boolean getIs_chat() {
        return is_chat;
    }

    public User setIs_chat(Boolean is_chat) {
        this.is_chat = is_chat;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public User setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Language getLanguageId() {
        return language_id;
    }

    public User setLanguageId(Language language_id) {
        this.language_id = language_id;
        return this;
    }

    public Byte getScale() {
        return scale;
    }

    public User setScale(Byte scale) {
        this.scale = scale;
        return this;
    }

    public String getInsurance() {
        return insurance;
    }

    public User setInsurance(String insurance) {
        this.insurance = insurance;
        return this;
    }

    public Boolean getIntakeAssessmentAssigned() {
        return intakeAssessmentAssigned;
    }

    public User setIntakeAssessmentAssigned(Boolean intakeAssessmentAssigned) {
        this.intakeAssessmentAssigned = intakeAssessmentAssigned;
        return this;
    }

    public String getEmailHash() {
        return emailHash;
    }

    public User setEmailHash(String emailHash) {
        this.emailHash = emailHash;
        return this;
    }


}
