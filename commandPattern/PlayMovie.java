package commandPattern;

public class PlayMovie implements Command {
    private Device device;

    public PlayMovie(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.playMovie();

    }
}
