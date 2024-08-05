package com.exemple.app.test;

public class SmartHome {
    private Light light;
    private Thermostat thermostat;
    protected String name;


    public SmartHome(Light light, Thermostat thermostat, String name) {
        this.light = light;
        this.thermostat = thermostat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startHousComp(){

        thermostat.shouTemp(20);
        light.on();
    }

    public void lightUp(){
        if (light.getLightProcent()<10) {
            light.setLightProcent(light.getLightProcent() + 1);
            startHousComp();
        }else {
            System.out.println("max");
        }
    }

    public void lightDown(){
        if (light.getLightProcent()>0) {
            light.setLightProcent(light.getLightProcent() - 1);
            startHousComp();
        }else {
            System.out.println("min");
        }
    }
    public void closHousComp(){
        thermostat.off();
        light.off();
    }

}
