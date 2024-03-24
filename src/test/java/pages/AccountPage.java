package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
    public class AccountPage extends BasePage{

    private final static By NEXT_BUTTON = By.xpath("//div//button[@type='submit']");
    private final static By USER_VALIDATION_MESSAGE = By.xpath("//div[@class='auth-form__line auth-form__line_condensed']");
    private final static By PASSWORD_RECOVERY = By.xpath("//*[@id='auth-container']//a[@href='https://profile.onliner.by/recover-password']");
    private final static By EMAIL = By.xpath("//input[@placeholder='Ник или e-mail']");
    private final static By PASSWORD = By.xpath("//div//input[@type='password']");
    private final static By ERROR_VALIDATION_MESSAGE = By.xpath("//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other']");
    private final static By PRIMARY_DATA_INPUT = By.xpath("//div//input[@placeholder='Ник, e-mail или номер телефона']");
    private final static By PASSWORD_RECOVERY_LINK = By.xpath("//*[contains(text(),'Я не помню пароль')]");
    private final static By PRIMARY_VALIDATION_MESSAGE = By.xpath("//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other']");

    public AccountPage(WebDriver driver) {
            super(driver);
        }

    @Override
    protected void waitForElementDisplayed(By locator) {
        super.waitForElementDisplayed(locator);
        }

    @Step("Setting Email Input")
    public void setEmailInput() {
        log.info("Setting Email Tab Input");
        driver.findElement(EMAIL).sendKeys("!@#$%^&*()_{++++++_)(*&^%$#@");
    }
    @Step("Setting Password Input")
    public void setPasswordInput() {
         log.info("Setting Password Input");
         driver.findElement(PASSWORD).sendKeys(")(*&^%$#@!@#$%^&*()(*&^%$#@");
    }
    @Step("Setting Email Empty Input")
    public void setEmailEmptyInput() {
         log.info("Setting Email Tab Input");
         driver.findElement(EMAIL).sendKeys("");
        }
    @Step("Setting Password Empty Input")
    public void setPasswordEmptyInput() {
        log.info("Setting Password Empty Input");
        driver.findElement(PASSWORD).sendKeys("");
        }
   @Step("Displayed Error Validation Message")
    public boolean isDisplayedErrorValidationMessage() {
        log.info("Displayed Error Validation Message");
        driver.findElement(ERROR_VALIDATION_MESSAGE).isDisplayed();
        return true;
   }
   @Step("Displayed Validation Message")
   public boolean isDisplayedPrimaryValidationMessage() {
        log.info("Displayed Validation Message");
        driver.findElement(PRIMARY_VALIDATION_MESSAGE).isDisplayed();
        return true;
    }
   @Step("Click Password Recovery")
    public void clickPasswordRecovery() {
        log.info("Click Password Recovery");
        driver.findElement(PASSWORD_RECOVERY).click();
    }
    @Step("Click Password Recovery Link")
    public void clickPasswordRecoveryLink() {
         log.info("Click Password Recovery Link");
        driver.findElement(PASSWORD_RECOVERY_LINK).click();
    }
    @Step("Setting Primary Data Input")
    public void setPrimaryDataInput() {
         log.info("Setting Primary Data Input");
         driver.findElement(PRIMARY_DATA_INPUT).sendKeys("+375AAAAAAAAAAAA");
    }
    @Step("Click Next Button")
    public void clickNextButton() {
          log.info("Click Next Button");
          driver.findElement(NEXT_BUTTON).click();
    }
    @Step("Displayed User Validation Message")
    public boolean isDisplayedUserValidationMessage() {
          log.info("Displayed User Validation Message");
          driver.findElement(USER_VALIDATION_MESSAGE).isDisplayed();
          return true;
        }
    }