package com.exemple.app;

public abstract class Pizza {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void  prepare();
    public abstract void  bake();
    public abstract void  cut();
    public abstract void  box();

}
