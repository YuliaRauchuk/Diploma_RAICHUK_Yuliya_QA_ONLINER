package tests;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;


    public class AccountTest extends BaseTest {

    @Description("Negative Account test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void negativeAccountTests() {
        loginPage.clickButtonEntrance();
        accountPage.setEmailInput();
        accountPage.setPasswordInput();
        loginPage.clickButtonEnter();
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "         Неверный логин или пароль     ");

    }
    @Description("Negative Test Empty Data")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void negativeTestsEmptyData() {
        loginPage.clickButtonEntrance();
        accountPage.setEmailEmptyInput();
        accountPage.setPasswordEmptyInput();
        loginPage.clickButtonEnter();
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "                     Укажите ник или e-mail                 ");
    Assert.assertTrue(accountPage.isDisplayedErrorValidationMessage(), "                    Укажите пароль");
        }

   @Description("Negative Test Password Recovery" )
   @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
   public void negativeTestPasswordRecovery() {
        loginPage.clickButtonEntrance();
        accountPage.clickPasswordRecoveryLink();
        accountPage.setPrimaryDataInput();
        accountPage.clickNextButton();
   Assert.assertTrue(accountPage. isDisplayedPrimaryValidationMessage(), "         Такой пользователь не зарегистрирован     ");
        }
        @Override
        public void waitForPageLoaded() {

        }
    }

