package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.IStateUserDao;
import com.example.demo.entity.domain.StateUser;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class StateUserDao extends BaseDao<StateUser,Integer> implements IStateUserDao {


    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public StateUserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
