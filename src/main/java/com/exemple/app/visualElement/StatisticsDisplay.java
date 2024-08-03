package com.exemple.app.visualElement;

import com.exemple.app.DisplayElement;
import com.exemple.app.Observer;
import com.exemple.app.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("StatisticsDisplay{" +
                "temperature=" + temperature +
                "F, humidity %=" + humidity );
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity = humidity;
        display();
    }
}
