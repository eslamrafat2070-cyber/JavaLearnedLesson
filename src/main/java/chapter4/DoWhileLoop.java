package chapter4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int cheker = 1;    // this variable is used to check if the user wants to continue entering values
        int sum; // this variable is used to store the entered value
        int sum2 = 0; // this variable is used to store the sum of all entered values
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("enter the value ");
            sum = scan.nextInt();
            sum2 = sum2 + sum;
            System.out.println(" do you need to enter the value " +
                    "plesae press 1 if you need to close press any number   ");
            cheker = scan.nextInt();

        } while (cheker == 1);
        scan.close();
        System.out.println(" the final sum is " + sum2);
    }
}