package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IStateUserBlo;
import com.example.demo.entity.domain.StateUser;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/state-user")
public class StateUserRest extends BaseRest<StateUser, Integer> {


    private final IStateUserBlo stateUserBlo;


    /**
     * Inject blo
     *
     * @param stateUserBlo interfaz blo
     */
    public StateUserRest(IStateUserBlo stateUserBlo) {
        super(stateUserBlo);
        this.stateUserBlo = stateUserBlo;
    }
}
