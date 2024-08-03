package com.exemple.app;

import com.exemple.app.flyable.FlyRocketPowered;

public class StarterDuck {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        System.out.println("<<<MALLARD DUCK>>>");
        mallardDuck.swim();
        mallardDuck.quackBehavior();
        mallardDuck.display();
        mallardDuck.flyableBehavior();
        System.out.println("\n<<<UPDATE MALLARD DUCK>>>");
        mallardDuck.setFlyableBehavior(new FlyRocketPowered());
        mallardDuck.flyableBehavior();
        System.out.println("\n<<<RED HEAD DUCK>>>");
        redHeadDuck.swim();
        redHeadDuck.quackBehavior();
        redHeadDuck.display();
        redHeadDuck.flyableBehavior();
        System.out.println("\n<<<RUBBER DUCK>>>");
        rubberDuck.swim();
        rubberDuck.quackBehavior();
        rubberDuck.display();
        System.out.println("\n<<<DECOY DUCK>>>");
        decoyDuck.display();
    }
}
