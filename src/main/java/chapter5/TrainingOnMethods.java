package chapter5;

import java.util.Scanner;

public class TrainingOnMethods {
static  Scanner  scan = new Scanner(System.in);
static double requiredsalary=2000;
static double requiredscore=30;


    public static void main(String[] args) {
       Double salary= ScanSalary();
       Double creditscore=ScanCreditScore();
       scan.close();
        boolean status = ReturnCandetateStatus(salary,creditscore);
        Result(status);
    }
    public static  double ScanSalary()
    {
        System.out.println("Please enter the salary ");
        return scan.nextDouble();
    }
    public static  double ScanCreditScore()
    {
        System.out.println("Please Credit Score");
        return scan.nextDouble();
    }
     public  static  boolean ReturnCandetateStatus(double salary , double score)
     {
         if(salary > requiredsalary && score > requiredscore) {
             return  true;
         }
         else { return  false ;}
     }
     public  static  void Result(boolean Status)
     {
         if (Status)
         {
             System.out.println("congratulations You are eligile ");
         }
         else
         {
             System.out.println("Sorry!!! You are not  eligile ");
         }
     }
}
