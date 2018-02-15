/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IRegionBlo;
import com.example.demo.entity.domain.Region;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "/api/region")
public class RegionRest extends BaseRest<Region, Integer> {

    private final IRegionBlo regionBlo;

    /**
     * @param regionBlo
     */
    public RegionRest(IRegionBlo regionBlo) {
        super(regionBlo);
        this.regionBlo = regionBlo;
    }

}
