package com.pawelmikolaj.weather.weatherapp.consumeapi;

import com.pawelmikolaj.weather.weatherapp.model.Cord;
import org.springframework.web.client.RestTemplate;

public class IPApi {

    private final String URL = "http://ip-api.com/json/";

    public Cord getLonAndLat(String ip) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL + ip, Cord.class);
    }

}
