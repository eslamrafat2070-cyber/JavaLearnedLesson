package chapter2;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class GrossPayCalculator {
    private static final Logger Log = LoggerFactory.getLogger(GrossPayCalculator.class);
    public static void main(String arg[]){

        Scanner scanner=new Scanner(System.in);

        //1- read the hours
        System.out.println("Enter the number of hrs =");
         int hours = scanner.nextInt();

         // 2- read the rate
         System.out.println("Enter the  Pay rate of the Employees =  ");
        double  rate = scanner.nextDouble();

        // 3- close the scanner
        scanner.close();
        // 4- calculate the gross
         double gross = hours*rate;
         System.out.println("the gross is = "+gross +   "and the  rate is " + rate);
            }

}
