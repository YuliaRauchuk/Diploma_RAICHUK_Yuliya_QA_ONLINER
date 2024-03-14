package pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@Log4j2
public abstract class BasePage {
    protected static WebDriverWait wait;

    protected static WebDriver driver;
    protected static Faker faker;


    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        faker = new Faker();
        PageFactory.initElements(driver, this);
        Actions actions = new Actions(driver);

    }
    @Attachment
    protected void waitForElementDisplayed(By locator) {
        log.debug(String.format("Wait is displayed element:  %s ", locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitForElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    protected void jsScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

   public String getCurrentUrl() { //была првка
       return driver.getCurrentUrl();
    }

   @Step("Check Button Enter")
   public void clickButtonEnter() {
    log.info("CheckButtonEnter");
   }

    public boolean waitForPageLoaded() {
    return true;
    }

}

