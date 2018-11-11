package ex6.homework;

/*
Дз к 08.11 автоматизировать следующие сценарии: Сценарий №1
1. Перейти по ссылке - https://www.raiffeisen.ru/
2. Выбрать пункт меню – Сервисы
3. Выбрать – Перевод по карте/телефону
4. Проверить, что на открывшейся странице есть текст - Перевод с карты на карту / по номеру телефона
5. Заполнить поля:
Карта отправителя - 5406 5715 1819 4617
Карта получателя - 5367433138590699
Срок действия
CVC – 512
Сумма – 5
6 Проверить, что появилось сообщение - Минимальная сумма перевода – 10 р
* */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestScenario1 extends BaseTest {

    @Test
    public void testMetod() {

        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");

        click(driver.findElement(By.xpath("//li/a[text()='Сервисы']")));
        click(driver.findElement(By.xpath("//div[contains(text(),'Самообслуживание')]/following-sibling::div//a[text()='Переводы по карте/телефону']")));

        Assert.assertEquals("Перевод с карты на карту / по номеру телефона", driver.findElement(By.xpath("//div[@class='b-block-text container b-block-text--small-margin']/h1[@class='e-title e-title--h2']")).getText());

        fillField(driver.findElement(By.xpath("//input[@placeholder='Номер карты отправителя']")),"5406 5715 1819 4617");
        fillField(driver.findElement(By.xpath("//input[@placeholder='Номер карты получателя']")),"5367433138590699");
        fillField(driver.findElement(By.xpath("//input[@placeholder='ММ']")),"12");
        fillField(driver.findElement(By.xpath("//input[@placeholder='ГГ']")),"18");
        fillField(driver.findElement(By.xpath("//input[@placeholder='CVC2']")), "123");
        fillField(driver.findElement(By.xpath("//input[@placeholder='Сумма перевода, \u20BD']")),"5");

        Assert.assertEquals("Минимальная сумма перевода – 10 р.", driver.findElement(By.xpath("//div[text()='Заполните все поля, чтобы узнать размер комиссии']/parent::div/following-sibling::div[@class='c2c__error']")).getText());

    }
}
