package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IClientBlo;
import com.example.demo.dao.interfaces.common.IClientDao;
import com.example.demo.entity.common.Client;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class ClientBlo extends BaseBlo<Client, Integer> implements IClientBlo {

    private final IClientDao clientDao;

    /**
     * Inject dao
     *
     * @param clientDao base dao
     */
    public ClientBlo(IClientDao clientDao) {
        super(clientDao);
        this.clientDao = clientDao;
    }
}
