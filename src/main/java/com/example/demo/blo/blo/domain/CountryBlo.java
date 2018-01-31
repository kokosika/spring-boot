package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.ICountryBlo;
import com.example.demo.dao.interfaces.domain.ICountryDao;
import com.example.demo.entity.domain.Country;
import com.example.demo.framework.blo.BaseDomainBlo;
import com.example.demo.framework.dao.IBaseDao;

public class CountryBlo extends BaseDomainBlo<Country,Integer> implements ICountryBlo {
    private final ICountryDao countryDao;

    /**
     * @param countryDao
     */
    public CountryBlo(ICountryDao countryDao) {
        super(countryDao);
        this.countryDao = countryDao;
    }
}
