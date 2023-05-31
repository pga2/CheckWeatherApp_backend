package com.pawelmikolaj.weather.weatherapp.model.weather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WeatherInfoResp {
    private float id;
    private String main;
    private String description;
    private String icon;
}
