package ex7.lesson;

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LessonTest2 extends BaseTest {

    @Test @Ignore
    public void testTemplate() {


        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/#/favourites");

        click(driver.findElement(By.xpath("//*[@class=\"one-click-popup__close icon\"]")));
        click(driver.findElement(By.xpath("//span[text()='Шаблоны и автоплатежи']")));
        selectInput(driver.findElement(By.xpath("//span[text() = 'Выберите операцию']")),"Мобильная связь");
        click(driver.findElement(By.xpath("//button[text()='Создать']")));
        fillField(driver.findElement(By.xpath("//div[@class= 'widget-payment__phone-wrap']//input[@class= 'c-input-phone__input c-input ng-untouched ng-pristine ng-invalid']")),"79999999999");
        selectInput(driver.findElement(By.xpath("//span[contains(text(),'Выберите')]")), "Дебетовка в рублях");


        fillField(driver.findElement(By.xpath("//*[@placeholder='Сумма']")), "29.99");
        Assert.assertEquals("Введенная сумма меньше минимальной разрешенной (30,00 \u20BD)", driver.findElement(By.xpath("//validation-error//span[@class= 'simple-error']")).getText());

        fillField(driver.findElement(By.xpath("//*[@placeholder='Сумма']")),"15000");
        Assert.assertEquals("Введенная сумма превышает максимально допустимую (14 999,99 \u20BD)", driver.findElement(By.xpath("//validation-error//span[@class= 'simple-error']")).getText());

        fillField(driver.findElement(By.xpath("//*[@placeholder='Сумма']")),"150");
        click(driver.findElement(By.xpath("//*[text()='Создать шаблон']/preceding-sibling::label")));
        fillField(driver.findElement(By.xpath("//label[text()='Название шаблона']/parent::div/following-sibling::div//input")),"Шаблон");
        click(driver.findElement(By.xpath("//*[text()='Добавить шаблон в избранное']/preceding-sibling::label")));
        click(driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[2]")));
        Assert.assertTrue("Шаблон успешно сохранен",
                isElementPresent(By.xpath("//*[contains(text(), 'Шаблон успешно сохранен')]")));
    }

    public void selectInput(WebElement element, String value) {
        element.click();
        click(element.findElement(By.xpath("//*[text()='" + value + "']")));
    }
}
