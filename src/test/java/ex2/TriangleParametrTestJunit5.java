package ex2;

import ex1.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleParametrTestJunit5 {

    @ParameterizedTest
    @CsvSource({"1, 1, 1, 3", "2, 2, 4, 8"})
    @DisplayName("Тест с параметрами")
    void testParams(double a, double b, double c, double square) {
        Assertions.assertEquals(square, new Triangle(a, b, c).calculatePerimetr());

    }
}

