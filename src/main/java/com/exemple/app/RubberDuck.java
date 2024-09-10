package com.exemple.app;


public class RubberDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
