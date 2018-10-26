package ex2;

import ex1.Addition;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");

    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @Test
    @DisplayName("Проверка операции сложения")
    void testMethod() {
        Addition addition = new Addition(3, 4);
        Assertions.assertEquals(3 + 4, addition.calcResult());
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }
}
