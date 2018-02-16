/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.IStateAccountDao;
import com.example.demo.entity.domain.StateAccount;
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
public class StateAccountDao extends BaseDao<StateAccount, Integer> implements IStateAccountDao {

    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public StateAccountDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
