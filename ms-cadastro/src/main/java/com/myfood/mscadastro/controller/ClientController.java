package com.myfood.mscadastro.controller;

import com.myfood.mscadastro.dto.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @GetMapping
    public ResponseEntity<ClientDto> findAllClient(){
        return null;
    }

    @PostMapping
    public ResponseEntity<ClientDto> saveClient(@RequestBody ClientDto clientDto){
        return null;
    }
}
