package Lab03;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Lab03, 80 Point Version\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Which version would you like to run?: 1) 80 Point Version, 2) 100 Point Version\n");
        if (sc.nextInt() == 1) {
            System.out.print("How many seconds?: ");

            int startingSeconds = sc.nextInt();
            int hours = startingSeconds / 3600;
            int remainder = startingSeconds % 3600;
            int minutes = remainder / 60;
            int seconds = remainder % 60;

            System.out.println("Starting seconds: \t" + startingSeconds);
            System.out.println("Hours: \t\t\t\t" + hours);
            System.out.println("Minutes: \t\t\t" + minutes);
            System.out.println("Seconds: \t\t\t" + seconds);
        }
        if (sc.nextInt() == 2) {
            System.out.print("How many milliseconds?: ");

            int startingMilliseconds = sc.nextInt();
            int hours = startingMilliseconds / 3600000;
            int remainder = startingMilliseconds % 3600000;
            int minutes = remainder / 60000;
            int remainder2 = remainder % 60000;
            int seconds = remainder2 / 1000;
            int milliseconds = remainder2 % 1000;

            System.out.println("Starting milliseconds: \t" + startingMilliseconds);
            System.out.println("Hours: \t\t\t\t\t" + hours);
            System.out.println("Minutes: \t\t\t\t" + minutes);
            System.out.println("Seconds: \t\t\t\t" + seconds);
            System.out.println("Milliseconds: \t\t\t" + milliseconds);
        }

    }
}
