package org.example;

public class PlayerAdapter implements VideoPlayer{
    private AdvancPlayer player;

    public PlayerAdapter(AdvancPlayer player) {
        this.player = player;
    }

    @Override
    public void playVideo() {
        player.playVideo();
    }
}
