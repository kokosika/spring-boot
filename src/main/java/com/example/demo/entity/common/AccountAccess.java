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

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UrlAccess urlAccess;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account account;

    public UrlAccess getUrlAccess() {
        return urlAccess;
    }

    public void setUrlAccess(UrlAccess urlAccess) {
        this.urlAccess = urlAccess;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
