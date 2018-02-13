/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IProductBlo;
import com.example.demo.entity.common.Product;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import java.io.Serializable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/product")
public class ProductRest extends BaseRest<Product, Integer>{
    
    private final IProductBlo productBlo;
    
    /**
     * Inject blo
     *
     * @param productBlo interfaz blo
     */
    public ProductRest(IProductBlo productBlo) {
        super(productBlo);
        this.productBlo = productBlo;
    }
    
}
