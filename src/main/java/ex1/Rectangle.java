package ex1;

public class Rectangle extends Figure {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    private double getWidth() {
        return width;
    }


    private double getLength() {
        return length;
    }


    @Override
    double calculateSquare() {
        return getLength() * getWidth();
    }

    @Override
    double calculatePerimetr() {
        return 2 * (getLength() + getWidth());
    }
}
