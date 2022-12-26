package com.app.h2db.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_details1")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "username")
    private String userName;


}
