package Interfaces;

public class Main {



    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Computer();
        VideoPlayer videoPlayer = new Computer();
        runMusic(musicPlayer);
        runVideo(videoPlayer);
    }

     public static void runVideo(VideoPlayer videoPlayer){
            videoPlayer.playVideo();
        }

        public static void runMusic(MusicPlayer musicPlayer){
            musicPlayer.playMusic();
            musicPlayer.pauseMusic();
        }
    
}
