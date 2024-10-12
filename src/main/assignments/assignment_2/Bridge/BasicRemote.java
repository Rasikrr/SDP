package assignment_2.Bridge;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        System.out.println("Basic Remote: Power Button Pressed");
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
}
