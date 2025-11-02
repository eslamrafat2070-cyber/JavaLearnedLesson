package chapter6;

import org.testng.annotations.Test;

public class HomeAreaCalculator {

    @Test
    public void sampleTest() {
        System.out.println("This is a sample test method.");

        Rectangle room1 = new Rectangle();
        Rectangle room2 = new Rectangle();
        room1.setLength(5.0);
        room1.setWidth(3.0);
        room1.displayProperties();
        room2.setLength(5.0);
        room2.setWidth(3.0);
        room2.displayProperties();
        System.out.println("Total Area of the Home: " + (room1.getArea() + room2.getArea()));
    }
}
