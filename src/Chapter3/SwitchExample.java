package Chapter3;

import chapter5.TrainingOnMethods;

import java.util.Scanner;

public class SwitchExample {
    public static void main (String[] args) {

        System.out.println("Plesae enter the string degree ");
        Scanner scan = new Scanner(System.in);
          String degree =scan.next();

          String message ;
          switch (degree)
          {
              case "A":
                  message = "Excelent job ";
                  break;
              case "B":
                  message ="VERYgood job";
                  break;
              case "C":
                  message ="good job";
                  break;
              case "D":
                  message ="accepted job";
                  break;

              case "F":
                  message ="not accepted job";
                  break;

              default:
                  message ="Erour grade ";
                  break;
          }
          System.out.println(message);
    }
}
