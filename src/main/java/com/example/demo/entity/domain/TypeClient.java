/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Client;
import com.example.demo.entity.common.Employee;
import com.example.demo.framework.entity.BaseDomainEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author fcortez
 */
@Entity
public class TypeClient extends BaseDomainEntity{

    /**
     * @return the clients
     */
    public Set<Client> getClients() {
        return clients;
    }

    /**
     * @param clients the clients to set
     */
    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "typeClient")
    @JsonIgnore
    private Set<Client> clients;
    
}
