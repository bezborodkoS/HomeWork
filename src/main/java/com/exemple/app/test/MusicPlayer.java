package com.exemple.app.test;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Song> songs;

    public MusicPlayer() {
        this.songs = new ArrayList<>();
    }

    public ArrayList<Song> getSong() {
        return songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void showSong(){
        for (Song song : songs) {
            System.out.println(song.getSongText());
        }
    }

}
