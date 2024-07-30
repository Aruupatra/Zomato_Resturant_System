package com.example.zomato_resturant_system.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DishItem extends BaseModel{

    private String name;
    private int quantity;

    private int price;
}
