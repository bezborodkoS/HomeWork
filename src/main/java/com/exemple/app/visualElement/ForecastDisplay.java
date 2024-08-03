package com.exemple.app.visualElement;

import com.exemple.app.DisplayElement;
import com.exemple.app.Observer;
import com.exemple.app.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("ForecastDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


}
