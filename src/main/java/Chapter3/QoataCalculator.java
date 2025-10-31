package Chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
public class QoataCalculator {
      public  static  void main(String[] args){

          // variables declaration
          int   qoata =10;


          // get unknownws values
          Scanner scan= new Scanner(System.in);
           System.out.println("please enter the number of the sales thi sweek ");
           int Sales = scan.nextInt();
           scan.close();
          // make the desion and show the result\
          if (Sales >=10)
              System.out.println("you got the bounce ");
          else {
              int to_meet_the_ecpectation = qoata - Sales;
              System.out.println("you  not met  the expectation you need a  " + to_meet_the_ecpectation);
          }
      }
}
