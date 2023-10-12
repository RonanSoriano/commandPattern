package commandPattern;

public class NextSong implements Command {
    private Device device;

    public NextSong(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.nextSong();

    }
}
