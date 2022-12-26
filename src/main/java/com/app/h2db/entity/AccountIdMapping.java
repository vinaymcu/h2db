/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.h2db.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 003H4T744
 */
@Entity
@Table(name = "account_id_mapping")
public class AccountIdMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mapping_id")
    private Integer mappingId;
    @Column(name = "link_token_id")
    private String linkTokenId;
    @Column(name = "platform_account_id")
    private String platformAccountId;
    @Column(name = "platform_account_type")
    private String platformAccountType;
    @Column(name = "platform_account_status")
    private String platformAccountStatus;
//    @Column(name = "interaction_Id")
//    private String interactionId;
    @Column(name = "platform_routing_number")
    private Integer platformRoutingNumber;
    @Column(name = "party_id")
    private String partyId;
    @Column(name = "service_type")
    private String serviceType;
    @Column(name = "processing_status")
    private String processingStatus;
    @JoinColumn(name = "pw_account_id", referencedColumnName = "pw_account_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account pwAccountId;

    public AccountIdMapping() {
    }

    public AccountIdMapping(Integer mappingId) {
        this.mappingId = mappingId;
    }

    public Integer getMappingId() {
        return mappingId;
    }

    public void setMappingId(Integer mappingId) {
        this.mappingId = mappingId;
    }

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

//    public String getInteractionId() {
//        return interactionId;
//    }
//
//    public void setInteractionId(String interactionId) {
//        this.interactionId = interactionId;
//    }

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

    public Account getPwAccountId() {
        return pwAccountId;
    }

    public void setPwAccountId(Account pwAccountId) {
        this.pwAccountId = pwAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mappingId != null ? mappingId.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AccountIdMapping{" +
                "mappingId=" + mappingId +
                ", linkTokenId='" + linkTokenId + '\'' +
                ", platformAccountId='" + platformAccountId + '\'' +
                ", platformAccountType='" + platformAccountType + '\'' +
                ", platformAccountStatus='" + platformAccountStatus + '\'' +
                ", platformRoutingNumber=" + platformRoutingNumber +
                ", partyId='" + partyId + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", processingStatus='" + processingStatus + '\'' +
                ", pwAccountId=" + pwAccountId +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountIdMapping)) {
            return false;
        }
        AccountIdMapping other = (AccountIdMapping) object;
        if ((this.mappingId == null && other.mappingId != null) || (this.mappingId != null && !this.mappingId.equals(other.mappingId))) {
            return false;
        }
        return true;
    }


}
