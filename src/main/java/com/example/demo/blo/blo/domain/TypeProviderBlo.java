/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeProviderBlo;
import com.example.demo.dao.interfaces.domain.ITypeProviderDao;
import com.example.demo.entity.domain.TypeProvider;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class TypeProviderBlo extends BaseDomainBlo<TypeProvider, Integer> implements ITypeProviderBlo {

    private final ITypeProviderDao typeProviderDao;

    /**
     * Inject dao
     *
     * @param typeProviderDao base dao
     */
    public TypeProviderBlo(ITypeProviderDao typeProviderDao) {
        super(typeProviderDao);
        this.typeProviderDao = typeProviderDao;
    }

}
