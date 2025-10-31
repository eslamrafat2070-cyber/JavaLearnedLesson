package Chapter3;

import java.util.Scanner;

public class AssigmanetOnChapter3 {


   public static  void  main(String[] arr)
   {

       while (true) {
           System.out.println("Plesae enter the value Required ");
           Scanner scan = new Scanner(System.in);
           int value = scan.nextInt();

           switch (value) {
               case 1:
                   System.out.println("you enter 1  ");
                   break;
               case 2:
                   System.out.println("you enter 2 ");
                   break;
               case 3:
                   System.out.println("you entered 3   ");
                   break;
               default:
                   System.out.println("re gain the Example11");
                   break;
           }
       }

   }
}
