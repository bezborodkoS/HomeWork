package com.exemple.app;

public class StarterDuck {
    public static void main(String[] args) {
        Duck duck = new Duck();
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        System.out.println("<<<DUCK>>>");
        duck.swim();
        duck.quack();
        Duck.display();
        System.out.println("<<<MALLARD DUCK>>>");
        mallardDuck.swim();
        mallardDuck.quack();
        MallardDuck.display();
        System.out.println("<<<RED HEAD DUCK>>>");
        redHeadDuck.swim();
        redHeadDuck.quack();
        RedHeadDuck.display();

    }
}
