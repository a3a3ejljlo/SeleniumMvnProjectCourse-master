package ex6;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test {

    WebDriverWait wait;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void startScenario() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);


        wait = new WebDriverWait(driver, 60);

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /*

        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();*/
    }

    @After
    public void test() {
        driver.quit();
    }

    public void click(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement)).click();
    }

    public void scrollAndClick(WebElement webElement) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeAsyncScript("return argeuments");
    }

    public void fillField(WebElement webElement, String value) {
        webElement.clear();
        webElement.sendKeys(value);
        webElement.sendKeys(Keys.TAB);
    }
}
