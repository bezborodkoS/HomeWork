package com.exemple.app.test;

public class Light {
    private String name;
    private int lightProcent;

    public int getLightProcent() {
        return lightProcent;
    }

    public void setLightProcent(int lightProcent) {
        this.lightProcent = lightProcent;
    }

    public Light() {
        this.lightProcent = 10;
    }

    public void on(){
        System.out.println("Light on  "+lightProcent);
    }

    public void off(){
        System.out.println("Light off");
    }


}
