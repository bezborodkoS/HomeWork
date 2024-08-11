package com.exemple.app.type;

import com.exemple.app.Pizza;

public class VeggiePizza extends Pizza {
    public void prepare() {
        System.out.println("prepare veggie pizza ");
    }

    public void bake() {
        System.out.println("bake veggie pizza at 90 C");
    }

    public void cut() {
        System.out.println("cut veggie pizza into 10 pieces");
    }

    public void box() {
        System.out.println("boxing veggie pizza in wood box");
    }
}
