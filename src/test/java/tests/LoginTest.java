package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.Retry;


public class LoginTest extends BaseTest {

    @Description("Positive Login test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveLoginTests() {
        homePage.setChrome();
        homePage.getCurrentUrl();
        loginPage.waitForPageLoaded();
        loginPage.displayedLogoName();
        loginPage.clickButtonEntrance();
        //accountPage.waitForPageLoaded();
        loginPage.setEmailInput(EMAIL);
        loginPage.setPasswordInput(PASSWORD);
    //Assert.assertTrue(accountPage.waitForPageLoaded());

    }
        @DataProvider
        public static Object[][] PositiveLoginTest() {
            return new Object[][]{
                    {" ", " "},
                    {" ", PASSWORD},
                    {EMAIL, " "},
                    {"ray@google.com", PASSWORD},
                    {EMAIL, "1234567890"},
                    {"ray@google.com", "1234567890"}
            };
        }
    }


