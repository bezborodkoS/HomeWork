package com.exemple.app.type;

import com.exemple.app.Pizza;

public class ClamPizza extends Pizza {

    public void prepare() {
        System.out.println("prepare clam pizza ");
    }

    public void bake() {
        System.out.println("bake clam pizza at 120 C");
    }

    public void cut() {
        System.out.println("cut clam pizza into 12 pieces");
    }

    public void box() {
        System.out.println("boxing clam pizza in paper box");
    }
}
