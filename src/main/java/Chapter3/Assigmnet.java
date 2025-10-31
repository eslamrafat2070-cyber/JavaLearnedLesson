package Chapter3;

import java.util.Scanner;

public class Assigmnet {

    public static void main(String arr[]){

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the Penenis ");
            int pnenis = scanner.nextInt();

            System.out.println("Please enter the nickels ");
            int nickels = scanner.nextInt();

            System.out.println("Please enter the Dimes ");
            int Dimes = scanner.nextInt();

            System.out.println("Please enter the Quarters ");
            int Quarters = scanner.nextInt();

            int total = pnenis + nickels * 5 + Dimes * 10 + Quarters * 25;

            if (total == 100) {
                System.out.println("you win thw game  ");
            } else if (total > 100) {
                System.out.println("you not win but it is above by  " + (total - 100));
            } else {
                System.out.println("you not win but it is down by   " + (100 - total));
            }
            scanner.close();
        }
    }
}
