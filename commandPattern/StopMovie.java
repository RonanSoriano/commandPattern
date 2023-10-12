package commandPattern;

public class StopMovie implements Command {
    private Device device;

    public StopMovie(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.stopMovie();

    }
}
