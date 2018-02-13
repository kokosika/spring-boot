package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IEmployeeStoreDao;
import com.example.demo.entity.common.EmployeeStore;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class EmployeeStoreDao extends BaseDao<EmployeeStore, Integer> implements IEmployeeStoreDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public EmployeeStoreDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
