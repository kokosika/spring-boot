/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.IBrandDao;
import com.example.demo.dao.interfaces.domain.ITypeDocumentDao;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.TypeDocument;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fcortez
 */

@Repository
@EnableAutoConfiguration
@Transactional
public class TypeDocumentDao extends BaseDao<TypeDocument, Integer> implements ITypeDocumentDao {

    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public TypeDocumentDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
