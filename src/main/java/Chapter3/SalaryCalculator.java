package Chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public  static  void  main (String[] args) {


        // Declaration of salary and bounce
        int salary = 1000;
        int bounce=250;
        int qoata =10;
        // get the number of sales  from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Please enter the sales number ");
            int Sales = scanner.nextInt();
            scanner.close();

            if (Sales > qoata) {
                salary = salary + bounce;
            }
        System.out.println("your salary is =  " + salary);
        }
}
