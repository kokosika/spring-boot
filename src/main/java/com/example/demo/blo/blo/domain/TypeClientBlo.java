/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeClientBlo;
import com.example.demo.dao.interfaces.domain.ITypeClientDao;
import com.example.demo.entity.domain.TypeClient;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class TypeClientBlo extends BaseDomainBlo<TypeClient, Integer> implements ITypeClientBlo{
    
    private final ITypeClientDao typeClientDao;
    
    /**
     * Inject dao
     *
     * @param typeClientDao base dao
     */
    public TypeClientBlo(ITypeClientDao typeClientDao) {
        super(typeClientDao);
        this.typeClientDao = typeClientDao;
    }
    
}
