package com.doshower.DogShower.controller;

import com.doshower.DogShower.model.client;
import com.doshower.DogShower.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    public client getClient(){
        client clients = clientRepository.findByNameClient("Mateus Ferreira");
        return clients;
    }
}
