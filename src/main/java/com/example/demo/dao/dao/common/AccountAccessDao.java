package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IAccounAccessDao;
import com.example.demo.entity.common.AccountAccess;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class AccountAccessDao extends BaseDao<AccountAccess,Integer> implements IAccounAccessDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public AccountAccessDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
