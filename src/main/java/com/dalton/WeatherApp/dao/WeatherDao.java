package com.dalton.WeatherApp.dao;

import com.dalton.WeatherApp.model.Weather;

import java.util.List;

public interface WeatherDao {
    List<Weather> findAll();
    Weather findById(Long id);

    List<Weather> findByCityName(String cityName);
}

