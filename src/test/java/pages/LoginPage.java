package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class LoginPage extends BasePage {
    private final static By EMAIL_INPUT = By.xpath("//div//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']");
    private final static By PASSWORD_INPUT = By.xpath("//div//input[@type='password']");
    private final By BUTTON_ENTRANCE = By.xpath("//div[@class='auth-bar__item auth-bar__item--text']");
    private final By BUTTON_ENTER = By.xpath("//div[@class='auth-form__control auth-form__control_condensed-additional']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmailInput(String email) {
        log.info("Setting Email Tab Input");
        driver.findElement(EMAIL_INPUT).sendKeys("rauchukyulia86@gmail.com");
    }

    @Step("Setting Password Input")
    public void setPasswordInput(String password) {
        log.info("Setting Password Input");
        driver.findElement(PASSWORD_INPUT).sendKeys("sPKbqog9XqLtOHz8Rj12&*%");
    }
    @Step("Click Button Enter")
    public void clickButtonEnter() {
        log.info("CheckButtonEnter");
        driver.findElement(BUTTON_ENTER).click();
    }
    @Step("Check button Entrance")
    public void clickButtonEntrance() {
        log.info("Check button Entrance");
        driver.findElement(BUTTON_ENTRANCE).click();
    }
}

