package com.pawelmikolaj.weather.weatherapp.dao;

import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface WeatherDataRepository extends JpaRepository<WeatherData, Integer> {


    WeatherData findByLonAndLatAndDate(double lon, double lat, Date date);
}
