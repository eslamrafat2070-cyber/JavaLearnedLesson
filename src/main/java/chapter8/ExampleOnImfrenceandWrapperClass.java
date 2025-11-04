package chapter8;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ExampleOnImfrenceandWrapperClass {

     public static void  main(String[] args) {
        var x=9.0f;
        Float y = x;
        double i = 33;

        var u=9;
        Integer v = u;
         System.out.println(y.toString());
         ArrayList<Integer> numbers = new ArrayList<>(); // ✅ صح
            numbers.add(10); // ✅ صح
            numbers.add(20); // ✅ صح
            numbers.add(30); // ✅ صح

            System.out.println("Numbers: " + numbers.get(0));
            System.out.println("Numbers: " + numbers.get(1));
            System.out.println("Numbers: " + numbers.get(2));
            System.out.println("Numbers: " + numbers);

    }

}
