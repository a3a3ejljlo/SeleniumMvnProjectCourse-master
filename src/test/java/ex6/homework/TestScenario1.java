package ex6.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver.navigate().to("https://www.raiffeisen.ru/");
        driver.findElement(By.xpath("//a[@class='main-menu__link link--active']")).click();


        driver.quit();
    }
}

