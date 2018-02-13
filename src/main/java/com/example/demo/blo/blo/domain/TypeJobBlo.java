/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.blo.interfaces.domain.ITypeJobBlo;
import com.example.demo.dao.interfaces.domain.IBrandDao;
import com.example.demo.dao.interfaces.domain.ITypeJobDao;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.TypeJob;
import com.example.demo.framework.blo.BaseDomainBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class TypeJobBlo extends BaseDomainBlo<TypeJob, Integer> implements ITypeJobBlo{
    
    private final ITypeJobDao typeJobDao;
    
    /**
     * Inject dao
     *
     * @param typeJobDao base dao
     */
    public TypeJobBlo(ITypeJobDao typeJobDao) {
        super(typeJobDao);
        this.typeJobDao = typeJobDao;
    }
    
}
