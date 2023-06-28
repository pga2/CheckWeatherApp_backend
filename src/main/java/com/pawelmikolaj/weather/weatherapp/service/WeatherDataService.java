package com.pawelmikolaj.weather.weatherapp.service;

import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;
import org.springframework.stereotype.Service;

import java.util.List;



public interface WeatherDataService {

    void addTodaysWeather(WeatherData value);

    List<WeatherData> getHistoricalWeatherData(double lon, double lat);
}
