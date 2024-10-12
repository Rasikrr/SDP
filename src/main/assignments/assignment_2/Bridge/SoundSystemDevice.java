package assignment_2.Bridge;


public class SoundSystemDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Sound System is turned ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is turned OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System does not support channels");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume);
    }
}