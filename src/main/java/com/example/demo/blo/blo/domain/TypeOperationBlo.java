/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeOperationBlo;
import com.example.demo.dao.interfaces.domain.ITypeOperationDao;
import com.example.demo.entity.domain.TypeOperation;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class TypeOperationBlo extends BaseDomainBlo<TypeOperation, Integer> implements ITypeOperationBlo {

    private final ITypeOperationDao typeOperationDao;

    /**
     * Inject dao
     *
     * @param typeOperationDao base dao
     */
    public TypeOperationBlo(ITypeOperationDao typeOperationDao) {
        super(typeOperationDao);
        this.typeOperationDao = typeOperationDao;
    }

}
