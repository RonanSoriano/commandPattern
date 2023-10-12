package commandPattern;

public class ShuffledSong implements Command {
    private Device device;

    public ShuffledSong(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.shuffledSong();

    }
}
