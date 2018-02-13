/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.dao.interfaces.domain.IBrandDao;
import com.example.demo.entity.domain.Brand;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class BrandBlo extends BaseDomainBlo<Brand, Integer> implements IBrandBlo {

    private final IBrandDao brandDao;

    /**
     * Inject dao
     *
     * @param brandDao base dao
     */
    public BrandBlo(IBrandDao brandDao) {
        super(brandDao);
        this.brandDao = brandDao;
    }

}
