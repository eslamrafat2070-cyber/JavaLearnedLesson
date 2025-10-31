package chapter4;

import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args){

        // varable declartion
        int numberofstudent=4;
        int numberoftests=2;
        Scanner scanner=new Scanner(System.in);

        for (int i=0 ; i<numberofstudent; i++)
        {
            double sum =0 ;
            for (int j=0 ; j<numberoftests; j++)
            {
                System.out.println("Plesae enter the Score of test  "+(j+1) +"for student "+(i+1));
                double degree = scanner.nextInt();
                sum=sum+degree;
            }
            double avrage = sum/numberoftests;
            System.out.println("the avrage score for student "+(i+1)+ "is"+avrage);
        }
           scanner.close();

    }
}
