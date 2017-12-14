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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != null ? !getId().equals(user.getId()) : user.getId() != null) return false;
        if (getUsername() != null ? !getUsername().equals(user.getUsername()) : user.getUsername() != null)
            return false;
        if (!getEmail().equals(user.getEmail())) return false;
        if (getLocation() != null ? !getLocation().equals(user.getLocation()) : user.getLocation() != null)
            return false;
        if (getNotify_me_personal_message() != null ? !getNotify_me_personal_message().equals(user.getNotify_me_personal_message()) : user.getNotify_me_personal_message() != null)
            return false;
        if (getReceive_personal_messages() != null ? !getReceive_personal_messages().equals(user.getReceive_personal_messages()) : user.getReceive_personal_messages() != null)
            return false;
        if (getBanned_from_sending_personal_messages() != null ? !getBanned_from_sending_personal_messages().equals(user.getBanned_from_sending_personal_messages()) : user.getBanned_from_sending_personal_messages() != null)
            return false;
        if (getBoxUser() != null ? !getBoxUser().equals(user.getBoxUser()) : user.getBoxUser() != null) return false;
        if (getRedirect_to() != null ? !getRedirect_to().equals(user.getRedirect_to()) : user.getRedirect_to() != null)
            return false;
        if (getCreated_at() != null ? !getCreated_at().equals(user.getCreated_at()) : user.getCreated_at() != null)
            return false;
        if (getUpdated_at() != null ? !getUpdated_at().equals(user.getUpdated_at()) : user.getUpdated_at() != null)
            return false;
        if (getRecruited_at() != null ? !getRecruited_at().equals(user.getRecruited_at()) : user.getRecruited_at() != null)
            return false;
        if (getLast_login() != null ? !getLast_login().equals(user.getLast_login()) : user.getLast_login() != null)
            return false;
        if (getFtue() != null ? !getFtue().equals(user.getFtue()) : user.getFtue() != null) return false;
        if (getProgressftue() != null ? !getProgressftue().equals(user.getProgressftue()) : user.getProgressftue() != null)
            return false;
        if (getAppointmentftue() != null ? !getAppointmentftue().equals(user.getAppointmentftue()) : user.getAppointmentftue() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(user.getPhone()) : user.getPhone() != null) return false;
        if (getNotify_via_email() != null ? !getNotify_via_email().equals(user.getNotify_via_email()) : user.getNotify_via_email() != null)
            return false;
        if (getNotify_via_sms() != null ? !getNotify_via_sms().equals(user.getNotify_via_sms()) : user.getNotify_via_sms() != null)
            return false;
        if (getDob() != null ? !getDob().equals(user.getDob()) : user.getDob() != null) return false;
        if (getGender() != null ? !getGender().equals(user.getGender()) : user.getGender() != null) return false;
        if (getRace() != null ? !getRace().equals(user.getRace()) : user.getRace() != null) return false;
        if (getEthnicity() != null ? !getEthnicity().equals(user.getEthnicity()) : user.getEthnicity() != null)
            return false;
        if (getMarital_status() != null ? !getMarital_status().equals(user.getMarital_status()) : user.getMarital_status() != null)
            return false;
        if (getLanguage() != null ? !getLanguage().equals(user.getLanguage()) : user.getLanguage() != null)
            return false;
        if (getFamily_size() != null ? !getFamily_size().equals(user.getFamily_size()) : user.getFamily_size() != null)
            return false;
        if (getUniversalId() != null ? !getUniversalId().equals(user.getUniversalId()) : user.getUniversalId() != null)
            return false;
        if (getWithings_key() != null ? !getWithings_key().equals(user.getWithings_key()) : user.getWithings_key() != null)
            return false;
        if (getWithings_secret() != null ? !getWithings_secret().equals(user.getWithings_secret()) : user.getWithings_secret() != null)
            return false;
        if (getUnsubscribe_hash() != null ? !getUnsubscribe_hash().equals(user.getUnsubscribe_hash()) : user.getUnsubscribe_hash() != null)
            return false;
        if (getWithings_id() != null ? !getWithings_id().equals(user.getWithings_id()) : user.getWithings_id() != null)
            return false;
        if (getLast_emailed_at() != null ? !getLast_emailed_at().equals(user.getLast_emailed_at()) : user.getLast_emailed_at() != null)
            return false;
        if (getLast_texted_at() != null ? !getLast_texted_at().equals(user.getLast_texted_at()) : user.getLast_texted_at() != null)
            return false;
        if (getQuestionaire_token() != null ? !getQuestionaire_token().equals(user.getQuestionaire_token()) : user.getQuestionaire_token() != null)
            return false;
        if (getLast_kick_email_at() != null ? !getLast_kick_email_at().equals(user.getLast_kick_email_at()) : user.getLast_kick_email_at() != null)
            return false;
        if (getIs_real() != null ? !getIs_real().equals(user.getIs_real()) : user.getIs_real() != null) return false;
        if (getIhealth_id() != null ? !getIhealth_id().equals(user.getIhealth_id()) : user.getIhealth_id() != null)
            return false;
        if (getIhealth_token() != null ? !getIhealth_token().equals(user.getIhealth_token()) : user.getIhealth_token() != null)
            return false;
        if (getIhealth_rt() != null ? !getIhealth_rt().equals(user.getIhealth_rt()) : user.getIhealth_rt() != null)
            return false;
        if (getShipment_type() != null ? !getShipment_type().equals(user.getShipment_type()) : user.getShipment_type() != null)
            return false;
        if (getTracking_id() != null ? !getTracking_id().equals(user.getTracking_id()) : user.getTracking_id() != null)
            return false;
        if (getTracking_status() != null ? !getTracking_status().equals(user.getTracking_status()) : user.getTracking_status() != null)
            return false;
        if (getTracker_status() != null ? !getTracker_status().equals(user.getTracker_status()) : user.getTracker_status() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(user.getStatus()) : user.getStatus() != null) return false;
        if (getExtended_status() != null ? !getExtended_status().equals(user.getExtended_status()) : user.getExtended_status() != null)
            return false;
        if (getBodytrace_id() != null ? !getBodytrace_id().equals(user.getBodytrace_id()) : user.getBodytrace_id() != null)
            return false;
        if (getArchive_reason() != null ? !getArchive_reason().equals(user.getArchive_reason()) : user.getArchive_reason() != null)
            return false;
        if (getArchive_date() != null ? !getArchive_date().equals(user.getArchive_date()) : user.getArchive_date() != null)
            return false;
        if (getPassword_reset_link_expiry() != null ? !getPassword_reset_link_expiry().equals(user.getPassword_reset_link_expiry()) : user.getPassword_reset_link_expiry() != null)
            return false;
        if (getTimeZoneName() != null ? !getTimeZoneName().equals(user.getTimeZoneName()) : user.getTimeZoneName() != null)
            return false;
        if (getIs_chronic() != null ? !getIs_chronic().equals(user.getIs_chronic()) : user.getIs_chronic() != null)
            return false;
        if (getTracking_updated_at() != null ? !getTracking_updated_at().equals(user.getTracking_updated_at()) : user.getTracking_updated_at() != null)
            return false;
        if (getLast_activity() != null ? !getLast_activity().equals(user.getLast_activity()) : user.getLast_activity() != null)
            return false;
        if (getPrimary_location() != null ? !getPrimary_location().equals(user.getPrimary_location()) : user.getPrimary_location() != null)
            return false;
        if (getBp_cuff_device() != null ? !getBp_cuff_device().equals(user.getBp_cuff_device()) : user.getBp_cuff_device() != null)
            return false;
        if (getAppointment_screen() != null ? !getAppointment_screen().equals(user.getAppointment_screen()) : user.getAppointment_screen() != null)
            return false;
        if (getIs_mod() != null ? !getIs_mod().equals(user.getIs_mod()) : user.getIs_mod() != null) return false;
        if (getIs_test() != null ? !getIs_test().equals(user.getIs_test()) : user.getIs_test() != null) return false;
        if (getMrn() != null ? !getMrn().equals(user.getMrn()) : user.getMrn() != null) return false;
        if (getReason_exculsion() != null ? !getReason_exculsion().equals(user.getReason_exculsion()) : user.getReason_exculsion() != null)
            return false;
        if (getOpenfire_username() != null ? !getOpenfire_username().equals(user.getOpenfire_username()) : user.getOpenfire_username() != null)
            return false;
        if (getOpenfire_password() != null ? !getOpenfire_password().equals(user.getOpenfire_password()) : user.getOpenfire_password() != null)
            return false;
        if (getOptimized_schedule() != null ? !getOptimized_schedule().equals(user.getOptimized_schedule()) : user.getOptimized_schedule() != null)
            return false;
        if (getBpftue() != null ? !getBpftue().equals(user.getBpftue()) : user.getBpftue() != null) return false;
        if (getIs_chat() != null ? !getIs_chat().equals(user.getIs_chat()) : user.getIs_chat() != null) return false;
        if (getComments() != null ? !getComments().equals(user.getComments()) : user.getComments() != null)
            return false;
        if (language_id != user.language_id) return false;
        return getScale() != null ? getScale().equals(user.getScale()) : user.getScale() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getNotify_me_personal_message() != null ? getNotify_me_personal_message().hashCode() : 0);
        result = 31 * result + (getReceive_personal_messages() != null ? getReceive_personal_messages().hashCode() : 0);
        result = 31 * result + (getBanned_from_sending_personal_messages() != null ? getBanned_from_sending_personal_messages().hashCode() : 0);
        result = 31 * result + (getBoxUser() != null ? getBoxUser().hashCode() : 0);
        result = 31 * result + (getRedirect_to() != null ? getRedirect_to().hashCode() : 0);
        result = 31 * result + (getCreated_at() != null ? getCreated_at().hashCode() : 0);
        result = 31 * result + (getUpdated_at() != null ? getUpdated_at().hashCode() : 0);
        result = 31 * result + (getRecruited_at() != null ? getRecruited_at().hashCode() : 0);
        result = 31 * result + (getLast_login() != null ? getLast_login().hashCode() : 0);
        result = 31 * result + (getFtue() != null ? getFtue().hashCode() : 0);
        result = 31 * result + (getProgressftue() != null ? getProgressftue().hashCode() : 0);
        result = 31 * result + (getAppointmentftue() != null ? getAppointmentftue().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getNotify_via_email() != null ? getNotify_via_email().hashCode() : 0);
        result = 31 * result + (getNotify_via_sms() != null ? getNotify_via_sms().hashCode() : 0);
        result = 31 * result + (getDob() != null ? getDob().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getRace() != null ? getRace().hashCode() : 0);
        result = 31 * result + (getEthnicity() != null ? getEthnicity().hashCode() : 0);
        result = 31 * result + (getMarital_status() != null ? getMarital_status().hashCode() : 0);
        result = 31 * result + (getLanguage() != null ? getLanguage().hashCode() : 0);
        result = 31 * result + (getFamily_size() != null ? getFamily_size().hashCode() : 0);
        result = 31 * result + (getUniversalId() != null ? getUniversalId().hashCode() : 0);
        result = 31 * result + (getWithings_key() != null ? getWithings_key().hashCode() : 0);
        result = 31 * result + (getWithings_secret() != null ? getWithings_secret().hashCode() : 0);
        result = 31 * result + (getUnsubscribe_hash() != null ? getUnsubscribe_hash().hashCode() : 0);
        result = 31 * result + (getWithings_id() != null ? getWithings_id().hashCode() : 0);
        result = 31 * result + (getLast_emailed_at() != null ? getLast_emailed_at().hashCode() : 0);
        result = 31 * result + (getLast_texted_at() != null ? getLast_texted_at().hashCode() : 0);
        result = 31 * result + (getQuestionaire_token() != null ? getQuestionaire_token().hashCode() : 0);
        result = 31 * result + (getLast_kick_email_at() != null ? getLast_kick_email_at().hashCode() : 0);
        result = 31 * result + (getIs_real() != null ? getIs_real().hashCode() : 0);
        result = 31 * result + (getIhealth_id() != null ? getIhealth_id().hashCode() : 0);
        result = 31 * result + (getIhealth_token() != null ? getIhealth_token().hashCode() : 0);
        result = 31 * result + (getIhealth_rt() != null ? getIhealth_rt().hashCode() : 0);
        result = 31 * result + (getShipment_type() != null ? getShipment_type().hashCode() : 0);
        result = 31 * result + (getTracking_id() != null ? getTracking_id().hashCode() : 0);
        result = 31 * result + (getTracking_status() != null ? getTracking_status().hashCode() : 0);
        result = 31 * result + (getTracker_status() != null ? getTracker_status().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getExtended_status() != null ? getExtended_status().hashCode() : 0);
        result = 31 * result + (getBodytrace_id() != null ? getBodytrace_id().hashCode() : 0);
        result = 31 * result + (getArchive_reason() != null ? getArchive_reason().hashCode() : 0);
        result = 31 * result + (getArchive_date() != null ? getArchive_date().hashCode() : 0);
        result = 31 * result + (getPassword_reset_link_expiry() != null ? getPassword_reset_link_expiry().hashCode() : 0);
        result = 31 * result + (getTimeZoneName() != null ? getTimeZoneName().hashCode() : 0);
        result = 31 * result + (getIs_chronic() != null ? getIs_chronic().hashCode() : 0);
        result = 31 * result + (getTracking_updated_at() != null ? getTracking_updated_at().hashCode() : 0);
        result = 31 * result + (getLast_activity() != null ? getLast_activity().hashCode() : 0);
        result = 31 * result + (getPrimary_location() != null ? getPrimary_location().hashCode() : 0);
        result = 31 * result + (getBp_cuff_device() != null ? getBp_cuff_device().hashCode() : 0);
        result = 31 * result + (getAppointment_screen() != null ? getAppointment_screen().hashCode() : 0);
        result = 31 * result + (getIs_mod() != null ? getIs_mod().hashCode() : 0);
        result = 31 * result + (getIs_test() != null ? getIs_test().hashCode() : 0);
        result = 31 * result + (getMrn() != null ? getMrn().hashCode() : 0);
        result = 31 * result + (getReason_exculsion() != null ? getReason_exculsion().hashCode() : 0);
        result = 31 * result + (getOpenfire_username() != null ? getOpenfire_username().hashCode() : 0);
        result = 31 * result + (getOpenfire_password() != null ? getOpenfire_password().hashCode() : 0);
        result = 31 * result + (getOptimized_schedule() != null ? getOptimized_schedule().hashCode() : 0);
        result = 31 * result + (getBpftue() != null ? getBpftue().hashCode() : 0);
        result = 31 * result + (getIs_chat() != null ? getIs_chat().hashCode() : 0);
        result = 31 * result + (getComments() != null ? getComments().hashCode() : 0);
        result = 31 * result + (language_id != null ? language_id.hashCode() : 0);
        result = 31 * result + (getScale() != null ? getScale().hashCode() : 0);
        return result;
    }

}
