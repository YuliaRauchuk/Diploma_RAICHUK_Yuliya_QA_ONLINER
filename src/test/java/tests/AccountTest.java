package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
    public class AccountTest extends BaseTest {
    @Attachment
    @Description("Negative Account test")
    @Test(groups = {"negative","smoke"}, retryAnalyzer = Retry.class)
    public void negativeAccountTests() {
        loginPage.clickButtonEntrance();
        accountPage.setEmailInput();
        accountPage.setPasswordInput();
        loginPage.clickButtonEnter();
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "         Неверный логин или пароль     ");

    }
    @Attachment
    @Description("Negative Test Empty Data")
    @Test(groups = {"negative","smoke"}, retryAnalyzer = Retry.class)
    public void negativeTestsEmptyData() {
        loginPage.clickButtonEntrance();
        accountPage.setEmailEmptyInput();
        accountPage.setPasswordEmptyInput();
        loginPage.clickButtonEnter();
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "                     Укажите ник или e-mail                 ");
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "                    Укажите пароль");
        }
    @Attachment
    @Description("Negative Test Password Recovery" )
    @Test(groups = {"negative","smoke"}, retryAnalyzer = Retry.class)
    public void negativeTestPasswordRecovery() {
        loginPage.clickButtonEntrance();
        accountPage.clickPasswordRecoveryLink();
        accountPage.setPrimaryDataInput();
        accountPage.clickNextButton();
   Assert.assertTrue(accountPage. isDisplayedPrimaryValidationMessage(), "         Такой пользователь не зарегистрирован     ");
        }
    }