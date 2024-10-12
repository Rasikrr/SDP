package assignment_2.Adapter;

public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing wav file. Name: " + fileName);
    }

    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing aac file. Name: " + fileName);
    }
}
