/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IProductBlo;
import com.example.demo.dao.interfaces.common.IProductDao;
import com.example.demo.entity.common.Product;
import com.example.demo.framework.blo.BaseBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class ProductBlo extends BaseBlo<Product, Integer> implements IProductBlo{
    
    private final IProductDao productDao;
    
    /**
     * Inject dao
     *
     * @param productDao base dao
     */
    public ProductBlo(IProductDao productDao) {
        super(productDao);
        this.productDao = productDao;
    }
    
}
