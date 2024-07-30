package com.example.zomato_resturant_system.repositories;

import com.example.zomato_resturant_system.models.Restaurant;

import java.util.List;
import java.util.Optional;

public interface IResturantRepositories {

    public Optional<List<Restaurant>> getAllRestaurants();
    public Optional<Restaurant> getRestaurantById(Long id);

}
