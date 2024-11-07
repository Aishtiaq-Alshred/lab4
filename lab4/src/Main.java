//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Circle c1 = new Circle(10, 15, 5);
       System.out.println("Coordinates of the Circle: (" + c1.getX() + ", " + c1.getY() + ")");
       System.out.println("Radius of the Circle: " + c1.getRadius());
       System.out.println("Area of the Circle: " + c1.calculateArea());
       System.out.println("Circumference of the Circle: " + c1.calculateCircumference());

       System.out.println("-------------------------------------------------");



       Rectangle r1 = new Rectangle(5, 10, 10, 5);
       System.out.println("Coordinates of the Rectangle: (" + r1.getX() + ", " + r1.getY() + ")");
       System.out.println("Height of the Rectangle: " + r1.getHeight());
       System.out.println("Width of the Rectangle: " + r1.getWidth());
       System.out.println("Area of the Rectangle: " + r1.calculateArea());
       System.out.println("Circumference of the Rectangle: " + r1.calculateCircumference());

       System.out.println("-------------------------------------------------");


       Triangle t1 = new Triangle(20, 25, 4, 15);
       System.out.println("Coordinates of the Triangle: (" + t1.getX() + ", " + t1.getY() + ")");
       System.out.println("Height of the Triangle: " + t1.getHeight());
       System.out.println("Base of the Triangle: " + t1.getBase());
       System.out.println("Area of the Triangle: " + t1.calculateArea());
       System.out.println("Circumference of the Triangle: " + t1.calculateCircumference());
    }

}