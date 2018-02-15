package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.ITypePersonBlo;
import com.example.demo.entity.domain.TypePerson;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/type-person")
public class TypePersonRest extends BaseRest<TypePerson, Integer> {

    private final ITypePersonBlo typePersonBlo;

    /**
     * Inject blo
     *
     * @param typePersonBlo interfaz blo
     */
    public TypePersonRest(ITypePersonBlo typePersonBlo) {
        super(typePersonBlo);
        this.typePersonBlo = typePersonBlo;
    }
}
