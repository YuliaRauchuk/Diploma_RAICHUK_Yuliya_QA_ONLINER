package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;
import utils.PropertyReader;

@Log4j2
public class HomePage extends BasePage {

    protected final static String CHROME = System.getenv().getOrDefault("CHROME", PropertyReader.getProperty("chrome"));
    private final static String URL = System.getenv().getOrDefault("URL", PropertyReader.getProperty("url"));
    private final By BUTTON_ENTER = By.xpath("//div[@class='auth-bar__item auth-bar__item--text']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Setting url input")
    public String getCurrentUrl() {
        log.info("Setting url input");
        driver.findElement(By.id(URL)).click();
        return null;
    }
    @Step("Check Button Enter")
    public void clickButtonEnter() {
        log.info("CheckButtonEnter");
        driver.findElement(BUTTON_ENTER).click();
    }
    @Step("Setting Chrome")
    public void setChrome() {
        log.info("Setting Chrome");
        driver.findElement(By.id(CHROME)).click();
    }
}
