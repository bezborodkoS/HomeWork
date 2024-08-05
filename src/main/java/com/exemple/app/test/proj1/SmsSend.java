package com.exemple.app.test.proj1;


import java.util.Observable;
import java.util.Observer;

public class SmsSend implements Observer, Display {
    private Observable observable;
    private String title;
    private String text;

    public SmsSend(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("User{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}');
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof News) {
            News news = (News) o;
            this.title = news.getTitle();
            this.text = news.getText();
            display();
        }
    }

}
