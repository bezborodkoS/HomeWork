package com.exemple.app;


public class RedHeadDuck implements Duck{

    @Override
    public void fly() {
        System.out.println("can flying long distance");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
