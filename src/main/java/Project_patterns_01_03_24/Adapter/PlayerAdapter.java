package Project_patterns_01_03_24.Adapter;

public class PlayerAdapter implements MediaPlayer {
    VideoPlayer videoPlayer;

    public PlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
    }
}
