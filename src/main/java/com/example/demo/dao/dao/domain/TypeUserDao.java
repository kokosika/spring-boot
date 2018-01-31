package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.ITypeUserDao;
import com.example.demo.entity.domain.TypeUser;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class TypeUserDao extends BaseDao<TypeUser,Integer> implements ITypeUserDao {

    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public TypeUserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
