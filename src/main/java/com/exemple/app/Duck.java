package com.exemple.app;

public class Duck {
    protected void quack(){
        System.out.println("quack");
    }

    protected void swim(){
        System.out.println("Duck can swim");
    }

    protected void fly(){
        System.out.println("all duck can fly");
    }

    public static void display(){
        System.out.println("duck");
    }
}
