/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeDocumentBlo;
import com.example.demo.dao.interfaces.domain.ITypeDocumentDao;
import com.example.demo.entity.domain.TypeDocument;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class TypeDocumentBlo extends BaseDomainBlo<TypeDocument, Integer> implements ITypeDocumentBlo {

    private final ITypeDocumentDao typeDocumentDao;

    /**
     * Inject dao
     *
     * @param typeDocumentDao base dao
     */
    public TypeDocumentBlo(ITypeDocumentDao typeDocumentDao) {
        super(typeDocumentDao);
        this.typeDocumentDao = typeDocumentDao;
    }

}
