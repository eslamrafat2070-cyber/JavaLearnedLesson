package chapter4;

import java.util.Scanner;

public class WhileLoop {

    public static   void main(String[] args) {
        // declaration
        int rate = 12 , maxhours=40;

        System.out.println("How many hours did you work this week ");
        Scanner scanner = new Scanner(System.in);
        int hoursworked= scanner.nextInt();

        //validate input
        while (hoursworked > maxhours)
        {
            System.out.println("you should enter a value between 0 nad 40  ");
            System.out.println("How many hours did you work this week ");
             hoursworked= scanner.nextInt();
        }
        scanner.close();
        System.out.println("congratulation now you are out of the loop !!! ");
        //Calculate gross
        double gross = rate * hoursworked;
        System.out.println("Gross pay: $" + gross);


    }
}
