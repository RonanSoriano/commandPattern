package commandPattern;

public class Thermostat implements Device {

    @Override
    public void switchOn(){
        System.out.println("Thermostat is Turn On!");
    }
    @Override
    public void switchOff(){
        System.out.println("Thermostat is Turn Off!");
    }

    @Override
    public void rgbLightMode() {
        System.out.println("Light changes to light orange!");
    }

    @Override
    public void discoLightMode() {
        System.out.println("Light changes to ambiance mode!");
    }

    @Override
    public void increaseTemp() {
        System.out.println("Temperature is increased by +1°C!");
    }

    @Override
    public void decreaseTemp() {
        System.out.println("Temperature is decreased by -1°C!");
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
