package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Log4j2
public class GoogleAccountPage extends BasePage {

    public final static By GMAIL_ONLINER = By.xpath("//div[2]//img[@id='undefined']");
    public final static By LETTER_BUTTON = By.xpath("//div//span[@email='noreply@onliner.by']");
    public final static By CONFIRM_BUTTON = By.xpath("//span[@class='ams bkG']");
    public final static By NEXT_BUTTON = By.xpath("//span[@class='VfPpkd-vQzf8d']");
    public final static By GMAIL_ACCOUNT = By.xpath("//div//input[@type='email']");
    public final static By POST_TAB = By.xpath("//div[@class='gb_Nc']");
    public final static By LETTER_CHECKBOX = By.xpath("https://accounts.google.com/AccountChooser/signinchooser?service=mail&amp;continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&amp;flowName=GlifWebSignIn&amp;flowEntry=AccountChooser&amp;ec=asw-gmail-globalnav-signin");
    public final static By GMAIL_INBOX_BUTTON = By.cssSelector("//div//span//a[@href='https://mail.google.com/mail/u/0/#inbox']");
    public GoogleAccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("Setting Gmail Search Tab")
    public void clickGmailOnliner() {
        log.info("Setting Gmail Search Tab");
        driver.findElement(GMAIL_ONLINER).click();
    }
    @Step("Click Next Button")
    public void clickNextButton() {
        log.info("Click Next Button");
        driver.findElement(NEXT_BUTTON).click();
    }
    @Step("Setting Gmail Account")
    public void setGmailAccount() {
        log.info("Setting Gmail Account");
        driver.findElement(GMAIL_ACCOUNT).sendKeys("rauchukyulia86@gmail.com");
    }
    @Step("Click letter Button")
    public void clickLetterCheckBox() {
        log.info("Click letter Button");
        driver.findElement(LETTER_CHECKBOX).click();
    }
    @Step("Click confirm button")
    public void clickConfirmButton() {
        log.info("Click confirm button");
        CONFIRM_BUTTON.findElement(driver).click();
    }
    @Step("Click Gmail Inbox Button")
    public void clickGmailInboxButton() {
        log.info("Click Gmail Inbox Button");
        driver.findElement(GMAIL_INBOX_BUTTON).click();
    }
    @Step("Displayed Post Tab")
    public boolean isDisplayedPostTab() {
        log.info("Displayed Post Tab");
        POST_TAB.findElement(driver).isDisplayed();
        return false;
    }
}