package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
    public class RegistrationTest extends BaseTest {

    @Attachment
    @Description("Positive registration test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveRegistrationTests() {

        //homePage.waitForPageLoaded();
        loginPage.clickRegistrationLink();
        //registrationPage.waitForPageLoaded();
        registrationPage.setEmail(EMAIL);
        registrationPage.setPassword(PASSWORD);
        registrationPage.setDuplicatePassword(PASSWORD);
        registrationPage.clickCheckBox();
        registrationPage.clickRegistrationButton();
        registrationPage.clickButtonRedirectOnEmail();
        registrationPage.clickLetterLink();
        registrationPage.clickConfirmButton();
 //   Assert.assertTrue(accountPage.waitForPageLoaded());
    }
}