package com.doshower.DogShower.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name ="client")
public class client {

    private Long id;
    private String nameClient;
    private String emailClient;
    @Id
    private String cpfClient;
    private String rgClient;
    private LocalDate birthdayClient;
    private String addressClient;
    private String stateClient;
    private String cityClient;

    client(){}
}
