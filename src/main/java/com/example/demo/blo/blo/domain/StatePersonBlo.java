package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IStatePersonBlo;
import com.example.demo.dao.interfaces.domain.IStatePersonDao;
import com.example.demo.entity.domain.StatePerson;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

@Service
public class StatePersonBlo extends BaseDomainBlo<StatePerson, Integer> implements IStatePersonBlo {

    private final IStatePersonDao statePersonDao;


    /**
     * @param statePersonDao
     */
    public StatePersonBlo(IStatePersonDao statePersonDao) {
        super(statePersonDao);
        this.statePersonDao = statePersonDao;
    }
}
