public class Rectangle extends Shape{
    private double height;
    private double widdth;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWiddth() {
        return widdth;
    }

    public void setWiddth(double widdth) {
        this.widdth = widdth;
    }

    public Rectangle(double height, double widdth) {
        this.height = height;
        this.widdth = widdth;
    }

    @Override
    double calaulateArea() {
        return widdth*height;
    }

    @Override
    double calaulateCircumference() {
        return 2*(widdth+height);
    }
}
