package com.example.zomato_resturant_system.controlers;

import com.example.zomato_resturant_system.exceptions.NoRestaurantByIdException;
import com.example.zomato_resturant_system.exceptions.NoRestaurantException;
import com.example.zomato_resturant_system.models.Restaurant;
import com.example.zomato_resturant_system.services.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/restaurants")
public class ResturantControler {

    @Autowired
    private IRestaurantService restaurantService;
    @GetMapping()
    public List<Restaurant> getAllResturant() throws NoRestaurantException {
        return restaurantService.getAllRestaurant();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable("id")  Long id) throws NoRestaurantByIdException {
        System.out.println(id);
        return restaurantService.getRestaurantById(id);
    }
}
