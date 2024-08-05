package com.exemple.app.test;

import java.util.ArrayList;

public class Book {
    private ArrayList<Chapter> chapters;

    public Book() {
        this.chapters = new ArrayList<>();
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }

    public void toStringAllChapter(){
        for (Chapter chapter : chapters) {
            System.out.println(chapter.getTitle());
        }
    }
}
