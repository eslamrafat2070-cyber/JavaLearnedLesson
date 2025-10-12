package classesandobjects;

public class HomeAreaCalculator {

    public static void main(String[] args)
    {
        Rectangle firstroom = new Rectangle();
        firstroom.setLengh(20);
        firstroom.setWidth(10);
         double lengh = firstroom.getLengh();
        double width =  firstroom.getWidth();
        double Area= firstroom.Calarea();

        System.out.println(Area);
    }
}
