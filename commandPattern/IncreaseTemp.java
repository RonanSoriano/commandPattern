package commandPattern;

public class IncreaseTemp implements Command {
    private Device device;

    public IncreaseTemp(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.increaseTemp();

    }
}
