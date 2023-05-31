package com.pawelmikolaj.weather.weatherapp.service;

import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;

public interface WeatherDataService {

    WeatherData getWeatherData(String ip);

}
