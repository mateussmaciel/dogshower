package com.doshower.DogShower.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name ="Client")
public class client implements Serializable {

    @Id
    private Long id;
    private String nameClient;
    private LocalDate birthdayClient;
    private String cpfClient;
    private String rgClient;
    private String addressClient;

    client(){};
    public client(String nameClient, LocalDate birthdayClient,
                  String cpfClient, String rgClient, String addressClient){
        this.nameClient = nameClient;
        this.birthdayClient = birthdayClient;
        this.cpfClient = cpfClient;
        this.rgClient = rgClient;
        this.addressClient = addressClient;
    }

}
