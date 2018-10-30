package ex2;

import ex1.Circle;
import ex1.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrsTestForFigure {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{2,2,4,8},{1, 2, 3,6},{10,12,12,34}
        });
    }

    @Parameterized.Parameter
    public double number1;

    @Parameterized.Parameter(1)
    public double number2;

    @Parameterized.Parameter(2)
    public double number3;

    @Parameterized.Parameter(3)
    public double result;

    @Test
    public void testMethod() {
        Assert.assertEquals(result, new Triangle(number1,number2,number3).calculatePerimetr(),0);
    }

}
