package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
    public class RegistrationTest extends BaseTest {

    @Attachment
    @Description("Positive Registration test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveRegistrationTests() throws IndexOutOfBoundsException {
        loginPage.clickButtonEntrance();
        registrationPage.clickRegistrationLink();
        registrationPage.setEmail(EMAIL);
        registrationPage.setPassword(PASSWORD);
        registrationPage.setDuplicatePassword(DUPLICATION_PASSWORD);
        registrationPage.clickCheckBox();
        registrationPage.clickRegistrationButton();
    Assert.assertTrue(registrationPage.isDisplayedValidationMessage(),"       Такой пользователь уже зарегистрирован       ");
        }
    @Override
    public void waitForPageLoaded() {
    }
}
