/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IProviderBlo;
import com.example.demo.dao.interfaces.common.IProviderDao;
import com.example.demo.entity.common.Provider;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class ProviderBlo extends BaseBlo<Provider, Integer> implements IProviderBlo {

    private final IProviderDao providerDao;

    /**
     * Inject dao
     *
     * @param providerDao base dao
     */
    public ProviderBlo(IProviderDao providerDao) {
        super(providerDao);
        this.providerDao = providerDao;
    }

}
