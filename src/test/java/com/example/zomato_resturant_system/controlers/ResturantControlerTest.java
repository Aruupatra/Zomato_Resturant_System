package com.example.zomato_resturant_system.controlers;

import com.example.zomato_resturant_system.exceptions.NoRestaurantByIdException;
import com.example.zomato_resturant_system.exceptions.NoRestaurantException;
import com.example.zomato_resturant_system.models.Menu;
import com.example.zomato_resturant_system.models.Restaurant;
import com.example.zomato_resturant_system.repositories.IResturantRepositories;
import com.example.zomato_resturant_system.services.IRestaurantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class ResturantControlerTest {

    @Autowired
    IRestaurantService restaurantService;
    @MockBean
    IResturantRepositories restaurantRepositories;
    @Test
    void getAllResturant() throws NoRestaurantException {

        assertThrows(NoRestaurantException.class, () -> restaurantService.getAllRestaurant());
        List<Restaurant> restaurantList=new ArrayList<>();

        Restaurant restaurant1=new Restaurant();
        restaurant1.setId(1L);
        Menu menu1=new Menu();
        List<Menu> menus=new ArrayList<>();
        menus.add(menu1);
        restaurant1.setMenu(menus);
        restaurantList.add(restaurant1);

        Restaurant restaurant2=new Restaurant();
        restaurant2.setId(2L);
        Menu menu2=new Menu();
        List<Menu> menus2=new ArrayList<>();
        menus.add(menu2);
        restaurant1.setMenu(menus2);
        restaurantList.add(restaurant2);

        when(restaurantRepositories.getAllRestaurants()).thenReturn(Optional.of(restaurantList));

        List<Restaurant> restaurants=restaurantService.getAllRestaurant();

        assertEquals(restaurants.get(0).getId(),1L);
        assertEquals(restaurants.get(1).getId(),2L);

    }

    @Test
    void getRestaurantById() throws NoRestaurantByIdException {

        List<Restaurant> restaurantList=new ArrayList<>();

        Restaurant restaurant1=new Restaurant();
        restaurant1.setId(1L);
        Menu menu1=new Menu();
        List<Menu> menus=new ArrayList<>();
        menus.add(menu1);
        restaurant1.setMenu(menus);
        restaurantList.add(restaurant1);

        Restaurant restaurant2=new Restaurant();
        restaurant2.setId(2L);
        Menu menu2=new Menu();
        List<Menu> menus2=new ArrayList<>();
        menus.add(menu2);
        restaurant1.setMenu(menus2);
        restaurantList.add(restaurant2);

        when(restaurantRepositories.getRestaurantById(1L)).thenReturn(Optional.of(restaurantList.get(0)));

        Restaurant restaurant=restaurantService.getRestaurantById(1L);

        assertEquals(restaurant.getId(),1L);

        assertThrows(NoRestaurantByIdException.class, () -> restaurantService.getRestaurantById(5L));


    }
}