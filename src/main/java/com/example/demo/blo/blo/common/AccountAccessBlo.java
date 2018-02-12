package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IAccountAccessBlo;
import com.example.demo.dao.interfaces.common.IAccounAccessDao;
import com.example.demo.entity.common.AccountAccess;
import com.example.demo.framework.blo.BaseBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

@Service
public class AccountAccessBlo extends BaseBlo<AccountAccess,Integer> implements IAccountAccessBlo {

    private final IAccounAccessDao accounAccessDao;

    /**
     * Inject dao
     *
     * @param accounAccessDao base dao
     */
    public AccountAccessBlo(IAccounAccessDao accounAccessDao) {
        super(accounAccessDao);
        this.accounAccessDao= accounAccessDao;
    }
}
