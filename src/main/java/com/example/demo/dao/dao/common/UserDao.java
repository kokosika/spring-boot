package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IUserDao;
import com.example.demo.entity.common.User;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class UserDao extends BaseDao<User, Integer> implements IUserDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public UserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
