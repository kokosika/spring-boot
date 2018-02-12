package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IAccountDao;
import com.example.demo.entity.common.Account;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class AccountDao extends BaseDao<Account,Integer> implements IAccountDao {


    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public AccountDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
