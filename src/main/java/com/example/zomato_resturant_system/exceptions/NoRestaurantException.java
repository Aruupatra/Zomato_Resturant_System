package com.example.zomato_resturant_system.exceptions;

public class NoRestaurantException extends Exception{
    public NoRestaurantException(String message)
    {
        System.out.println(message);
    }
}
