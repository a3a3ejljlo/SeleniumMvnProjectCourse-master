package ex2;

import ex1.Circle;
import ex1.MyExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExeptionTest {

    @Test
    void additionTest() {
        Throwable exeption = Assertions.assertThrows(MyExeption.class, () -> new Circle(0).calculatePerimetr());
        Assertions.assertEquals("Некорректные значения", exeption.getMessage());
    }
}
