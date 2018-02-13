/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeEmployeeBlo;
import com.example.demo.dao.interfaces.domain.ITypeEmployeeDao;
import com.example.demo.entity.domain.TypeEmployee;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class TypeEmployeeBlo extends BaseDomainBlo<TypeEmployee, Integer> implements ITypeEmployeeBlo {

    private final ITypeEmployeeDao typeEmployeeDao;

    /**
     * Inject dao
     *
     * @param typeEmployeeDao base dao
     */
    public TypeEmployeeBlo(ITypeEmployeeDao typeEmployeeDao) {
        super(typeEmployeeDao);
        this.typeEmployeeDao = typeEmployeeDao;
    }

}
