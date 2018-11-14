package ex1;

import org.junit.Ignore;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    Circle circle = new Circle(10);


    @Test @Ignore
    public void calculateSquare() {
        assertEquals(314.1592653589793,circle.calculateSquare(),0);
    }

    @Test @Ignore
    public void calculatePerimetr() {
        assertEquals(62.83185307179586,circle.calculatePerimetr(),0);
    }
}