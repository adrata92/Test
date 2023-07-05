package tests;

import Pages.HomePage;
import Pages.RegisterAccountPage;
import Utils.WaitTool;
import core.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterAccountTest extends BaseTest {

    @Test
    public void CreateAccount() {
        HomePage.goToHomePag();
        HomePage.clickOnMyAccount();
        HomePage.clickOnRegister();
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        WaitTool.waitForElementVisibility(By.id("input-firstname"),3);
        registerAccountPage.enterFirstName("test");
        registerAccountPage.enterLastName("testov");
        registerAccountPage.
// до тук забих,
    }
}
