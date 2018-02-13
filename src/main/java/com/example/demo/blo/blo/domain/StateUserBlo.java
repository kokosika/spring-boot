package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IStateUserBlo;
import com.example.demo.dao.interfaces.domain.IStateUserDao;
import com.example.demo.entity.domain.StateUser;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

@Service
public class StateUserBlo extends BaseDomainBlo<StateUser, Integer> implements IStateUserBlo {


    private final IStateUserDao stateUserDao;

    /**
     * @param stateUserDao
     */
    public StateUserBlo(IStateUserDao stateUserDao) {
        super(stateUserDao);
        this.stateUserDao = stateUserDao;
    }
}
