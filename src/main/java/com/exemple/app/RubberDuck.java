package com.exemple.app;

public class RubberDuck extends Duck implements Quackable{
    @Override
    protected void display() {
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("RUBBER DUCK CAN SAY QUACK");

    }
}
