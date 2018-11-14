package ex8.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Maria on 12.11.2018.
 */
public class DepositListPage extends BasePageObject {


    @FindBy(xpath = "//div[@class='b-card__content']")
   public  List<WebElement> depositCollection;




}
