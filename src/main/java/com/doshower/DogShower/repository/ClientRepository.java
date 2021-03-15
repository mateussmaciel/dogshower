package com.doshower.DogShower.repository;

import com.doshower.DogShower.model.client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<client, String> {
    client findByCpfClient(String cpfClient);
}
