package com.rekindle.api.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private Long primaryPhone;

    public User() {
    }

    public User(Long primaryPhone) {
        this.primaryPhone = primaryPhone;
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

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", primaryPhone=" + primaryPhone +
                '}';
    }
}
