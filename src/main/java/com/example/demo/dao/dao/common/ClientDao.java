package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IClientDao;
import com.example.demo.entity.common.Client;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class ClientDao extends BaseDao<Client,Integer> implements IClientDao {


    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public ClientDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
