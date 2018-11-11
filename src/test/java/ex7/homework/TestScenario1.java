package ex7.homework;

/*
Дз к 12.11 автоматизировать сценарий:
1. Перейти по ссылке - https://www.raiffeisen.ru/
2. Выбрать пункт меню – Страхование
3. Выбрать – В путешествие
4. Нажать на кнопку – Оставить заявку
5. Проверить, что есть текст - Форма заявки на страховую программу
6. Проверить, что поле продукт заполнено значением - Вояж (Комфорт/Бизнес класс/Первый класс)
7. Заполнить поля: ФИО, Дата рождения, Номер телефона, Эл. почта
8. Отметить чекбокс – Я согласен с условиями
9. Заполнить проверочный код – любое значении
10. Проверить, что кнопка Отправить активна
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

        click(driver.findElement(By.xpath("//a[text()='Страхование']")));
        click(driver.findElement(By.xpath("//*[text()='В путешествие']/parent::div/following-sibling::a")));
        click(driver.findElement(By.xpath("//div[@class='b-intro__block-buttons']/a[text()='Оставить заявку']")));
        Assert.assertEquals("Форма заявки на страховую программу",driver.findElement(By.xpath("//div[@class='b-block-text container']/h1")).getText());
        Assert.assertEquals("Вояж (Комфорт/Бизнес класс/Первый класс)", driver.findElement(By.xpath("//span[@class='ui-selectmenu-text']")).getText());
        fillField(driver.findElement(By.xpath("//input[@placeholder='Фамилия']")),"Иванов");
        fillField(driver.findElement(By.xpath("//input[@placeholder='Имя']")),"Иван");
        fillField(driver.findElement(By.xpath("//input[@placeholder='Отчество']")),"Иванович");
        fillField(driver.findElement(By.xpath("//input[@placeholder='Дата Рождения']")),"01.01.1990");
        fillField(driver.findElement(By.xpath("//input[@sys_name='phone']")),"9999999999");
        fillField(driver.findElement(By.xpath("//input[@placeholder='Электронная почта']")),"test@test.ru");
        click(driver.findElement(By.xpath("//span[@class='checkbox-block__span']")));
        fillField(driver.findElement(By.xpath("//input[@placeholder='Проверочный код']")),"1111");
        isElementPresent(By.xpath("//div[@class='b-block-row__submit']//button[@class='button' and contains(text(),'Отправить')]"));
    }

}
