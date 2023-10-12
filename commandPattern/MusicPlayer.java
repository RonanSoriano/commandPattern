package commandPattern;

public class MusicPlayer implements Device {

    @Override
    public void switchOn(){
        System.out.println("Music Player is turn On!");
        System.out.println("Raining in Manila by Lola Amour playlist is playing!");
    }

    @Override
    public void switchOff(){
        System.out.println("Music Player is turn Off!");
    }

    @Override
    public void rgbLightMode() {
        System.out.println("RGB Light Wave Mode is synchronized to Music!");
    }

    @Override
    public void discoLightMode() {
        System.out.println("Disco Light Mode is Activated!");
        System.out.println("It's Party timeee!!");
    }

    @Override
    public void increaseTemp() {

    }

    @Override
    public void decreaseTemp() {

    }

    @Override
    public void nextSong() {
        System.out.println("SuperShy by NewJeans is playing!");
    }

    @Override
    public void shuffledSong() {
        System.out.println("Enqueue Songs: ");
        System.out.println("\t - Ang pag-ibig by Rob deniel");
        System.out.println("\t - YK by Clean Jr");
        System.out.println("\t - Estranghero by Cup of Joe");
        System.out.println("\t - Ere by Juan Karlos");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume is increased by +1");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume is decreased by -1");
    }

    @Override
    public void playMovie() {

    }

    @Override
    public void stopMovie() {

    }
}
