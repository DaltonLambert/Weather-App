package com.dalton.WeatherApp.controller;

import com.dalton.WeatherApp.dao.JdbcWeatherDao;
import com.dalton.WeatherApp.model.Weather;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/weather")
public class WeatherController {

    private final JdbcWeatherDao weatherDao;

    public WeatherController(JdbcWeatherDao weatherDao) {
        this.weatherDao = weatherDao;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Weather createWeather(@RequestBody Weather weather) {
        return weatherDao.createWeather(weather);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Weather> findAll() {
        return weatherDao.findAll();
    }
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Weather findById(@PathVariable int id) {
        return weatherDao.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/location/{location}", method = RequestMethod.GET)
    public List<Weather> findByLocation(@PathVariable String location){
        return weatherDao.findByLocation(location);
    }

}
