package core;

import Utils.Browser;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public void setupBrowser() { Browser.setup(); }
}
