/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.ITownBlo;
import com.example.demo.entity.domain.Town;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcortez
 */
@RestController
@RequestMapping(value = "/api/town")
public class TownRest extends BaseRest<Town, Integer>{
    
    private final ITownBlo townBlo;
    
    /**
     * 
     * @param townBlo 
     */
    public TownRest(ITownBlo townBlo) {
        super(townBlo);
        this.townBlo = townBlo;
    }
    
}
