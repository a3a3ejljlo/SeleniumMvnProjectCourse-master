package ex8.pages;

import ex8.util.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageObject {

    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 5);

    public BasePageObject() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void selectMenuItem(List<WebElement> items, String item) {
        for (WebElement item : items; ) {
            if (item.getText().e) {
                item.click();
            }
        }
        selectMenuItem(main);
    }

}
