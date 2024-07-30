package com.example.zomato_resturant_system.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location extends BaseModel{


    private int pincode;
    private String address;
    private String country;
    private String state;
    private String district;
}
