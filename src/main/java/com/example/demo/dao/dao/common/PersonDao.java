package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IPersonDao;
import com.example.demo.entity.common.Person;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class PersonDao extends BaseDao<Person, Integer> implements IPersonDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public PersonDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
