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

    public double getWidth() {
        return width;
    }


    public double getLength() {
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
