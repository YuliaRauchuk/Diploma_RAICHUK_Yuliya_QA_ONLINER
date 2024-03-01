package tests;

import io.qameta.allure.Attachment;
import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
public class ValidationPromoCodeMessage extends BaseTest {

    

    @Attachment
    @Description("Positive validation message test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveValidationMessageTests() {
        homePage.waitForPageLoaded();
        registrationPage.waitForPageLoaded();
        registrationPage.setEmail(EMAIL);
        registrationPage.setPassword(PASSWORD);
    }
    public ValidationPromoCodeMessage(WebDriver driver) {
        super(driver);
    }
}
//добавляем товар в карзину и пытаемся применить промокод
//sendkey :"SELE"
//второе сообщение об удаленном товапе и пустой карзине