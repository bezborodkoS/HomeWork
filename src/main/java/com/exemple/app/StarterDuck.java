package com.exemple.app;

import com.exemple.app.adapter.TurkeyAdapter;
import com.exemple.app.other_bird_duck.WildTurkey;

public class StarterDuck {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        System.out.println("###Mallard Duck");
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println("###Read Head Duck");
        redHeadDuck.fly();
        redHeadDuck.quack();
        System.out.println("###Rubber Duck");
        rubberDuck.fly();
        rubberDuck.quack();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("###Turkey");
        wildTurkey.fly();
        wildTurkey.gobble();
        System.out.println("###Duck say");
        testDuck(mallardDuck);
        System.out.println("###Turkey Say");
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
