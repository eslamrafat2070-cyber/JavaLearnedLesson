package chapter5;

import java.util.Scanner;

public class TraningOntheChapter {

    //Enter base cost of the plan:
    public static double enterBaseCost(Scanner scanner) {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }
    public static double enterAverageMinutes(Scanner scanner) {
        System.out.println("Enter average menu its:");
        return scanner.nextDouble();
    }
    public static void getThePhoneBillStatement()
    {
        System.out.println("the Phone bill Statement ");
    }
      public static void getTheCrrentPlan(double plan)
    {
        System.out.println("Plan: "+plan);
    }
      public  static  double claculateTheOverageMinutes(double minutes)
    {
        System.out.println("OverageMinutes: "+(minutes*0.25));
        return minutes*0.25;
    }
        public  static  double calaculateTheTax(double plan , double overage)
        {
            double tax = (plan+overage)*0.15;
            System.out.println("Tax: "+tax);
            return tax;
        }
        public  static  double calaculateTheTotalAmount(double plan , double overage , double tax)
        {
            double total = plan + overage + tax;
            System.out.println("Total Amount: "+total);
            return total;
        }
        public static void main (String[] args)
        {
            // variable declaration
            Scanner scanner = new  Scanner(System.in);
            double plan;
            double minutes;
            // method calls
            plan = enterBaseCost(scanner);
            // enter the average minutes
            minutes = enterAverageMinutes(scanner);
            // display the phone bill statement
            getThePhoneBillStatement();
            //  display the current plan
            getTheCrrentPlan(plan);
            //  calculate the overage minutes
            double overage = claculateTheOverageMinutes(minutes);
            // calculate the tax
            double tax = calaculateTheTax(plan , overage);
            // calculate the total amount
            calaculateTheTotalAmount(plan , overage , tax);
            // close the scanner
            scanner.close();
        }

}
