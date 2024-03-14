package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;


public class LoginTest extends BaseTest {
    @Override
    public void waitForPageLoaded() {
    }

    @Description("Positive Login test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveLoginTests() throws IndexOutOfBoundsException {
        loginPage.clickButtonEntrance();
        loginPage.setEmailInput(EMAIL);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickButtonEnter();
    }

    @Description("Negative Login test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void negativeLoginTests() throws IndexOutOfBoundsException {
        loginPage.clickButtonEntrance();
        accountPage.setEmailInput();
        accountPage.setPasswordInput();
        loginPage.clickButtonEnter();
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(),"        Неверный логин или пароль        ");
        accountPage.clickPasswordRecovery();
        accountPage.setPrimaryDataInput();
        accountPage.clickNextButton();
        accountPage.isDisplayedUserValidationMessage();
    Assert.assertTrue(accountPage.isDisplayedUserValidationMessage(), "        Такой пользователь не зарегистрирован        ");
    }
}


