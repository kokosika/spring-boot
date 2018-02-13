package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IOperationDao;
import com.example.demo.entity.common.Operation;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class OperationDao extends BaseDao<Operation, Integer> implements IOperationDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public OperationDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
