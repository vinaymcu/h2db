package com.app.h2db.entity;

//import lombok.Data;

import java.io.Serializable;

//@Data
public class EmployeePhoneId implements Serializable {
    private Employee employee;
    private String phone;

    public EmployeePhoneId() {

    }
}
