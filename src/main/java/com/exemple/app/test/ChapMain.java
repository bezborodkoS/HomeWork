package com.exemple.app.test;

public class ChapMain {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SmartHome smartHome = new SmartHome(light,thermostat,"hous1");

        smartHome.startHousComp();
        smartHome.lightDown();
        smartHome.lightUp();
        smartHome.closHousComp();
    }
}
