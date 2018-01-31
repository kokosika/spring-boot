package com.example.demo.dao.dao.domain;

import com.example.demo.dao.interfaces.domain.ITypePersonDao;
import com.example.demo.entity.domain.TypePerson;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@EnableAutoConfiguration
@Transactional
public class TypePersonDao extends BaseDao<TypePerson,Integer> implements ITypePersonDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public TypePersonDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
