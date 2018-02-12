package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IUserBlo;
import com.example.demo.entity.common.User;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/user")
public class UserRest extends BaseRest<User,Integer> {

    private final IUserBlo userBlo;

    /**
     * Inject blo
     *
     * @param userBlo interfaz blo
     */
    public UserRest(IUserBlo userBlo) {
        super(userBlo);
        this.userBlo = userBlo;
    }
}
