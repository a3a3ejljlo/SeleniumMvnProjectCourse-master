package ex1;

import org.junit.Assert;
import org.junit.*;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle = new Triangle(3,4,3);


    @Test @Ignore
    public void calculateSquare() {
        Assert.assertEquals(8.366600265340756,triangle.calculateSquare(),0);
    }

    @Test @Ignore
    public void calculatePerimetr() {
        Assert.assertEquals(10,triangle.calculatePerimetr(),0);
    }


}