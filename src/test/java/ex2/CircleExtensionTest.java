package ex2;

import ex1.Circle;
import ex1.MyExeption;
import org.junit.Rule;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;

public class CircleExtensionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test @Ignore
    public void testRule() {
        expectedException.expect(MyExeption.class);
        expectedException.expectMessage("Некорректное значение");
        new Circle(0);
    }

    @Test @Ignore(expected = MyExeption.class)
    public void circleTest() {
        new Circle(0);
    }


    @Test @Ignore
    public void trainExeptionCalculateSquare() {
        try {
            new Circle(0).calculateSquare();
            fail("Expected an MyExeption to be thrown");
        } catch (MyExeption exeption) {
            assertThat(exeption.getMessage(), is("Некорректное значение"));
        }
    }

    @Test @Ignore
    public void trainExeptionCalculatePerimetr() {
        try {
            new Circle(0).calculatePerimetr();
            fail("Expected an MyExeption to be thrown");
        } catch (MyExeption exeption) {
            assertThat(exeption.getMessage(), is("Некорректное значение"));
        }
    }


}
