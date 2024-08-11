package com.exemple.app;

import com.exemple.app.type.CheesePizza;
import com.exemple.app.type.ClamPizza;
import com.exemple.app.type.PepperoniPizza;
import com.exemple.app.type.VeggiePizza;

public class PizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
