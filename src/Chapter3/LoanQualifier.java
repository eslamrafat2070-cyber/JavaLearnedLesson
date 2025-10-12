package Chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static  void main (String[] args)
    {

        // intialization

        int required_salary=3000;
        int required_years=2;
     // need to khnow the salary from the use
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the salary of the employee");
        int salary= scan.nextInt();

        // neeed to know the years that have been
        System.out.println("Please enter the years of the employee");
        int Years= scan.nextInt();
        scan.close();

        // we need to compare
        if (salary >=required_salary ) {
            if (Years >= required_years) {
                System.out.println("You are eligible to have a loan ");
            }
            else {

                System.out.println("you shuold be at least 2 years at your current job");
            }
        }
        else {
            System.out.println("your salay should be at least 30000 or abobe ");
        }
        // get the decision
    }
}
