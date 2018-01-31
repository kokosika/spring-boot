package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.IStatePersonDao;
import com.example.demo.entity.domain.StatePerson;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class StatePersonDao extends BaseDao<StatePerson,Integer> implements IStatePersonDao {


    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public StatePersonDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
