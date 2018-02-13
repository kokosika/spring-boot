package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.IUrlAccessDao;
import com.example.demo.entity.domain.UrlAccess;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class UrlAccessDao extends BaseDao<UrlAccess, Integer> implements IUrlAccessDao {


    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public UrlAccessDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
