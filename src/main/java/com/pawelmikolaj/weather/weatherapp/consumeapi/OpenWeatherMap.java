package com.pawelmikolaj.weather.weatherapp.consumeapi;

import com.pawelmikolaj.weather.weatherapp.model.Cord;
import com.pawelmikolaj.weather.weatherapp.model.weather.WeatherResp;
import org.springframework.web.client.RestTemplate;

public class OpenWeatherMap {

    private final String URL = "https://api.openweathermap.org/data/2.5/onecall?lat=";
    private final String PASSWORD = "&appid=5eca8f996cd6a42c004008c32442acb7";

    public WeatherResp getWeather(Cord cord) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL + cord.getLat() + "&lon=" + cord.getLon() + PASSWORD, WeatherResp.class);
    }

}
