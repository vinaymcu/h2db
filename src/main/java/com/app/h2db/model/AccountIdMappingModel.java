package com.app.h2db.model;

import javax.persistence.Column;

public class AccountIdMappingModel {


    private String linkTokenId;
    private String platformAccountId;
    private String platformAccountType;
    private String platformAccountStatus;
    private String interactionId;
    private Integer platformRoutingNumber;
    private String partyId;
    private String serviceType;
    private String processingStatus;

    public String getLinkTokenId() {
        return linkTokenId;
    }

    public void setLinkTokenId(String linkTokenId) {
        this.linkTokenId = linkTokenId;
    }

    public String getPlatformAccountId() {
        return platformAccountId;
    }

    public void setPlatformAccountId(String platformAccountId) {
        this.platformAccountId = platformAccountId;
    }

    public String getPlatformAccountType() {
        return platformAccountType;
    }

    public void setPlatformAccountType(String platformAccountType) {
        this.platformAccountType = platformAccountType;
    }

    public String getPlatformAccountStatus() {
        return platformAccountStatus;
    }

    public void setPlatformAccountStatus(String platformAccountStatus) {
        this.platformAccountStatus = platformAccountStatus;
    }

    public String getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(String interactionId) {
        this.interactionId = interactionId;
    }

    public Integer getPlatformRoutingNumber() {
        return platformRoutingNumber;
    }

    public void setPlatformRoutingNumber(Integer platformRoutingNumber) {
        this.platformRoutingNumber = platformRoutingNumber;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }


}
