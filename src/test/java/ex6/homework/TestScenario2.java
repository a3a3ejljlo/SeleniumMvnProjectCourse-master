package ex6.homework;

/*
Сценарий №2
1. Перейти по ссылке - https://www.raiffeisen.ru/
2. Нажать кнопку – Выбор региона
3. Выбрать – Владимир
4. Проверить, что на главной странице регион Москва сменилась на Владимир
5. Поскроллить к концу страницы
6. Проверить, что в конце страницы есть ссылки
– Качество обслуживания, Карьера в банке, Реквизиты, Противодействие коррупции
* */

import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestScenario2 extends BaseTest {

    @Test @Ignore
    public void testTemplate() {


        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");

        click(driver.findElement(By.xpath("//li[@class='sec-menu__region sec-menu__region__gradient']")));
        click(driver.findElement(By.xpath("//a[text()='Владимир']")));
        Assert.assertEquals("ВЛАДИМИР", driver.findElement(By.xpath("//li[@class='sec-menu__region sec-menu__region__gradient']/a")).getText());
        scrollToEndPage(driver.findElement(By.xpath("//p[text()='© 2003 – 2018 АО «Райффайзенбанк»']")));
        isElementPresent(By.xpath("//a[text()='Качество обслуживания']"));
        isElementPresent(By.xpath("//a[text()='Карьера в банке']"));
        isElementPresent(By.xpath("//a[text()='Реквизиты']"));
        isElementPresent(By.xpath("//a[text()='Противодействие коррупции']"));
    }
}
