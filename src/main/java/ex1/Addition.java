package ex1;

public class Addition {

    double number1;
    double number2;

    public Addition(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double calcResult() {
        return number1 + number2;
    }
}
