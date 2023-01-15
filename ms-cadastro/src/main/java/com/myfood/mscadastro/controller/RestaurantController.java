package com.myfood.mscadastro.controller;


import com.myfood.mscadastro.dto.RestaurantDto;
import com.myfood.mscadastro.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @GetMapping
    public ResponseEntity<List<RestaurantDto>> findAllClient(){
        return ResponseEntity.status(HttpStatus.OK).body(restaurantService.findAllRestaurant());
    }

    @PostMapping
    public ResponseEntity<RestaurantDto> saveClient(@RequestBody RestaurantDto restaurantDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurantService.saveRestaurant(restaurantDto));
    }
}
