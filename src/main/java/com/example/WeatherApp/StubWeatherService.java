package com.example.WeatherApp;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class StubWeatherService {
    public CurrentWeather getCurrentWeather(String city, String country){
        return new CurrentWeather("Clear", BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN);
    }
}
