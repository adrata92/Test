package Pages;

import Utils.Browser;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By MY_ACCOUNT_BUTTON = By.cssSelector("li.dropdown > a[title=\"My Account\"]\n");
    private static By REGISTER_BUTTON = By.cssSelector("a[href=\"https://shop.pragmatic.bg/index.php?route=account/register\"]");
    private static final String HOME_PAGE_URL = "https://shop.pragmatic.bg/";
    private static final String REGISTER_ACCOUNT_URL = "https://shop.pragmatic.bg/index.php?route=account/register";


    public static void goToHomePag(){
        Browser.getDriver().get(HOME_PAGE_URL);
        driver.get(HOME_PAGE_URL);
    }
    public static void clickOnMyAccount(){
        clickOnElementByLocator(MY_ACCOUNT_BUTTON);
    }
    public static void clickOnRegister(){
        clickOnElementByLocator(REGISTER_BUTTON);
    }
    public static void goToRegisterAccount() {driver.get(REGISTER_ACCOUNT_URL);}



}
