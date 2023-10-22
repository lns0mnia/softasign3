public class Main {
    public static void main(String[] args) {
        AudioSource audioSource = new AudioSource("My Favorite Song");

        CDPlayer cdPlayer = new CDPlayer();

        CDAdapter cdAdapter = new CDAdapter(cdPlayer);

        cdAdapter.playMusic(audioSource);
    }
}