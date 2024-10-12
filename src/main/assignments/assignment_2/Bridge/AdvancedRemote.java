package assignment_2.Bridge;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Advanced Remote: Power Button Pressed");
        device.powerOn();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Muting the device");
        device.setVolume(0);
    }
}
