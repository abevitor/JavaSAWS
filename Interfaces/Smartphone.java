package Interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O smartphone esta tocando musica!");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A musica foi pausada!");
        
    }

    @Override
    public void skipMusic() {
        System.out.println("pulando música...");
        
    }

    @Override
    public void playVideo() {
        System.out.println("Reproduzindo video");
        
    }

    @Override
    public void pauseplayVideo() {
        System.out.println("Pausando video");
        
    }

    @Override
    public void skipVideo() {
        System.out.println("pulando video...");
       
    }
}
