/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ICategoryBlo;
import com.example.demo.dao.interfaces.domain.ICategoryDao;
import com.example.demo.entity.domain.Category;
import com.example.demo.framework.blo.BaseDomainBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class CategoryBlo extends BaseDomainBlo<Category, Integer> implements ICategoryBlo {
    
    private final ICategoryDao categoryDao;
    
    /**
     * Inject dao
     *
     * @param categoryDao base dao
     */
    public CategoryBlo(ICategoryDao categoryDao) {
        super(categoryDao);
        this.categoryDao = categoryDao;
    }
    
}
