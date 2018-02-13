package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IPersonBlo;
import com.example.demo.dao.interfaces.common.IPersonDao;
import com.example.demo.entity.common.Person;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class PersonBlo extends BaseBlo<Person, Integer> implements IPersonBlo {

    private final IPersonDao personDao;

    /**
     * Inject dao
     *
     * @param personDao base dao
     */
    public PersonBlo(IPersonDao personDao) {
        super(personDao);
        this.personDao = personDao;
    }
}
