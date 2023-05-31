package com.pawelmikolaj.weather.weatherapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter @Setter @AllArgsConstructor
@Entity
@Table(name = "weather_data")
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lon")
    private double lon;

    @Column(name = "lat")
    private double lat;

    @Column(name = "date")
    private Date date;

    @Column(name = "sunrise")
    private int sunrise;

    @Column(name = "sunset")
    private int sunset;

    @Column(name = "temp")
    private double temp;

    @Column(name = "humidity")
    private int humidity;

    @Column(name = "pressure")
    private int pressure;

    @Column(name = "main")
    private String main;

    @Column(name = "description")
    private String description;
}
