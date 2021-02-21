package com.rekindle.api.user;

public class User {
    private String _id;
    private Long primaryPhone;

    public User() {
    }

    public User(Long primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public User(String _id, Long primaryPhone) {
        this._id = _id;
        this.primaryPhone = primaryPhone;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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
                "_id='" + _id + '\'' +
                ", primaryPhone=" + primaryPhone +
                '}';
    }
}
