package com.exemple.app;

public class StarterDuck {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        System.out.println("<<<MALLARD DUCK>>>");
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.display();
        mallardDuck.fly();
        System.out.println("<<<RED HEAD DUCK>>>");
        redHeadDuck.swim();
        redHeadDuck.quack();
        redHeadDuck.display();
        redHeadDuck.fly();
        System.out.println("<<<RUBBER DUCK>>>");
        rubberDuck.swim();
        rubberDuck.display();
        System.out.println("<<<DECOY DUCK>>>");
        decoyDuck.display();
    }
}
