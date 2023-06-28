package com.pawelmikolaj.weather.weatherapp.rest;

import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;
import com.pawelmikolaj.weather.weatherapp.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @PostMapping("/addWeather")
    public void addWeather(@RequestBody WeatherData value) {
        weatherDataService.addTodaysWeather(value);
    }

    @GetMapping("/getHistoricalWeather")
    public List<WeatherData> getHistoricalWeather(@RequestParam double lon, @RequestParam double lat) {
        return weatherDataService.getHistoricalWeatherData(lon, lat);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handle(Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
