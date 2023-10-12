package commandPattern;

public class DecreaseTemp implements Command {
    private Device device;

    public DecreaseTemp(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.decreaseTemp();

    }
}
