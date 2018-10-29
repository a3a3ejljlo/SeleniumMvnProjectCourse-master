package ex1;

public class Triangle extends Figure {

    private double wight;
    private double lenght;
    private double height;

    public Triangle(double wight, double lenght, double height) {
        if (wight <= 0 || lenght <=0 || height <=0) {
            throw new MyExeption("Некорректное значение");
        }
        this.wight = wight;
        this.lenght = lenght;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }


    public double getLenght() {
        return lenght;
    }


    public double getHeight() {
        return height;
    }


    @Override
    double calculateSquare() {
        double halfOfPerimeter = calculatePerimetr() / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - getWight() * (halfOfPerimeter - getLenght() * (halfOfPerimeter - getHeight()))));
    }

    @Override
    double calculatePerimetr() {
        return getHeight() + getLenght() + getWight();
    }
}
