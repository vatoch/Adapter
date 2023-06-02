package org.example;

public class NormalVideoPlayer implements VideoPlayer {

    private String name;

    public NormalVideoPlayer(String name) {
        this.name = name;
    }


    public void playVideo() {
        System.out.println(name + " is playing in 720p");
    }


}
