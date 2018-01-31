package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.IStatePersonBlo;
import com.example.demo.entity.domain.StatePerson;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/state-person")
public class StatePersonRest extends BaseRest<StatePerson,Integer> {

    private final IStatePersonBlo statePersonBlo;


    /**
     * Inject blo
     *
     * @param statePersonBlo interfaz blo
     */
    public StatePersonRest(IStatePersonBlo statePersonBlo) {
        super(statePersonBlo);
        this.statePersonBlo = statePersonBlo;
    }
}
