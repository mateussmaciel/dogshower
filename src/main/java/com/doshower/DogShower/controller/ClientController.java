package com.doshower.DogShower.controller;

import com.doshower.DogShower.model.client;
import com.doshower.DogShower.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/client")
    public client getClient(){
        client clients = clientRepository.findByCpfClient("444.444.444-67");
        return clients;
    }
}
