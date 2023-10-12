package commandPattern;

public class VolumeDown implements Command {
    private Device device;

    public VolumeDown(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeDown();

    }
}
