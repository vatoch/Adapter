package org.example;

public class Main {
    public static void main(String[] args) {


        // service is using the old normal video player and playin video in 720p
        PlayerService service = new PlayerService(new NormalVideoPlayer("animal video"));
        service.function();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("switched to new advanced vido player ");

        // now we switched to new advanced media player using adapter
        service.setPlayer(new PlayerAdapter(new AdvancedVideoPlayer("animal video")));

        service.function();






    }
}