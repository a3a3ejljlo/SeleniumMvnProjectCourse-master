package ex1;

import org.junit.Rule;
import org.junit.*;

public class MyExeptionTest {

    @Test @Ignore(expected = MyExeption.class)
    public void testExeption() {
        Main main = new Main();
        main.main(null);
    }

}
