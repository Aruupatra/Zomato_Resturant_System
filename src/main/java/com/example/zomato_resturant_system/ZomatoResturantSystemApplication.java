package com.example.zomato_resturant_system;

import com.example.zomato_resturant_system.repositories.RestaurantRepositoriesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZomatoResturantSystemApplication {

    public static void main(String[] args) {



        RestaurantRepositoriesImpl repositories=new RestaurantRepositoriesImpl();
        repositories.addRestaurants();
        SpringApplication.run(ZomatoResturantSystemApplication.class, args);
        System.out.println("Hi");

    }

}
