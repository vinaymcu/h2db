package com.app.h2db.model;


public class Account {
    public String getPwAccountId() {
        return pwAccountId;
    }

    public void setPwAccountId(String pwAccountId) {
        this.pwAccountId = pwAccountId;
    }

    public String getLinkTokenId() {
        return linkTokenId;
    }

    public void setLinkTokenId(String linkTokenId) {
        this.linkTokenId = linkTokenId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private String pwAccountId;
    private String linkTokenId;
    private String accountType;

}
