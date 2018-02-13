package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IAccountAccessBlo;
import com.example.demo.entity.common.AccountAccess;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/account-access")
public class AccountAccessRest extends BaseRest<AccountAccess, Integer> {

    private final IAccountAccessBlo accountAccessBlo;

    /**
     * Inject blo
     *
     * @param accountAccessBlo interfaz blo
     */
    public AccountAccessRest(IAccountAccessBlo accountAccessBlo) {
        super(accountAccessBlo);
        this.accountAccessBlo = accountAccessBlo;
    }
}
