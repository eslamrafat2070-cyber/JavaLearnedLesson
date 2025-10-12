package chapter4;

import java.util.Scanner;

public class SearchLetterinAword {

    public static void  main(String[] args)
    {

        System.out.println("Plesae enter the Word ");
        Scanner scanner = new Scanner(System.in);
        String word=scanner.next();
        scanner.close();
        System.out.println("the word you entered is "+ word);
         Boolean flag=false;
        for ( int i =0 ; i< word.length() ; i++)
        {
            char currentletter=word.charAt(i);
            if (currentletter == 'A')
            {
                flag=true;
                break;
            }
        }
        if (flag)
            System.out.println("the word contains A ");
        else
        {
            System.out.println("the word contains  not have A ");
        }

    }
}
