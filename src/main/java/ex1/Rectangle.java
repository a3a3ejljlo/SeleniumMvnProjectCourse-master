package ex1;

public class Rectangle extends Figure {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width <= 0 || length <=0) {
            throw new MyExeption("Некорректное значение");
        }
        this.width = width;
        this.length = length;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double getWidth() {
        return width;
    }


    public double getLength() {
        return length;
    }


    @Override
    public double calculateSquare() {
        return getLength() * getWidth();
    }

    @Override
    public double calculatePerimetr() {
        return 2 * (getLength() + getWidth());
    }
}
