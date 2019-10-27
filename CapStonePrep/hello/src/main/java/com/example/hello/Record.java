package com.example.hello;

public class Record {

   private String artist;
   private String song;
   private int num;

    public Record(String artist, String song, int num) {
        this.artist = artist;
        this.song = song;
        this.num = num;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
