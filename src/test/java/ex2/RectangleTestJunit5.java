package ex2;

import ex1.MyExeption;
import ex1.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class RectangleTestJunit5 {

    @Test @Ignore
    void calculatePerimeterTest() {
        Throwable exception = Assertions.assertThrows(MyExeption.class,
                () -> {
                    new Rectangle(1, 0).calculatePerimetr();
                });

        Assertions.assertEquals("Некорректные значения", exception.getMessage());
    }
}

