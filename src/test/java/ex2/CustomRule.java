package ex2;

import ex1.Rectangle;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class CustomRule implements TestRule {


    private Rectangle rectangle;
    private double a;
    private double b;

    @Override
    public Statement apply(Statement statement, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Before test");
                a = rectangle.getLength();
                b = rectangle.getWidth();
                rectangle = new Rectangle(a, b);
            }
        };
    }
}

