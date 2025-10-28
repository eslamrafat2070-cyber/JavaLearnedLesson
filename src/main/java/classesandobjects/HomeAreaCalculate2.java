package classesandobjects;

import java.util.Scanner;

public class HomeAreaCalculate2 {



 public static Rectangle SetRoomDimention( Scanner scan )
 {
     double l ,w;

     System.out.println("plesae enyter the lengh of the Rectangle ");
     l = scan.nextDouble();
     System.out.println("plesae enyter the width of the Rectangle  ");
     w = scan.nextDouble();
     Rectangle Rectangle1 = new Rectangle(l ,w );
     return Rectangle1;
     }

  public static   double homearea(Rectangle REC2 , Rectangle REC1)
  {

      double homeareaa=REC1.Calarea()+REC2.Calarea();
      return homeareaa;
  };
 public  static void main(String[] args)
 {

    Rectangle romm1;
    Rectangle romm2;
    Scanner scan = new Scanner(System.in);
    romm1 = SetRoomDimention(scan);
    romm2= SetRoomDimention(scan);
    scan.close();
    double totalarea = homearea(romm2, romm1);
    System.out.println("the total area is " +totalarea);


 }
}
