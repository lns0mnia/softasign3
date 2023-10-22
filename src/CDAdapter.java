public class CDAdapter implements MusicPlayer {
    private CDPlayer cdPlayer;
    public CDAdapter(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }


    @Override
    public void playMusic(AudioSource audioSource) {
        CD cd = convertAudioSourceToCD(audioSource);
        // play
        cdPlayer.playCD(cd);
    }

    private CD convertAudioSourceToCD(AudioSource audioSource) {
        // converting
        CD cd = new CD();
        cd.setTitle(audioSource.getTitle());
        return cd;
    }
}