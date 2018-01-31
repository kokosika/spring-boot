package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.ITypeUserBlo;
import com.example.demo.entity.domain.TypeUser;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/type-user")
public class TypeUserRest extends BaseRest<TypeUser,Integer> {

    private final ITypeUserBlo typeUserBlo;

    /**
     * Inject blo
     *
     * @param typeUserBlo interfaz blo
     */
    public TypeUserRest(ITypeUserBlo typeUserBlo) {
        super(typeUserBlo);
        this.typeUserBlo = typeUserBlo;
    }
}
