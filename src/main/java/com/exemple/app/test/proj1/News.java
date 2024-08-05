package com.exemple.app.test.proj1;

import com.exemple.app.Observer;

import java.util.Observable;

public class News extends Observable {
    private String title;
    private String text;

    public News() {
    }

    public void measurChanged(){
        setChanged();
        notifyObservers();
    }

    public void setNews(String title, String text){
        this.title=title;
        this.text = text;
        measurChanged();
    }

    public String getTitle() {
        return title;
    }



    public String getText() {
        return text;
    }

}
