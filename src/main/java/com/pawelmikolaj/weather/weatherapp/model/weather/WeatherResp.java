package com.pawelmikolaj.weather.weatherapp.model.weather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class WeatherResp {
    private float lat;
    private float lon;
    private String timezone;
    private float timezone_offset;
    Current CurrentObject;
}