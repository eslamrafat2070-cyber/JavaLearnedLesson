package chapter5;

import java.util.Scanner;

public  class TraningOnMethodsByMyself {

public static void  main (String[] args)
{
    Scanner scanner = openTheScanner();
    double salary = getTheSalaryFromUser(scanner);
    double score = getTheCreditScoreFromUser(scanner);
    checkIfTheCandidateIsEligible(salary , score);
    closeTheScanner(scanner);

}
       public static Scanner openTheScanner()
       {
           return new Scanner(System.in);
       }
     public  static double getTheSalaryFromUser(Scanner scanner)
     {
         System.out.println("Please enter your salary : ");
         return scanner.nextDouble();
     }
        public  static double getTheCreditScoreFromUser(Scanner scanner)
        {
            System.out.println("Please enter your credit score : ");
            return scanner.nextDouble();

        }
        public  static void checkIfTheCandidateIsEligible(double salary , double score)
        {
              double requiredSalary = 2000;
              double requiredScore = 30;
            if (salary > requiredSalary && score > requiredScore)
            {
                System.out.println("Congratulations You are eligible ");
            }
            else
            {
                System.out.println("Sorry!!! You are not eligible ");
            }
        }

        static  void  closeTheScanner(Scanner scanner)
        {
            scanner.close();
        }
}

