package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class OnlinerPage extends BasePage{

    private final static By ONLINER_LOGO = By.xpath("//div//a//img[@class='onliner_logo']");
    private final static By ONLINER_BAR_MENU  = By.xpath("//div//a[@class='b-top-profile__preview js-toggle-bar']");

    public OnlinerPage(WebDriver driver) {
        super(driver);
    }


    @Step("Click Onliner Bar Menu")
    public void clickOnlinerBarMenu() {
        log.info("Click Onliner Bar Menu");
        driver.findElement(ONLINER_BAR_MENU).click();
    }
    @Step("Displayed Onliner Logo")
    public boolean isDisplayedOnlinerLogo() {
        log.info("Displayed Onliner Logo");
        driver.findElement(ONLINER_LOGO).isDisplayed();
        return true;
    }
}
