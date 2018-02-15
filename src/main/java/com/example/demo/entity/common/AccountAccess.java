/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.UrlAccess;
import com.example.demo.framework.entity.BaseDomainEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author fcortez
 */

@Entity
public class AccountAccess extends BaseDomainEntity {

    /**
     * @return the urlAccess
     */
    public UrlAccess getUrlAccess() {
        return urlAccess;
    }

    /**
     * @param urlAccess the urlAccess to set
     */
    public void setUrlAccess(UrlAccess urlAccess) {
        this.urlAccess = urlAccess;
    }

    /**
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UrlAccess urlAccess;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account account;

}
