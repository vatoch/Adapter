package org.example;

public class PlayerService {

    private VideoPlayer player;

    public PlayerService(VideoPlayer player) {
        this.player = player;
    }

    public void function() {
        player.playVideo();
    }


    public void setPlayer(VideoPlayer player) {
        this.player = player;

    }




}
