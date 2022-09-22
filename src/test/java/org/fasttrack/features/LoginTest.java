package org.fasttrack.features;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.fasttrack.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Christina Scarlat");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword("123456a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }
}
