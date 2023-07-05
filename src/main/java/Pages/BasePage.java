package Pages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

     protected static WebDriver driver;

    static {
    driver = Browser.getDriver();
        }
        public static void clickOnElement(WebElement element) { element.click(); }
        public static void clickOnElementByLocator(By locator) {driver.findElement(locator).click();}
        public static void enterText(WebElement element, String text) {
        element.sendKeys(text);
        }
        public static void enterTextByLocator(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
        }
    }
