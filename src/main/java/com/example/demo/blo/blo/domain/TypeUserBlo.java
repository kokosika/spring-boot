package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ITypeUserBlo;
import com.example.demo.dao.interfaces.domain.ITypeUserDao;
import com.example.demo.entity.domain.TypeUser;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

@Service
public class TypeUserBlo extends BaseDomainBlo<TypeUser, Integer> implements ITypeUserBlo {

    private final ITypeUserDao typeUserDao;

    /**
     * @param typeUserDao
     */
    public TypeUserBlo(ITypeUserDao typeUserDao) {
        super(typeUserDao);
        this.typeUserDao = typeUserDao;
    }
}
