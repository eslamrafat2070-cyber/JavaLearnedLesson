package chapter4;

import java.util.Scanner;

public class forloop {



    public static void main(String[] args) {

        int sum;
        int sum2 = 0;
        int qunatay=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value  Quantaty");
        qunatay= scan.nextInt();

        for (int i=1 ; i<(qunatay) ; i++) {
            System.out.println("enter the value number  " + i);
            sum = scan.nextInt();
            sum2 = sum2 + sum;
        }
        scan.close();
        System.out.println(" the final sum is " + sum2);
    }
}
