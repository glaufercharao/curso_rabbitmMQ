package com.myfood.mscadastro.services;

import com.myfood.mscadastro.dto.ClientDto;
import com.myfood.mscadastro.mapper.Mappable;
import com.myfood.mscadastro.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements Mappable {


    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDto saveClient(ClientDto clientDto){
        return null;
    }
}
