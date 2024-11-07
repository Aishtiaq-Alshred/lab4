public class Triangle extends Shape{
    private  double height;
    private   double base;

    public Triangle(int x, int y, double height, double base) {
        super(x, y);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    double calculateCircumference() {
        return base * 3; // لمثلث متساوي الأضلاع
    }
}
