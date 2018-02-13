/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITownBlo;
import com.example.demo.dao.interfaces.domain.ITownDao;
import com.example.demo.entity.domain.Town;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class TownBlo extends BaseDomainBlo<Town, Integer> implements ITownBlo {

    private final ITownDao townDao;

    /**
     * @param townDao
     */
    public TownBlo(ITownDao townDao) {
        super(townDao);
        this.townDao = townDao;
    }

}
