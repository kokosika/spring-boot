package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypePersonBlo;
import com.example.demo.dao.interfaces.domain.ITypePersonDao;
import com.example.demo.entity.domain.TypePerson;
import com.example.demo.framework.blo.BaseDomainBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

@Service
public class TypePersonBlo extends BaseDomainBlo<TypePerson,Integer> implements ITypePersonBlo {

    private final ITypePersonDao typePersonDao;

    /**
     * @param typePersonDao
     */
    public TypePersonBlo(ITypePersonDao typePersonDao) {
        super(typePersonDao);
        this.typePersonDao = typePersonDao;
    }
}
