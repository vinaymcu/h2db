/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.h2db.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author 003H4T744
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "account_identifier")
    private int accountIdentifier;

    @Column(name = "link_token_id")
    private String linkTokenId;

    @Column(name = "pw_account_id")
    private String pwAccountId;

    public String getPwAccountId() {
        return pwAccountId;
    }

    public void setPwAccountId(String pwAccountId) {
        this.pwAccountId = pwAccountId;
    }


    @OneToMany(mappedBy = "pwAccountId", fetch = FetchType.LAZY)
    private List<AccountIdMapping> accountIdMappingList;

    public Account() {
    }


    public String getLinkTokenId() {
        return linkTokenId;
    }

    public void setLinkTokenId(String linkTokenId) {
        this.linkTokenId = linkTokenId;
    }

    public List<AccountIdMapping> getAccountIdMappingList() {
        return accountIdMappingList;
    }

    public void setAccountIdMappingList(List<AccountIdMapping> accountIdMappingList) {
        this.accountIdMappingList = accountIdMappingList;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (accountPK != null ? accountPK.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Account)) {
//            return false;
//        }
//        Account other = (Account) object;
//        if ((this.accountPK == null && other.accountPK != null) || (this.accountPK != null && !this.accountPK.equals(other.accountPK))) {
//            return false;
//        }
//        return true;
//    }


}
