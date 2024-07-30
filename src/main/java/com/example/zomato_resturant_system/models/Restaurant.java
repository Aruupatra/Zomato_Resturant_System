package com.example.zomato_resturant_system.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant extends BaseModel{

    private Long id;
    private String name;
    private List<Menu> menu;
    private Location location;

}
