package ex1;

import java.util.List;

public class Console {
    private static void showValues(List<Figure> list) {
        for (Figure figure : list) {
            System.out.println("Периметр " + figure.getClass().getSimpleName() + " равен: " + figure.calculatePerimetr());
            System.out.println("Площадь " + figure.getClass().getSimpleName() + " равна: " + figure.calculateSquare());
        }
    }
}
