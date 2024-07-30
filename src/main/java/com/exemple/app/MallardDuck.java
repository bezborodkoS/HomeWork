package com.exemple.app;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    protected void display() {
        System.out.println("mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("MALLARD DUCK CAN FLY");
    }

    @Override
    public void quack() {
        System.out.println("MALLARD DUCK CAN SAY QUACK");
    }
}
