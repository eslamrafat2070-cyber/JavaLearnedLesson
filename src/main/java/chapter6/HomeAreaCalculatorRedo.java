package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
   private final Scanner  scanner= new Scanner(System.in);
   public   static void main(String[] args) {
       HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
       Rectangle room1 = calculator.getRoomDimensionsFromUser();
        room1.displayProperties();
        //for second room
        Rectangle room2 =calculator.getRoomDimensionsFromUser();
        room2.displayProperties();
        // total area
        double totalArea = calculator.calculatTotal(room1, room2);
        System.out.println("the total area of the two rooms is : " + totalArea);
   }

         public Rectangle getRoomDimensionsFromUser() {
        System.out.println("please enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.println("please enter the width of the room: ");
        double width = scanner.nextDouble();
        Rectangle room = new Rectangle();
        room.setLength(length);
        room.setWidth(width);
        return room;
    }

    public  double calculatTotal(Rectangle room1 , Rectangle room2)
    {
        return room1.getArea() + room2.getArea();
    }

}
