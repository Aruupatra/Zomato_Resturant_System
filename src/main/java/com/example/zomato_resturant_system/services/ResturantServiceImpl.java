package com.example.zomato_resturant_system.services;

import com.example.zomato_resturant_system.exceptions.NoRestaurantByIdException;
import com.example.zomato_resturant_system.exceptions.NoRestaurantException;
import com.example.zomato_resturant_system.models.Restaurant;
import com.example.zomato_resturant_system.repositories.IResturantRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResturantServiceImpl implements IRestaurantService{

    @Autowired
    private IResturantRepositories repositories;

    @Override
    public List<Restaurant> getAllRestaurant() throws NoRestaurantException {
        Optional<List<Restaurant>> restaurants=repositories.getAllRestaurants();

        if(restaurants.isEmpty())
        {
            throw new NoRestaurantException("No Restaurant Available at this moment");
        }
        else {
            return restaurants.get();
        }
    }

    @Override
    public Restaurant getRestaurantById(Long id) throws NoRestaurantByIdException {

        Optional<Restaurant> restaurant=repositories.getRestaurantById(id);
        // System.out.println(restaurant.get());
        if(restaurant.isEmpty())
        {
            throw new NoRestaurantByIdException("No Restaurant Available on this id");
        }
        else {
            return restaurant.get();
        }
    }
}
