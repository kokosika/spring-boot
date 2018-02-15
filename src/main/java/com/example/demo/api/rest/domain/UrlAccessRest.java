package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IUrlAccessBlo;
import com.example.demo.entity.domain.UrlAccess;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/url-access")
public class UrlAccessRest extends BaseRest<UrlAccess, Integer> {

    private final IUrlAccessBlo urlAccessBlo;

    /**
     * Inject blo
     *
     * @param urlAccessBlo interfaz blo
     */
    public UrlAccessRest(IUrlAccessBlo urlAccessBlo) {
        super(urlAccessBlo);
        this.urlAccessBlo = urlAccessBlo;
    }
}
