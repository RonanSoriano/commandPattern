package commandPattern;

import java.util.Scanner;

public class SmartApp {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        // get device
        Device light = new Lights();
        Device thermostat = new Thermostat();
        Device musicPlayer = new MusicPlayer();
        Device tv = new Tv();

        // Create central hub
        CentralHub centralHub = new CentralHub();

        System.out.println("Welcome to Smart Home Automation!");

        while (true) {
            System.out.println("\nDevice Available: ");
            System.out.println("\t- Tv");
            System.out.println("\t- Lights");
            System.out.println("\t- Thermostat");
            System.out.println("\t- Music Player");

            System.out.print("\nChoose device you want to use: ");
            String userWant;

            String userChoice = userInput.nextLine();

            switch (userChoice.toLowerCase()) {
                case "lights": // for Lights Device.
                    while (true) {
                        System.out.println("\nCommands you can do:");
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. RGB Light Mode");
                        System.out.println("4. Disco Light Mode");
                        System.out.println("5. Back to Device Available\n");
                        System.out.print("Choose command you want to do (1 - 5): ");
                        userWant = userInput.nextLine();
                        if (userWant.equals("1")) {
                            Command turnOnLights = new TurnOn(light);
                            centralHub.addCommand(turnOnLights); // to store the command.
                            centralHub.clickButton(); // to execute the command.
                        }
                        else if (userWant.equals("2")) {
                            Command turnOffLights = new TurnOff(light);
                            centralHub.addCommand(turnOffLights);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("3")) {
                            Command rgbModeOn = new RGBMode(light);
                            Command rgbWithMusic = new RGBMode(musicPlayer);
                            Command rgbWithCool = new IncreaseTemp(light);
                            centralHub.addCommand(rgbModeOn);
                            centralHub.addCommand(rgbWithMusic);
                            centralHub.addCommand(rgbWithCool);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("4")) {
                            Command discoMode = new DiscoMode(light);
                            Command discoWithMusic = new DiscoMode(musicPlayer);
                            Command rgbWithStandBy = new DecreaseTemp(light);
                            centralHub.addCommand(discoMode);
                            centralHub.addCommand(discoWithMusic);
                            centralHub.addCommand(rgbWithStandBy);
                            centralHub.clickButton();
                        }
                        else {
                            break;
                        }
                    }
                    break;

                case "thermostat": // for Thermostat Device.
                    while (true) {
                        System.out.println("\nCommands you can do:");
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. Increase Temperature");
                        System.out.println("4. Decrease Temperature");
                        System.out.println("5. Back to Device Available\n");
                        System.out.print("Choose command you want to do (1 - 5): ");
                        userWant = userInput.nextLine();
                        if (userWant.equals("1")) {
                            Command turnOnThermostat = new TurnOn(thermostat);
                            Command withLight = new RGBMode(thermostat);
                            centralHub.addCommand(turnOnThermostat);
                            centralHub.addCommand(withLight);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("2")) {
                            Command turnOffThermostat = new TurnOff(thermostat);
                            centralHub.addCommand(turnOffThermostat);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("3")) {
                            Command increaseTemp = new IncreaseTemp(thermostat);
                            Command withLight = new DiscoMode(thermostat);
                            centralHub.addCommand(increaseTemp);
                            centralHub.addCommand(withLight);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("4")) {
                            Command decreaseTemp = new DecreaseTemp(thermostat);
                            centralHub.addCommand(decreaseTemp);
                            centralHub.clickButton();
                        }
                        else {
                            break;
                        }
                    }
                    break;

                case "music player": // for Music Player Device.
                    while (true) {
                        System.out.println("\nCommands you can do:");
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. Next Song");
                        System.out.println("4. Shuffle Songs");
                        System.out.println("5. Volume Up");
                        System.out.println("6. Volume Down");
                        System.out.println("7. Back to Device Available\n");
                        System.out.print("Choose command you want to do (1 - 7): ");
                        userWant = userInput.nextLine();
                        if (userWant.equals("1")) {
                            Command turnOnMusicPlayer = new TurnOn(musicPlayer);
                            centralHub.addCommand(turnOnMusicPlayer);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("2")) {
                            Command turnOffMusicPlayer = new TurnOff(musicPlayer);
                            centralHub.addCommand(turnOffMusicPlayer);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("3")) {
                            Command nextSong = new NextSong(musicPlayer);
                            Command rgbWithMusic = new RGBMode(musicPlayer);
                            centralHub.addCommand(nextSong);
                            centralHub.addCommand(rgbWithMusic);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("4")) {
                            Command shuffledSong = new ShuffledSong(musicPlayer);
                            Command discoWithMusic = new DiscoMode(musicPlayer);
                            centralHub.addCommand(discoWithMusic);
                            centralHub.addCommand(shuffledSong);
                            centralHub.clickButton();
                        }
                        else if(userWant.equals("5")){
                            Command volumeUp = new VolumeUp(musicPlayer);
                            centralHub.addCommand(volumeUp);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("6")) {
                            Command volumeDown = new VolumeDown(musicPlayer);
                            centralHub.addCommand(volumeDown);
                            centralHub.clickButton();
                        }
                        else {
                            break;
                        }
                    }
                    break;

                case "tv": // for Tv Device.
                    while (true) {
                        System.out.println("\nCommands you can do:");
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. Play Movie");
                        System.out.println("4. Stop Movie");
                        System.out.println("5. Volume Up");
                        System.out.println("6. Volume Down");
                        System.out.println("7. Back to Device Available\n");
                        System.out.print("Choose command you want to do (1 - 7): ");
                        userWant = userInput.nextLine();
                        if (userWant.equals("1")) {
                            Command turnOnTv = new TurnOn(tv);
                            centralHub.addCommand(turnOnTv);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("2")) {
                            Command turnOffTv = new TurnOff(tv);
                            centralHub.addCommand(turnOffTv);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("3")) {
                            Command playMovie = new PlayMovie(tv);
                            Command playMovieLight = new RGBMode(tv);
                            Command playMovieChill = new IncreaseTemp(tv);
                            centralHub.addCommand(playMovie);
                            centralHub.addCommand(playMovieChill);
                            centralHub.addCommand(playMovieLight);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("4")) {
                            Command stopMovie = new StopMovie(tv);
                            centralHub.addCommand(stopMovie);
                            centralHub.clickButton();
                        }
                        else if(userWant.equals("5")){
                            Command volumeUp = new VolumeUp(tv);
                            centralHub.addCommand(volumeUp);
                            centralHub.clickButton();
                        }
                        else if (userWant.equals("6")) {
                            Command volumeDown = new VolumeDown(tv);
                            centralHub.addCommand(volumeDown);
                            centralHub.clickButton();
                        }
                        else {
                            break;
                        }
                    }
                    break;

                default: // if user input is invalid.
                    System.out.println("Invalid device! Please try again.");
                    break;
            }

            // to prompt user if she/he want to continue the program.
            System.out.print("\nDo you want to use another device? (Y/N): ");
            String userChoiceB = userInput.nextLine();
            if (!userChoiceB.toLowerCase().equals("y")) {
                System.out.println("Program Terminated!");
                break;
            }

        }
        // close scanner.
        userInput.close();
    }
}
