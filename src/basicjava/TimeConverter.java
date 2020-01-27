package basicjava;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String [] args) {
        System.out.println("Enter the hours:");
        Scanner inputHours = new Scanner(System. in);
        int hours = inputHours.nextInt();
        System.out.println("Enter the minutes:");
        Scanner inputMinutes = new Scanner(System. in);
        int minutes = inputMinutes.nextInt();
        System.out.println("Enter the seconds:");
        Scanner inputSeconds = new Scanner(System. in);
        int seconds = inputSeconds.nextInt();
        System.out.println(TimeConverter(hours, minutes, seconds));
    }

    public static int TimeConverter(int hours, int minutes, int seconds){
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
}
