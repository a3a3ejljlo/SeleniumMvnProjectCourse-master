package ex8;

import ex8.pages.MainPage;
import ex8.steps.BaseSteps;
import org.junit.Test;

public class DepositTest extends BaseSteps {

    @Test
    public void testMethod() {
        MainPage mainPage = new MainPage();
        mainPage.selectMenuItem("Вклады");

    }
}
