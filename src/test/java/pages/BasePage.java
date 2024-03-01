package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2
public abstract class BasePage {

   protected WebDriverWait wait;

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver, this);
    }

    public abstract boolean waitForPageLoaded();

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    protected void waitForElementDisplayed(By elementLocator) {
        log.debug(String.format("Wait is displayed element:  %s ", elementLocator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }
    protected void jsScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
