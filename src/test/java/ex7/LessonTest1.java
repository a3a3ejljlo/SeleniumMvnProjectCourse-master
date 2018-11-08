package ex7;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LessonTest1 extends BaseTest {

    @Test
    public void testMetod() {

        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/");

        click(driver.findElement(By.xpath("//icon-close[@class='one-click-popup__close icon']")));
        click(driver.findElement(By.xpath("//*[text()='Перевести']")));
        click(driver.findElement(By.xpath("//*[text()='Клиенту банка']/..")));
        selectInput(driver.findElement(By.xpath("//c-select")), "Мой счет в рублях");
        click(driver.findElement(By.xpath("//*[text() = 'По номеру телефона']")));
        fillField(driver.findElement(By.xpath("//c-input-phone/input[contains(@class,'c-input-phone__input')]")), "78988989988");

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


        fillField(driver.findElement(By.xpath("//textarea[@class='c-textarea c-input ng-pristine ng-valid ng-touched']")), "100");


        click(getDriver().findElement(By.xpath("//span[@class = 'ng-star-inserted'][text() = 'Перевести']")));

        Assert.assertEquals("79101231233", getText(driver.findElement(By.xpath("//div[@class = 'confirm-operation__attribute-label'][text() = 'По номеру телефона:']/following-sibling::div[@class = 'confirm-operation__attribute-value']"))));
        Assert.assertEquals("Сидоров Петр Иванович", getText(driver.findElement(By.xpath("//div[@class = 'confirm-operation__attribute-label'][text() = 'ФИО получателя:']/following-sibling::div[@class = 'confirm-operation__attribute-value']"))));
        Assert.assertEquals("100,00 \u20BD", getText(driver.findElement(By.xpath("//div[@class = 'confirm-operation__attribute-label'][text() = 'Сумма перевода:']/following-sibling::div[@class = 'confirm-operation__attribute-value']"))));



    }

    public void selectInput(WebElement element, String value) {
        element.click();
        click(element.findElement(By.xpath("//*[text()='" + value + "']")));
    }

}
