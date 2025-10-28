package Chapter2;
import java.util.Scanner;

public class GrossPayCalculator {

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
