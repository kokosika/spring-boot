package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IStoreDao;
import com.example.demo.entity.common.Store;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class StroreDao extends BaseDao<Store, Integer> implements IStoreDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public StroreDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
