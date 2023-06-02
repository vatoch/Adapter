package org.example;

public class AdvancedVideoPlayer implements AdvancPlayer {

    private String name;

    public AdvancedVideoPlayer(String name) {
        this.name = name;
    }

    public void process() {
        System.out.println("processing " + name);
    }

    public void playVideo() {
        process();
        System.out.println("Playing " +  name + " in 1080p");
    }


}
