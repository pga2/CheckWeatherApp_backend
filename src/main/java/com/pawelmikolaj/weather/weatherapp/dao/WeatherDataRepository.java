package com.pawelmikolaj.weather.weatherapp.dao;

import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface WeatherDataRepository extends JpaRepository<WeatherData, Integer> {


    @Query(value = "SELECT * FROM weather_data WHERE lon = :lon and lat = :lat and date > :date", nativeQuery = true)
    List<WeatherData> findByLonAndLatAndDate(double lon, double lat, Date date);

}
