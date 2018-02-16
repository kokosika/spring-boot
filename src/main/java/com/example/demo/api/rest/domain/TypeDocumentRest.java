/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.ITypeDocumentBlo;
import com.example.demo.entity.domain.TypeDocument;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/type-document")
public class TypeDocumentRest extends BaseRest<TypeDocument, Integer> {

    private final ITypeDocumentBlo typeDocumentBlo;

    /**
     * Inject blo
     *
     * @param typeDocumentBlo interfaz blo
     */
    public TypeDocumentRest(ITypeDocumentBlo typeDocumentBlo) {
        super(typeDocumentBlo);
        this.typeDocumentBlo = typeDocumentBlo;
    }


}
