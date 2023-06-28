package com.pawelmikolaj.weather.weatherapp.service;

import com.pawelmikolaj.weather.weatherapp.dao.WeatherDataRepository;
import com.pawelmikolaj.weather.weatherapp.entity.WeatherData;
import com.pawelmikolaj.weather.weatherapp.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private WeatherDataRepository repository;

    @Autowired
    public WeatherDataServiceImpl(WeatherDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTodaysWeather(WeatherData value) {
        List<WeatherData> all = repository.findAll();
        boolean recordExist = false;
        for (WeatherData weatherData : all) {
            if (weatherData.getLon() == value.getLon() && weatherData.getLat() == value.getLat()
                    &&  weatherData.getDate().getTime() == DateUtils.getDateWithoutTime().getTime()){
                recordExist = true;
                System.out.println("\n\n\n rekord istnieje \n\n\n");
                break;
            }
        }
        if (!recordExist)
            repository.save(value);
    }

    @Override
    public List<WeatherData> getHistoricalWeatherData(double lon, double lat) {
        List<WeatherData> byLonAndLatAndDate = repository.findByLonAndLatAndDate(lon, lat, DateUtils.getDateWithoutTimeUsingCalendarFiveDaysBefore());
        Collections.sort(byLonAndLatAndDate, new Comparator<WeatherData >() {
            @Override
            public int compare(WeatherData o1, WeatherData o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        return byLonAndLatAndDate;
    }

}
