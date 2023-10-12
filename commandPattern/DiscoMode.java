package commandPattern;

public class DiscoMode implements Command {
    private Device device;

    public DiscoMode(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.discoLightMode();
    }
}
