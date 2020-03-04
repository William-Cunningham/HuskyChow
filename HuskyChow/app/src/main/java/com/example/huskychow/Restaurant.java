package com.example.huskychow;

//This class represents a single restaurant near campus
public class Restaurant {

    //the name of the restaurant
    private String name;

    //the address of the restaurant
    private String address;

    //a link to the url hosting this Restaurant's website
    private String url;

    //TODO: how do we want to store times?
    private String openTime;
    private String closeTime;

    //the type of currency the restaurant accepts: husky dollars, meal swipes, or both
    private CurrencyType currencyType;

    //the relative price of the restaurant: high, medium, or low
    private RestaurantPrice price;

    //constructor for a Restaurant object
    public Restaurant(String name, String address, String url, String openTime, String closeTime,
                      CurrencyType currencyType, RestaurantPrice price) {
        this.name = name;
        this.address = address;
        this.url = url;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.currencyType = currencyType;
        this.price = price;
    }
}
