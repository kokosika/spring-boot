package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IAccountBlo;
import com.example.demo.entity.common.Account;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/account")
public class AccountRest extends BaseRest<Account,Integer> {

    private final IAccountBlo accountBlo;

    /**
     * Inject blo
     *
     * @param accountBlo interfaz blo
     */
    public AccountRest(IAccountBlo accountBlo) {
        super(accountBlo);
        this.accountBlo = accountBlo;
    }
}
