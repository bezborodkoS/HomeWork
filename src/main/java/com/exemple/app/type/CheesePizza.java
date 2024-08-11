package com.exemple.app.type;

import com.exemple.app.Pizza;

public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("prepare cheese pizza ");
    }

    public void bake() {
        System.out.println("bake cheese pizza at 95 C");
    }

    public void cut() {
        System.out.println("cut cheese pizza into 9 pieces");
    }

    public void box() {
        System.out.println("boxing cheese pizza in paper box");
    }
}
