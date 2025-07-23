package Interfaces;

public class Computer implements MusicPlayer, VideoPlayer{
    @Override
    public void playMusic() {
        System.out.println("O computador esta tocando musica!");
    }

    @Override
    public void pauseMusic() {
        System.out.println(" O computador esta  musica foi pausada!");
        
    }

    @Override
    public void skipMusic() {
        System.out.println("O computador esta pulando música...");
        
    }

    @Override
    public void playVideo() {
        System.out.println("O computador esta Reproduzindo video");
        
    }

    @Override
    public void pauseplayVideo() {
        System.out.println("O computador esta Pausando video");
        
    }

    @Override
    public void skipVideo() {
        System.out.println("O computador esta pulando video...");
       
    }
    
}
