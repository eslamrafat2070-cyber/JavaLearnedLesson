package Chapter3;

import java.util.Scanner;

public class TesResult {

    public  static  void  main (String[] args) {

      System.out.println("Plesae enter the Score");
      Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();scan.close();
        char  grade ;

        scan.close();

        if (score < 60)
        {
         grade = 'f';
        }
        else if (score < 70)
        {
            grade = 'D';
        }

        else if (score < 80)
        {
            grade = 'C';
        }

        else if (score < 90)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }

        System.out.println(" your grade is "+ grade);
    }
}
