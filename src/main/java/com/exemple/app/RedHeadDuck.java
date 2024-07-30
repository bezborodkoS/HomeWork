package com.exemple.app;

public class RedHeadDuck extends Duck implements Flyable, Quackable{
    @Override
    protected void display() {
        System.out.println("red head duck");
    }

    @Override
    public void fly() {
        System.out.println("RED HEAD DUCK CAN FLY");
    }

    @Override
    public void quack() {
        System.out.println("RED HEAD DUCK CAN SAY QUACK");
    }
}
