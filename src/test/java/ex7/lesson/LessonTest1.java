package ex7.lesson;

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LessonTest1 extends BaseTest {

    @Test @Ignore
    public void testMetod() {

        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/");

        click(driver.findElement(By.xpath("//icon-close[@class='one-click-popup__close icon']")));
        click(driver.findElement(By.xpath("//*[text()='Перевести']")));
        click(driver.findElement(By.xpath("//*[text()='Клиенту банка']/..")));
        selectInput(driver.findElement(By.xpath("//c-select")), "Мой счет в рублях");
        click(driver.findElement(By.xpath("//*[text() = 'По номеру телефона']")));
        fillField(driver.findElement(By.xpath("//c-input-phone/input[contains(@class,'c-input-phone__input')]")), "79122322423");

        Assert.assertEquals("Сидоров П.И.", driver.findElement(By.xpath("//label[text()='ФИО получателя']/../following-sibling::div//div")).getText());

        fillField(driver.findElement(By.xpath(" //ruble-transfer-form-amount//input")), "0");

        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//span[@class='simple-error']"))));
        Assert.assertEquals("Сумма перевода должна быть больше 0", driver.findElement(By.xpath("//span[@class='simple-error']")).getText());

        fillField(driver.findElement(By.xpath(" //ruble-transfer-form-amount//input")), "20000000000");

        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//span[@class='simple-error']"))));
        Assert.assertEquals("Введенная сумма превышает максимально допустимую (1 000 000,00 \u20BD)", driver.findElement(By.xpath("//span[@class='simple-error']")).getText());

        fillField(driver.findElement(By.xpath(" //ruble-transfer-form-amount//input")), "100");

        Assert.assertEquals("0,00 \u20BD", driver.findElement(By.xpath("//label[text() = 'Комиссия']/parent::div//following-sibling::div//amount[@class= 'c-amount c-amount_inline ng-star-inserted']")).getText());


        fillField(driver.findElement(By.xpath("//div[@class='rc-row__value']/textarea")), "test");


        click(getDriver().findElement(By.xpath("//span[@class = 'ng-star-inserted'][text() = 'Перевести']")));

        Assert.assertEquals("79122322423", getText(driver.findElement(By.xpath("//div[text() = 'По номеру телефона:']/following-sibling::div"))));
        Assert.assertEquals("Сидоров Петр Иванович", getText(driver.findElement(By.xpath("//div[text() = 'ФИО получателя:']/following-sibling::div"))));
        Assert.assertEquals("100,00 \u20BD", getText(driver.findElement(By.xpath("//div[text() = 'Сумма перевода:']/following-sibling::div"))));
        Assert.assertEquals("Комиссия не взимается", getText(driver.findElement(By.xpath("//div[text()='Комиссия']/following-sibling::div"))));


    }

    public void selectInput(WebElement element, String value) {
        element.click();
        click(element.findElement(By.xpath("//*[text()='" + value + "']")));
    }

}
