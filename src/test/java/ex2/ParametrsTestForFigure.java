package ex2;

import ex1.Circle;
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
        return Arrays.asList(new Object[][]{{2,2,4},{1, 2, 3}
        });
    }

    @Parameterized.Parameter
    public double number1;

    @Parameterized.Parameter(1)
    public double number2;

    @Parameterized.Parameter(2)
    public double result;

    @Test
    public void testMethod() {
        Assert.assertEquals(result, new Circle(0));
    }

}
