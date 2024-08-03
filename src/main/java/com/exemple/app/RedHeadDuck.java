package com.exemple.app;

import com.exemple.app.flyable.FlyWithWings;
import com.exemple.app.quackable.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyableBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("red head duck");
    }

}
