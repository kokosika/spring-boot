package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IUrlAccessBlo;
import com.example.demo.dao.interfaces.domain.IUrlAccessDao;
import com.example.demo.entity.domain.UrlAccess;
import com.example.demo.framework.blo.BaseDomainBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

@Service
public class UrlAccessBlo extends BaseDomainBlo<UrlAccess,Integer> implements IUrlAccessBlo {

    private final IUrlAccessDao urlAccessDao;

    /**
     * @param urlAccessDao
     */
    public UrlAccessBlo(IUrlAccessDao urlAccessDao) {
        super(urlAccessDao);
        this.urlAccessDao = urlAccessDao;
    }
}
