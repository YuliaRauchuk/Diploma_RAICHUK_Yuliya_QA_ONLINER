package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
public class LoginTest extends BaseTest {

    @Attachment
    @Description("Positive Login test")
    @Test(groups = {"positive","smoke"}, retryAnalyzer = Retry.class)
    public void positiveLoginTests() throws IndexOutOfBoundsException {
        loginPage.clickButtonEntrance();
        loginPage.setEmailInput(EMAIL);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickButtonEnter();
    }

    @Attachment
    @Description("Negative Login test")
    @Test(groups = {"negative","smoke"}, retryAnalyzer = Retry.class)
    public void negativeLoginTests() throws IndexOutOfBoundsException {
        loginPage.clickButtonEntrance();
        accountPage.setEmailInput();
        accountPage.setPasswordInput();
        loginPage.clickButtonEnter();
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "        Неверный логин или пароль        ");
    }

    @Attachment
    @Description("Negative Test Account Is Not Registered")
    @Test(groups = {"negative","smoke"}, retryAnalyzer = Retry.class)
    public void negativeTestAccountIsNotRegistered() throws IndexOutOfBoundsException {
        loginPage.clickButtonEntrance();
        accountPage.clickPasswordRecovery();
        accountPage.setPrimaryDataInput();
        accountPage.clickNextButton();
        accountPage.isDisplayedUserValidationMessage();
    Assert.assertTrue(accountPage.isDisplayedUserValidationMessage(), "        Такой пользователь не зарегистрирован        ");
    }
}


