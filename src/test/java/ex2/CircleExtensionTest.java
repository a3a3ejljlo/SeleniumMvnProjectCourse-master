package ex2;

import ex1.Circle;
import ex1.MyExeption;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.fail;

public class CircleExtensionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testRule() {
        expectedException.expect(MyExeption.class);
        expectedException.expectMessage("Некорректное значение");
        new Circle(0);
    }

    @Test(expected = MyExeption.class)
    public void circleTest() {
        new Circle(0);
    }


    @Test
    public void trainExeption() {
        try {
            new Circle(0);
            fail("Некорректное исключение");
        } catch (MyExeption exeption) {
            System.out.println("Ожидаемое значение");
        }
    }


}
