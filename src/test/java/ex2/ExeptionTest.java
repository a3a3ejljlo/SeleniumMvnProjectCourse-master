package ex2;

import ex1.Addition;
import ex1.MyExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExeptionTest {

    @Test
    void additionTest() {
        Throwable exeption = Assertions.assertThrows(MyExeption.class, () -> new Addition(3, 4).calcResult());
        Assertions.assertEquals("Новое исключение", exeption.getMessage());
    }
}
