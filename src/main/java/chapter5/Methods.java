package chapter5;

import java.util.Scanner;

public class Methods {

    public  static  void  main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plesae enter your name : ");
        String name = scan.next();
       greetUser(name);
    }
        public static void greetUser(String name )
    {
        System.out.println("Helo "+name);
    }
}
