package com.example.zomato_resturant_system.repositories;

import com.example.zomato_resturant_system.models.Menu;
import com.example.zomato_resturant_system.models.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RestaurantRepositoriesImpl implements IResturantRepositories{

     Map<Long,Restaurant> resturants=new HashMap<>();

//     public void addRestaurants()
//     {
//         System.out.println("Adding");
//         Restaurant restaurant1=new Restaurant();
//         restaurant1.setId(1L);
//         Menu menu1=new Menu();
//         List<Menu> menus=new ArrayList<>();
//         menus.add(menu1);
//         restaurant1.setMenu(menus);
//         resturants.put(1L,restaurant1);
//
//     }

    @Override
    public Optional<List<Restaurant>> getAllRestaurants() {

        List<Restaurant> restaurantList=new ArrayList<>();
        for(Restaurant restaurant:resturants.values())
        {
            restaurantList.add(restaurant);
        }
        if(restaurantList.size()>0)
        {
            return Optional.of(restaurantList);
        }
        else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Restaurant> getRestaurantById(Long id) {

        if(resturants.containsKey(id))
        {
            return Optional.of(resturants.get(id));
        }
        return Optional.empty();

    }
}
