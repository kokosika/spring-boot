package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IUserBlo;
import com.example.demo.dao.interfaces.common.IUserDao;
import com.example.demo.entity.common.User;
import com.example.demo.framework.blo.BaseBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

@Service
public class UserBlo extends BaseBlo<User,Integer> implements IUserBlo {

    private final IUserDao userDao;

    /**
     * Inject dao
     *
     * @param userDao base dao
     */
    public UserBlo(IUserDao userDao) {
        super(userDao);
        this.userDao=userDao;
    }
}
