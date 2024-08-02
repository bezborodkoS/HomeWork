package com.exemple.app;

import com.exemple.app.flyable.FlyableBehavior;
import com.exemple.app.quackable.QuackBehavior;

public abstract class Duck {

    protected FlyableBehavior flyableBehavior;
    protected QuackBehavior quackBehavior;

    public void flyableBehavior() {
        flyableBehavior.fly();
    }

    public void quackBehavior() {
        quackBehavior.quack();
    }

    protected void swim(){
        System.out.println("Duck can swim");
    }



    protected abstract void display();
}
