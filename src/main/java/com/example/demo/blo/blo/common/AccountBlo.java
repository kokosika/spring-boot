package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IAccountBlo;
import com.example.demo.dao.interfaces.common.IAccountDao;
import com.example.demo.entity.common.Account;
import com.example.demo.framework.blo.BaseBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

@Service
public class AccountBlo extends BaseBlo<Account,Integer> implements IAccountBlo {

    private final IAccountDao accountDao;

    /**
     * Inject dao
     *
     * @param accountDao base dao
     */
    public AccountBlo(IAccountDao accountDao) {
        super(accountDao);
        this.accountDao = accountDao;
    }
}
