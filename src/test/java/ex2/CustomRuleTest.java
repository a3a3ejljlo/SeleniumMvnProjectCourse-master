package ex2;

import ex1.Rectangle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.*;

public class CustomRuleTest {

    @Rule
    public CustomRule rule = new CustomRule();

    @Test @Ignore
    public void rectangleTest() {
        Rectangle rectangle = rule.getRectangle();
        Assert.assertEquals(rule.getA() * rule.getB(), rectangle.calculateSquare(), 0);
    }

    @Test @Ignore
    public void rectanglePerimeterTest() {
        Rectangle rectangle = rule.getRectangle();
        Assert.assertEquals(2 * (rule.getA() + rule.getB()), rectangle.calculatePerimetr(), 0);
    }
}