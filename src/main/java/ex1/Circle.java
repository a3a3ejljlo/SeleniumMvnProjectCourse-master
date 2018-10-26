package ex1;

public class Circle extends Figure {

    private double radius;


    private double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateSquare() {
        return Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    double calculatePerimetr() {
        return 2 * Math.PI * getRadius();
    }
}
