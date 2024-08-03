package com.exemple.app;

import com.exemple.app.provider.WeatherData;
import com.exemple.app.visualElement.CurrentConditionsDisplay;
import com.exemple.app.visualElement.ForecastDisplay;
import com.exemple.app.visualElement.StatisticsDisplay;

public class WeatherStarter {
    public static void main(String[] args) {
        WeatherData weatherData  = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,32.2f);
        weatherData.setMeasurements(23,45,12.2f);
        weatherData.setMeasurements(56,43,29.8f);
    }
}
