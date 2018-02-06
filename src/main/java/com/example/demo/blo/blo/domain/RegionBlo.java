 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IRegionBlo;
import com.example.demo.dao.interfaces.domain.IRegionDao;
import com.example.demo.entity.domain.Region;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class RegionBlo extends BaseDomainBlo<Region, Integer> implements IRegionBlo{
    
    private final IRegionDao regionDao;
    
    /**
     * 
     * @param regionDao 
     */
    public RegionBlo(IRegionDao regionDao) {
        super(regionDao);
        this.regionDao = regionDao;
    }
    
}
