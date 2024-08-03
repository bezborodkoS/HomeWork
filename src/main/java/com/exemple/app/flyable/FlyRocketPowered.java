package com.exemple.app.flyable;

public class FlyRocketPowered implements FlyableBehavior{
    @Override
    public void fly() {
        System.out.println("fly rocket powered");
    }
}
