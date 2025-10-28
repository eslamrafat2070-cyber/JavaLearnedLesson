package ClassAsAMethodParameter;

import classesandobjects.Rectangle;


public class VoluMCalculation {


    public  static   double volumcalculator (int Lengh , Rectangle rectabgle )
    {

        Double volum = Lengh*rectabgle.Calarea();
        return  volum;
    }

    public  static  void main(String[] args)
    {
        Rectangle room1=new Rectangle(10,20)     ;

         double volum = volumcalculator(10,room1);

         System.out.println(volum);

    }


}
