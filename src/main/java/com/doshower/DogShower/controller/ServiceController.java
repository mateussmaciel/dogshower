package com.doshower.DogShower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @GetMapping
    public String GetServices(){
        return "Serviços oferecidos para os cliente";
    }
}
