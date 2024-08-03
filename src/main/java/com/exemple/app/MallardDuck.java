package com.exemple.app;

import com.exemple.app.flyable.FlyWithWings;
import com.exemple.app.quackable.Quack;

public class MallardDuck extends Duck  {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyableBehavior = new FlyWithWings();
    }

        @Override
    protected void display() {
        System.out.println("mallard duck");
    }
}
