package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IPersonBlo;
import com.example.demo.entity.common.Person;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/person")
public class PersonRest extends BaseRest<Person,Integer> {

    private final IPersonBlo personBlo;

    /**
     * Inject blo
     *
     * @param personBlo interfaz blo
     */
    public PersonRest(IPersonBlo personBlo) {
        super(personBlo);
        this.personBlo = personBlo;
    }
}
