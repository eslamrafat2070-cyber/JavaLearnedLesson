package Chapter3;

import java.util.Scanner;

public class CompareString {

    public  static void main(String[] args)
    {
        String Word1="Helow";
        String Word2="eslam";

        System.out.println("Plesae enter the name  : ");
        Scanner input = new Scanner(System.in);
        String inpitword = input.next();
        input.close();

         if (inpitword.equals(Word1)) {
             System.out.println("word is Helow");
         }
         else if (inpitword.equalsIgnoreCase(Word1))
         {
             System.out.println("word is Helow but not the same excatly");
         }
        else if (inpitword.equals(Word2)) {
            System.out.println("word is Eslam");
        }
        else {
             System.out.println("word is  not correct");
         }
    }



}
