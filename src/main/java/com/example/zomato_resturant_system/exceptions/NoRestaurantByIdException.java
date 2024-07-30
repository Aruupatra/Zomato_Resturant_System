package com.example.zomato_resturant_system.exceptions;

public class NoRestaurantByIdException extends Exception{

   public NoRestaurantByIdException(String message)
    {
        System.out.println(message);
    }
}
