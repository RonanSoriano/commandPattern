package commandPattern;

public class Lights implements Device {
    @Override
    public void switchOn(){
        System.out.println("Lights is Turn On!");
    }
    @Override
    public void switchOff(){
        System.out.println("Lights is Turn Off!");
    }

    @Override
    public void rgbLightMode(){
        System.out.println("RGB Light Wave Mode is Activated!");
        System.out.println("Brightness level is 40%");
    }
    @Override
    public void discoLightMode(){
        System.out.println("Disco Light Mode is Activated!");
        System.out.println("Brightness level is 58%");
    }

    @Override
    public void increaseTemp() {
        System.out.println("Temperature is now in cool mode!");
    }

    @Override
    public void decreaseTemp() {
        System.out.println("Temperature is now in standby mode!");
    }

    @Override
    public void nextSong() {

    }

    @Override
    public void shuffledSong() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void playMovie() {

    }

    @Override
    public void stopMovie() {

    }
}


