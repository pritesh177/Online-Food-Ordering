package com.morc.service;

import com.morc.Dto.RestaurantDto;
import com.morc.model.Restaurant;
import com.morc.model.User;
import com.morc.request.RestaurantCreateRequest;

import java.util.List;


public interface RestaurantService {
    public Restaurant CreateRestaraurant(RestaurantCreateRequest req, User user);

    public Restaurant updateRestaurant(Long restaurantId,RestaurantCreateRequest updateRestaurant) throws Exception;

    public void deleteRestaurant(Long restaurantId) throws Exception;

    public List<Restaurant> getAllRestaurant();

    public List<Restaurant> searchByRestaurant(String Keyword);

    public Restaurant findRestaurantById(Long Id) throws Exception;

    public Restaurant getRestaurantByUserId(Long userId) throws Exception;

    public RestaurantDto addToFavorites(Long restaurantId,User user) throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;
}
