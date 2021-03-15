package com.doshower.DogShower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String GetStatus(){
        return "Consulta status do serviço solicitado pelo cliente";
    }
}
