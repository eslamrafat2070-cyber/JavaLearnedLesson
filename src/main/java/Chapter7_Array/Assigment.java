package Chapter7_Array;

import java.util.Scanner;

public class Assigment {

    String[] weekdays = {"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"};

    public String getDay(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            return weekdays[dayNumber - 1];
        } else {
            return "Invalid day number. Please enter a value between 1 and 7.";

        }
    }

    public static void main(String[] args) {
        Assigment assigment = new Assigment();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();
        scanner.close();
        System.out.println(assigment.getDay(dayNumber));
    }
}


