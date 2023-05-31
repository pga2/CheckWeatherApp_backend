package com.pawelmikolaj.weather.weatherapp.model.weather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Current {
    private float dt;
    private float sunrise;
    private float sunset;
    private float temp;
    private float feels_like;
    private float pressure;
    private float humidity;
    private float dew_point;
    private float uvi;
    private float clouds;
    private float visibility;
    private float wind_speed;
    private float wind_deg;
    private float wind_gust;
    private List<WeatherInfoResp> weather;
}
