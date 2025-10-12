package classesandobjects;

public class Rectangle {

     private  double  lengh ,width;

    public Rectangle()
    {
        lengh=0;
        width=0;
    }
    public  Rectangle(double lengh, double width)
    {
        this.lengh=lengh;
        this.width=width;
    }
    public double getLengh()
    {
        return lengh;
    }
     public  void setLengh(double lengh)
    {
        this.lengh=lengh;
    }
     public  double getWidth()
    {
        return  width;
    }
     public  void setWidth(double width)
    {
        this.width=width;
    }
    public   double Calarea() {
        double area = width*lengh;
        return area;
    }
    public  double Calpre() {
        double pre = width*2 +lengh*2;
        return pre;
    }
}
