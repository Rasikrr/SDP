package assignment_2.Bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerButton();
    public abstract void setChannel(int channel);
    public abstract void setVolume(int volume);
}
