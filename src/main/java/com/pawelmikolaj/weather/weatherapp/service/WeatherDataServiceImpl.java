package com.pawelmikolaj.weather.weatherapp.service;

import com.pawelmikolaj.weather.weatherapp.dao.WeatherDataRepository;
import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherDataServiceImpl implements WeatherDataService{

    WeatherDataRepository repository;

    @Autowired
    public WeatherDataServiceImpl(WeatherDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public WeatherData getWeatherData(String ip) {
        repository.find
        return null;
    }
}
