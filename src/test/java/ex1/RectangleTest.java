package ex1;

import org.junit.*;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(10, 10);

    @Test @Ignore
    public void calculateSquare() {
        assertEquals(100, rectangle.calculateSquare(), 0);
    }

    @Test @Ignore
    public void calculatePerimetr() {
        assertEquals(40, rectangle.calculatePerimetr(), 0);
    }
}