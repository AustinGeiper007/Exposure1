package Lab03;

public class AGLab03 {
    public static void main(String[] args) {
        // Initializing variables
        int startingMilliseconds = 10000123;
        int hours;
        int minutes;
        int seconds;
        int miliseconds;

        // Do the math (they did the monster math)
        hours = startingMilliseconds / 3600000;
        minutes = (startingMilliseconds - hours * 3600000) / 60000;
        seconds = (startingMilliseconds - hours * 3600000 - minutes * 60000) / 1000;
        miliseconds = (startingMilliseconds - hours * 3600000 - minutes * 60000 - seconds * 1000);

        // Print it so you can actually see what happened!
        System.out.println("Lab03: 100 pt version \n");
        System.out.println("Starting Miliseconds: \t" + startingMilliseconds);
        System.out.println("Hours: \t\t\t\t\t" + hours);
        System.out.println("Minutes: \t\t\t\t" + minutes);
        System.out.println("Seconds: \t\t\t\t" + seconds);
        System.out.println("Milliseconds: \t\t\t" + miliseconds);

    }


}
