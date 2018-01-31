package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.ICountryBlo;
import com.example.demo.entity.domain.Country;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/country")
public class CountryRest extends BaseRest<Country,Integer> {
    private final ICountryBlo countryBlo;

    /**
     * Inject blo
     *
     * @param countryBlo interfaz blo
     */
    public CountryRest(ICountryBlo countryBlo) {
        super(countryBlo);
        this.countryBlo = countryBlo;
    }
}
