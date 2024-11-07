public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculateCircumference() {
        return 2 * (width + height);
    }
}
