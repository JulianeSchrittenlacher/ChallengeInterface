package org.example;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player1 = new MusicPlayer();
        VideoPlayer player2 = new VideoPlayer();
        MediaController mediaController = new MediaController();

        mediaController.playMedia(player1);
        mediaController.playMedia(player2);

    }
}