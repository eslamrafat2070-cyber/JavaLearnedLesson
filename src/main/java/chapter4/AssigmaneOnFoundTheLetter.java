package chapter4;

import java.util.Scanner;

public class AssigmaneOnFoundTheLetter {

    public static  void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plesae enter the Word ");
        String word = scanner.next();
        scanner.close();

        if (word.equalsIgnoreCase("A")) {
            System.out.println("the word contains A ");
        } else {
            System.out.println("the word does not contain A ");
        }
    }
}