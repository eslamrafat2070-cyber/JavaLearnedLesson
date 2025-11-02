package chapter6;

public  class Rectangle {

    private double length;
      private double width;

      public Rectangle(){
          System.out.println("A rectangle object has been created.");
      }
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }
   public void setWidth(double width) {
        this.width = width;
    }

    //get area
    public double getArea() {
        return calculateArea();
    }

    public void displayProperties() {
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

}