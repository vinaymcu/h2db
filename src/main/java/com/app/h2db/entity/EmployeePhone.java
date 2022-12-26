package com.app.h2db.entity;

//import lombok.Getter;
//import lombok.Setter;

import javax.persistence.*;

//@Getter @Setter
@Entity
@IdClass(EmployeePhoneId.class)
public class EmployeePhone {
    @ManyToOne
    @PrimaryKeyJoinColumn
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getPrimary() {
        return isPrimary;
    }

    public void setPrimary(Boolean primary) {
        isPrimary = primary;
    }

    @Id
    private String phone;

    private Boolean isPrimary;

    public EmployeePhone() {
    }

    public EmployeePhone(String phone, Boolean isPrimary) {
        this.phone = phone;
        this.isPrimary = isPrimary;
    }

}
