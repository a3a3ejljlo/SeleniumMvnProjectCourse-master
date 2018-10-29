package ex1;

public class Circle extends Figure {

    private double radius;


    private double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new MyExeption("Некорректное значение");
        }
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculatePerimetr() {
        return 2 * Math.PI * getRadius();
    }
}
