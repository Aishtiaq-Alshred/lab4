//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Circle c1=new Circle(5);
        System.out.println("Radius of the circle "+c1.getRadius());
        System.out.println("Area of the circle "+c1.calaulateArea());
        System.out.println("Circumference of the circle "+c1.calaulateCircumference());

        System.out.println("-------------------------------------------------");

        Rectangle r1=new Rectangle(10,5);
        System.out.println("heigh of the Rectangle "+r1.getHeight());
        System.out.println("width of the Rectangle "+r1.getWiddth());
        System.out.println("Area of the Rectangle "+r1.calaulateArea());
        System.out.println("Circumference of the Rectangle "+r1.calaulateCircumference());

        System.out.println("-------------------------------------------------");

        Triangle t1=new Triangle(4,15);
        System.out.println("heigh of the Triangle "+t1.getHeight());
        System.out.println("Base of the Triangle "+t1.getBase());
        System.out.println("Area of the Triangle "+t1.calaulateArea());
        System.out.println("Circumference of the Triangle"+t1.calaulateCircumference());
    }

}