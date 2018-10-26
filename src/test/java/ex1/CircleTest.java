package ex1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle circle = new Circle(10);

    @Test
    public void calculateSquare() {
        assertEquals(314.1592653589793,circle.calculateSquare(),0);
    }

    @Test
    public void calculatePerimetr() {
        assertEquals(62.83185307179586,circle.calculatePerimetr(),0);
    }
}