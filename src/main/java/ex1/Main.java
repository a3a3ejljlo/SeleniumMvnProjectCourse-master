/*   Дз к 26.10 Создать простой maven проект
     реализовать программу, которая сможет вычислить площадь
     и периметр прямоугольника, 3-угольника и окружности.
     Написать Junit тесты для созданной программы:
     Проверить вычисление площади для каждой фигуры
     Проверить вычисление периметра для каждой фигуры */

package ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> list = Arrays.asList(new Circle(10), new Rectangle(10, 10), new Triangle(10, 10, 10));

        for (Figure figure : list) {
            System.out.println("Периметр " + figure.getClass().getSimpleName() + " равен: " + figure.calculatePerimetr());
            System.out.println("Площадь " + figure.getClass().getSimpleName() + " равна: " + figure.calculateSquare());
            ;
        }
    }
}
