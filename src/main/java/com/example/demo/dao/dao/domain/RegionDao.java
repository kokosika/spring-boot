/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.IRegionDao;
import com.example.demo.entity.domain.Region;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fcortez
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class RegionDao extends BaseDao<Region, Integer> implements IRegionDao{
    
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public RegionDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
