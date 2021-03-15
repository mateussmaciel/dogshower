package com.doshower.DogShower.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name ="animal")
public class animal {

    @Id
    private Long id_animal;
    private String name_animal;
    private String type_animal;
    private String breed_animal;
    private String sex_animal;
    private String weight_animal;
    private String observation_animal;

    animal(){}
}
