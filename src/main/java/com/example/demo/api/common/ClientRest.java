package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IClientBlo;
import com.example.demo.entity.common.Client;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/client")
public class ClientRest extends BaseRest<Client, Integer> {

    private final IClientBlo clientBlo;

    /**
     * Inject blo
     *
     * @param clientBlo interfaz blo
     */
    public ClientRest(IClientBlo clientBlo) {
        super(clientBlo);
        this.clientBlo = clientBlo;
    }
}
