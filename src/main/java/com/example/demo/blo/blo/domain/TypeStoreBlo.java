/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeStoreBlo;
import com.example.demo.dao.interfaces.domain.ITypeStoreDao;
import com.example.demo.entity.domain.TypeStore;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class TypeStoreBlo extends BaseDomainBlo<TypeStore, Integer> implements ITypeStoreBlo {

    private final ITypeStoreDao typeStoreDao;

    /**
     * Inject dao
     *
     * @param typeStoreDao base dao
     */
    public TypeStoreBlo(ITypeStoreDao typeStoreDao) {
        super(typeStoreDao);
        this.typeStoreDao = typeStoreDao;
    }

}
