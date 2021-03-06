 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package com.example.demo.entity.domain;

 import com.example.demo.entity.common.AccountAccess;
 import com.example.demo.framework.entity.BaseDomainEntity;
 import com.fasterxml.jackson.annotation.JsonIgnore;

 import javax.persistence.CascadeType;
 import javax.persistence.Entity;
 import javax.persistence.OneToMany;
 import java.util.Set;

 /**
  * @author fcortez
  */
 @Entity
 public class UrlAccess extends BaseDomainEntity {

     /**
      * @return the accountAccesses
      */
     public Set<AccountAccess> getAccountAccesses() {
         return accountAccesses;
     }

     /**
      * @param accountAccesses the accountAccesses to set
      */
     public void setAccountAccesses(Set<AccountAccess> accountAccesses) {
         this.accountAccesses = accountAccesses;
     }

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "urlAccess")
     @JsonIgnore
     private Set<AccountAccess> accountAccesses;

 }
