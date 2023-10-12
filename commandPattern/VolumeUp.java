package commandPattern;

public class VolumeUp implements Command {
    private Device device;

    public VolumeUp(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeUp();
    }
}
