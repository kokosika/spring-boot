/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IProvinceBlo;
import com.example.demo.dao.interfaces.domain.IProvinceDao;
import com.example.demo.entity.domain.Province;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class ProvinceBlo extends BaseDomainBlo<Province, Integer> implements IProvinceBlo {

    private final IProvinceDao provinceDao;

    /**
     * @param provinceDao
     */
    public ProvinceBlo(IProvinceDao provinceDao) {
        super(provinceDao);
        this.provinceDao = provinceDao;
    }

}
