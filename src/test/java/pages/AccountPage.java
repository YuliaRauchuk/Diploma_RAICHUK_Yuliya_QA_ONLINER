package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

    @Log4j2
    public class AccountPage extends BaseTest {
    private final By PROFILE_SETTING = By.xpath("//div//a[@class='b-top-profile__settings']");
    private final By PROFILE_FORM = By.xpath("//div[@class='profile-form__anchor-list']");

    @Step("Click Profile Setting")
    public void clickProfileSetting() {
        log.info("Click Profile Setting");
        driver.findElement(PROFILE_SETTING).click();
    }
    @Step("Displayed Profile Form")
    public void isProfileFormDisplayed() {
        log.info("Displayed Profile Form");
        driver.findElement(PROFILE_FORM).isDisplayed();
    }
        public AccountPage(WebDriver driver) {
            super();
        }
}