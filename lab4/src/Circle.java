public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calaulateArea() {
        return 3.14*radius*radius;
    }

    @Override
    double calaulateCircumference() {
        return 2*3.14*radius;
    }
}
