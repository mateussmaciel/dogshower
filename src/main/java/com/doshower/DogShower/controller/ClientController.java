package com.doshower.DogShower.controller;

import com.doshower.DogShower.model.client;
import com.doshower.DogShower.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    public client client(){
        int i = 1;
        client clients = clientRepository.findByNameClient("Mateus Ferreira");
        return clients;
    }
}
