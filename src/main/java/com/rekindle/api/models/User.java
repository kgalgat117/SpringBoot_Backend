package com.rekindle.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private Long primaryPhone;
    private Boolean phoneVerified = false;
    private String primaryEmail;
    private Boolean emailVerified = false;
    private Integer onBoardProcessCount = 0;
    private Boolean userTutorialStatus = false;
    private String status = "active";
    private Location location;

    public User(Long primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public User() {
    }

    public User(String id, Long primaryPhone) {
        this.id = id;
        this.primaryPhone = primaryPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(Long primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public Boolean getPhoneVerified() {
        return phoneVerified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Integer getOnBoardProcessCount() {
        return onBoardProcessCount;
    }

    public void setOnBoardProcessCount(Integer onBoardProcessCount) {
        this.onBoardProcessCount = onBoardProcessCount;
    }

    public Boolean getUserTutorialStatus() {
        return userTutorialStatus;
    }

    public void setUserTutorialStatus(Boolean userTutorialStatus) {
        this.userTutorialStatus = userTutorialStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", primaryPhone=" + primaryPhone +
                '}';
    }
}
