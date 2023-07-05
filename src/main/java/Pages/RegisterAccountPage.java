package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage extends BasePage {

    private static final String REGISTER_ACCOUNT_URL = "https://shop.pragmatic.bg/index.php?route=account/register";

    @FindBy (id = "input-firstname")
    private static WebElement FirstNameInput;

    @FindBy (id = "input-lastname")
    private static WebElement LastNameInput;

    @FindBy (id = "input-email")
    private static WebElement EmailInput;

    @FindBy (id = "input-telephone")
    private static WebElement TelephoneInput;

    @FindBy (id = "input-password")
    private static WebElement PasswordInput;

    @FindBy (id = "input-confirm")
    private static WebElement PasswordConfirmInput;

    @FindBy (css = "input[type=\"checkbox\"][name=\"agree\"][value=\"1\"]\n")
    private static WebElement CheckBox;

    @FindBy (css = "input[type=\"submit\"][value=\"Continue\"].btn-primary\n")
    private static WebElement ContinueButton;

    static {
        PageFactory.initElements(driver, RegisterAccountPage.class);
    }



    public static void enterFirstName(String firstName) {
        enterText(FirstNameInput, firstName);
    }
    public static void enterLastName(String lastName) {
        enterText(LastNameInput, lastName);
    }
    public static void enterEmail(String email) {
        enterText(EmailInput, email);
    }

    }

