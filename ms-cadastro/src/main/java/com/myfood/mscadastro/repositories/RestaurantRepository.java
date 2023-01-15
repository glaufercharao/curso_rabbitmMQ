package com.myfood.mscadastro.repositories;

import com.myfood.mscadastro.entities.Client;
import com.myfood.mscadastro.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
