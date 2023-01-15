package com.myfood.mscadastro.services;

import com.myfood.mscadastro.dto.ClientDto;
import com.myfood.mscadastro.dto.RestaurantDto;
import com.myfood.mscadastro.entities.Client;
import com.myfood.mscadastro.entities.Restaurant;
import com.myfood.mscadastro.mapper.Mappable;
import com.myfood.mscadastro.repositories.ClientRepository;
import com.myfood.mscadastro.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService implements Mappable {


    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto){
        return map(restaurantRepository.save(map(restaurantDto, Restaurant.class)),RestaurantDto.class);
    }

    public List<RestaurantDto> findAllRestaurant() {
        return map(restaurantRepository.findAll(), RestaurantDto.class);
    }
}
