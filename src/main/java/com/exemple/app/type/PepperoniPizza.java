package com.exemple.app.type;

import com.exemple.app.Pizza;

public class PepperoniPizza extends Pizza {
    public void prepare() {
        System.out.println("prepare pepperoni pizza ");
    }

    public void bake() {
        System.out.println("bake pepperoni pizza at 100 C");
    }

    public void cut() {
        System.out.println("cut pepperoni pizza into 7 pieces");
    }

    public void box() {
        System.out.println("boxing pepperoni pizza in wood box");
    }
}
