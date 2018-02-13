/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.domain;

/**
 * @author fcortez
 */

import com.example.demo.blo.interfaces.domain.ICategoryBlo;
import com.example.demo.entity.domain.Category;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/category")
public class CategoryRest extends BaseRest<Category, Integer> {

    private final ICategoryBlo categoryBlo;

    /**
     * Inject blo
     *
     * @param categoryBlo interfaz blo
     */
    public CategoryRest(ICategoryBlo categoryBlo) {
        super(categoryBlo);
        this.categoryBlo = categoryBlo;
    }

}
