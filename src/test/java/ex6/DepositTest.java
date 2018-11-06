package ex6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class DepositTest extends Test {

    @org.junit.Test
    public void testDeposit() {
        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия", "Иванов");
        testData.put("Имя", "Иван");
        testData.put("Отчество", "Иванович");
        testData.put("Дата рождения", "12.12.1992");
        testData.put("Телефон", "9109879898");
        testData.put("Город", "Москва");
        testData.put("Отделение", "732, дополнительный офис «Отделение" + "«Бескудниково");

        WebDriver webDriver = getDriver();
        webDriver.get("https://www.raiffeisen.ru");
        acceptRegion();
        click(webDriver.findElement(By.xpath("//li/a[contains(text(),\"Вклады\")]")));
        click(webDriver.findElement(By.xpath("//div[@class = 'menu-body']//a[contains(text(),\"Накопительные счета\")]")));
        click(webDriver.findElement(By.xpath("//li/a[contains(text(),\"Вклады\")]")));

    }

    private void acceptRegion() {
        click(getDriver().findElement(By.xpath("//*[text()='Да']")));
    }

}
