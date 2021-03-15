package com.doshower.DogShower.controller;

import com.doshower.DogShower.model.client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetShopController {

    @GetMapping("/service")
    public String GetPetShop(){
        return "Retorna lista de petshop cadastrados";
    }

}
