package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import utils.PropertyReader;

    @Log4j2
    public class RegistrationPage extends BasePage {

    private final static By EMAIL_TAB = By.xpath("//div//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']");
    private final static By PASSWORD = By.xpath("//div//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']");
    private final static By DUPLICATE_PASSWORD = By.xpath("//div//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']");
    private final static By CHECK_BOX = By.xpath("//span[@class='auth-checkbox__faux']");
    private final static By REGISTRATION_BUTTON = By.xpath("//div//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']");
    private final static By VALIDATION_MASSAGE = By.xpath("//div[@id='growls']");
    public final static By INCORRECT_PASSWORD_TEXT = By.xpath("//div[@class='auth-form__description auth-form__description_primary auth-form__description_tiny auth-form__description_condensed-other']");
    public final static By BUTTON_REDIRECT_ON_EMAIL = By.xpath("//div//a[@class='auth-button auth-button_appendant auth-button_middle auth-form__button auth-form__button_width_full']");
    public final static By LETTER_LINK = By.xpath("//div//span[@class='zF']");
    public final static By CONFIRM_BUTTON = By.xpath("//*[@id=nu]/div[1]//div/span/a");
    public final static By PROFILE_FORM =By.xpath("//div[@class='profile-header__name']");

    public RegistrationPage(WebDriver driver) {
            super(driver);
        }

    @Override
    public boolean waitForPageLoaded() {
        return false;
    }

    @Step("Setting Email Tab Input")
    public void setEmail(String email) {
        log.info("Setting Email Tab Input");
        driver.findElement(EMAIL_TAB).sendKeys(email);
    }

    @Step("Setting password input")
    public void setPassword(String password) {
        log.info("Setting password input");
        driver.findElement(PASSWORD).sendKeys(password);
    }
    @Step("Setting duplicate password input")
    public void setDuplicatePassword(String password) {
        log.info("Setting duplicate password input");
        driver.findElement(DUPLICATE_PASSWORD).sendKeys(password);
    }
    @Step("Click check box")
    public void jsClickCheckBox() {
        log.info("Click check box");
        jsClick(driver.findElement(CHECK_BOX));
    }
    @Step("Click registration button")
    public void clickRegistrationButton() {
        log.info("Click registration button");
        driver.findElement(REGISTRATION_BUTTON).click();
    }
    @Step("Check validation message displayed")
    public boolean isValidationMessageDisplayed() {
        log.info("Check is validation message displayed");
        driver.findElement(VALIDATION_MASSAGE).isDisplayed();
        return false;
    }
    @Step("Check incorrect password text")
    public String getIncorrectPasswordText() {
        log.info("Get incorrect password text");
        driver.findElement(By.id(String.valueOf(INCORRECT_PASSWORD_TEXT))).getText();
        return null;
    }
    @Step("Click button redirect on mail")
    public void clickButtonRedirectOnEmail() {
        log.info("Click button redirect on mail");
        driver.findElement(BUTTON_REDIRECT_ON_EMAIL).click();
    }
    @Step("Click letter link")
    public void clickLetterLink() {
        log.info("Click letter link");
        driver.findElement(LETTER_LINK).click();
    }
    @Step("Click confirm button")
    public void clickConfirmButton() {
        log.info("Click confirm button");
        driver.findElement(CONFIRM_BUTTON).click();
    }
    @Step("Check profile form displayed")
    public boolean isProfileFormDisplayed() {
        log.info("Check profile form displayed");
        driver.findElement(PROFILE_FORM).isDisplayed();
        return false;
    }
    public String getCurrentUrl() {
        return super.getCurrentUrl();
    }

}
