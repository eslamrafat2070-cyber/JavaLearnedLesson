package chapter2;

import java.util.Scanner;

public class Assigmnet {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a season of the year:");
        String theSeason = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + theSeason +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
