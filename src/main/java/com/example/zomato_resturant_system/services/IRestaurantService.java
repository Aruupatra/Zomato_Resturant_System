package com.example.zomato_resturant_system.services;

import com.example.zomato_resturant_system.exceptions.NoRestaurantByIdException;
import com.example.zomato_resturant_system.exceptions.NoRestaurantException;
import com.example.zomato_resturant_system.models.Restaurant;

import java.util.List;

public interface IRestaurantService {

    public List<Restaurant> getAllRestaurant() throws NoRestaurantException;
    public Restaurant getRestaurantById(Long id) throws NoRestaurantByIdException;
}
