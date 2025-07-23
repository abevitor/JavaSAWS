package Interfaces;

public class MusicBox  implements MusicPlayer{

     @Override
    public void playMusic() {
        System.out.println("A caixa: tocando musica!");
    }

    @Override
    public void pauseMusic() {
        System.out.println(" A caixa: musica foi pausada!");
        
    }

    @Override
    public void skipMusic() {
        System.out.println("A caixa:  pulando música...");
        
    }
    
}
