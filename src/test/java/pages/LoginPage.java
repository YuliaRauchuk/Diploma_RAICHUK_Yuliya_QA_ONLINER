package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class LoginPage extends BasePage {
    private final static By EMAIL_INPUT = By.xpath("//div//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']");
    private final static By PASSWORD_INPUT = By.xpath("//div//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']");
    private final By LOGO_ELEMENT_NAME = By.xpath("//img[@class='onliner_logo']");
    private final By BUTTON_ENTRANCE = By.xpath("//div[@class='auth-bar__item auth-bar__item--text']");
    private final By REGISTRATION_LINK = By.xpath("//div//a[@class='auth-form__link auth-form__link_primary auth-form__link_small']");


    @Override
    public boolean waitForPageLoaded() {
        return false;
    }

    public String getCurrentUrl() {
        return super.getCurrentUrl();
    }

    @Step("Setting Email Tab Input")
    public void setEmailInput(String email) {
        log.info("Setting Email Tab Input");
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }
    @Step("Setting Password Input")
    public void setPasswordInput(String password) {
        log.info("Setting Password Input");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }
    @Step("Displayed Logo Name")
    public void displayedLogoName() {
        log.info("Displayed Logo Name");
        driver.findElement(LOGO_ELEMENT_NAME).click();
    }

    @Step("Check button Entrance")
    public void clickButtonEntrance() {
        log.info("Check button Entrance");
        driver.findElement(BUTTON_ENTRANCE).click();
    }

    @Step("Check Registration Link")
    public void clickRegistrationLink() {
        log.info("Check Registration Link");
        driver.findElement(REGISTRATION_LINK).click();
    }
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}

