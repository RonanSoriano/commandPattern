package commandPattern;

public class RGBMode implements Command {
    private Device device;

    public RGBMode(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.rgbLightMode();

    }
}
