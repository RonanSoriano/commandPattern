package commandPattern;

public class Tv implements Device {
    @Override
    public void switchOn(){
        System.out.println("Tv is Turn On!");
    }
    @Override
    public void switchOff(){
        System.out.println("Tv is Turn Off!");
    }

    @Override
    public void rgbLightMode() {
        System.out.println("Light is set to ambiance mode synchronized to movie playing!");

    }

    @Override
    public void discoLightMode() {

    }

    @Override
    public void increaseTemp() {
        System.out.println("Temperature is now in cool mode!");
    }

    @Override
    public void decreaseTemp() {

    }

    @Override
    public void nextSong() {

    }

    @Override
    public void shuffledSong() {

    }

    @Override
    public void volumeUp() {
        System.out.println("Movie volume is increased by +1");
    }

    @Override
    public void volumeDown() {
        System.out.println("Movie volume is decreased by -1");
    }

    @Override
    public void playMovie() {
        System.out.println("Spider-Man: Across the Spider-Verse is now playing!");
    }

    @Override
    public void stopMovie() {
        System.out.println("Movie stopped! Tv is now standby.");
    }
}
