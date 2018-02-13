package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.ICountryDao;
import com.example.demo.entity.domain.Country;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class CountryDao extends BaseDao<Country, Integer> implements ICountryDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public CountryDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
