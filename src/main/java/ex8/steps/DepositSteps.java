package ex8.steps;

import ex8.pages.DepositPage;
import ex8.util.DriverManager;
import org.junit.Assert;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebElement;

public class DepositSteps {


    DepositPage depositPage = new DepositPage();



    public void fillField(String name, String value) throws Exception {

        WebElement element = depositPage.getField(name);
        depositPage.fillField(element,value);
    }

    public void click(String name) throws Exception{

        WebElement element = depositPage.getField(name);
        depositPage.click(element);
    }

    public void checkFile(String name, String value) throws Exception{

        WebElement element = depositPage.getField(name);
        Assert.assertEquals(value, element.getAttribute("value"));
    }

    public void checkFieldIsEnabled(String name) throws Exception{

        WebElement element = depositPage.getField(name);
        Assert.assertTrue(String.format("Поле(%s) недоступно", name), element.isEnabled());
    }

    public void selectInput(String field, String value) throws Exception{

        WebElement element = depositPage.getField(field);
        depositPage.selectInput(element,value);
    }

//    public void checkFieldIsPresent(String name) throws Exception {
//        try {
//            DriverManager.getDriver().manage().timeouts().implicitlyWait(2, )
//        }
//    }


}
