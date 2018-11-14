package ex2;

import ex1.Circle;
import ex1.MyExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class ExeptionTestJunit5 {

    @Test @Ignore
    void calcPerimetrCircleTest() {
        Throwable exeption = Assertions.assertThrows(MyExeption.class, () -> new Circle(0).calculatePerimetr());
        Assertions.assertEquals("Некорректные значения", exeption.getMessage());
    }
}
