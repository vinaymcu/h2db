package com.app.h2db.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

}
