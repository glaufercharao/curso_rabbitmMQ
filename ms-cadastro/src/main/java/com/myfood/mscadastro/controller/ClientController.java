package com.myfood.mscadastro.controller;

import com.myfood.mscadastro.dto.ClientDto;
import com.myfood.mscadastro.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping
    public ResponseEntity<List<ClientDto>> findAllClient(){
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findAllClient());
    }

    @PostMapping
    public ResponseEntity<ClientDto> saveClient(@RequestBody ClientDto clientDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.saveClient(clientDto));
    }
}
