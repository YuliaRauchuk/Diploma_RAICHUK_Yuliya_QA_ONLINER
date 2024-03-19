package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
    public class RegistrationPage extends BasePage {

    private final static By EMAIL_TAB = By.xpath("//div//input[@placeholder='Ваш e-mail']");
    private final static By PASSWORD = By.xpath("//div//input[@placeholder='Придумайте пароль']");
    private final static By DUPLICATE_PASSWORD = By.xpath("//div//input[@placeholder='Повторите пароль']");
    private final static By CHECK_BOX = By.xpath("//span[@class='auth-checkbox__faux']");
    private final static By REGISTRATION_BUTTON = By.xpath("//div//button[@type='submit']");
    private final static By VALIDATION_MASSAGE = By.xpath("//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other']");
    public final static By REGISTRATION_LINK =By.xpath("//*[@id='auth-container']//div//div[2]//div//form//div[4]//div[1]//a");

    public RegistrationPage(WebDriver driver) {
            super(driver);
        }
    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    protected void waitForElementDisplayed(By locator) {
        super.waitForElementDisplayed(locator);
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
    public void clickCheckBox() {
        log.info("Click check box");
        driver.findElement(CHECK_BOX).click();
    }
    @Step("Displayed Validation Message")
    public boolean isDisplayedValidationMessage() {
        log.info("Displayed Validation Message");
        driver.findElement(VALIDATION_MASSAGE).isDisplayed();
        return true;
    }
    @Step("Click Registration button")
    public void clickRegistrationButton() {
        log.info("Click registration button");
        driver.findElement(REGISTRATION_BUTTON).click();
    }
    @Step("Click Registration Link()")
    public void clickRegistrationLink() {
        log.info("Click Registration Link()");
        driver.findElement(REGISTRATION_LINK).click();
    }

}
