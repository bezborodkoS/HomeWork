package com.exemple.app.test;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<App> apps;

    public MobilePhone() {
        this.apps = new ArrayList<>();
    }

    public ArrayList<App> getApps() {
        return apps;
    }

    public void addApp(App app){
        apps.add(app);
    }

    public void showApp(){
        for (App app : apps) {
            System.out.println(app.getNameApp());
        }
    }
}
