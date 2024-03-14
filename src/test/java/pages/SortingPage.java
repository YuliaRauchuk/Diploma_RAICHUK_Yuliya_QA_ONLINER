package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class SortingPage extends BasePage{
    private final By ONLINER_BAR_MENU = By.xpath("//div//a[@class='b-top-profile__preview js-toggle-bar']");
    protected final By ELECTRONICS_BUTTON = By.xpath("//*[@id='container']/div/div/div/div/div[1]/ul/li[3]");//вкладка электроника
    protected final By eBOOK_AND_TABLE_LINK = By.xpath("//*[contains(text(),' Планшеты, электронные книги ')]");//вкладка эл.книги и планшеты
    protected final By eBOOK_BUTTON = By.xpath("//*[@id='container']/div/div/div/div/div[1]/div[4]/div/div[2]/div[1]/div/div[3]/div[2]/div/a[2]/span/span[2]");//кнопка элюкниги
    protected final By PRICE_FIRST_INPUT = By.xpath("//div//input[@placeholder='от']");//первая соимость 999999999 (подставить разные значения в sendkeys)
    protected final By PRICE_NEXT_INPUT = By.xpath("//div//input[@placeholder='до']");//вторая стоимость 999999999
    protected final By DROP_DOWN = By.xpath("//*[@id='container']/div/div/div/div/div[2]/div[1]/div/div/div[3]/div/div[3]/div[1]/div/div[2]/div/div/select");
    protected final By NEW_INDICATOR = By.xpath("//select//option[@value='date:desc']");//новый
    protected final By CHEAP_INDICATOR = By.xpath("//select//option[@value='date:desc']");//дешевле
    protected final By MESSAGE_CATALOG_INTERACTION  = By.xpath("//div//div[@class='catalog-interaction__state catalog-interaction__state_initial catalog-interaction__state_disabled catalog-interaction__state_control'");//реальное количество по запросу(вывести ассертом)
    protected final By INFO_MESSAGE_CATALOG_INTERACTION = By.xpath("//div//div[@class='catalog-form__filter-part catalog-form__filter-part_2']");
    protected final By ADVERTISEMENT_BUTTON = By.xpath("//*[@id='container']/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div/label[2]/span");
    protected final By CURRENT_INPUT = By.xpath("//div//select//option[@value='last_up_at:desc']");
    protected final By INPUT_DROP_DOWN = By.xpath("//select//option[@value='price:desc']");

    public SortingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getCurrentUrl() {
        return null;
    }
    @Override
    public boolean waitForPageLoaded() {
        return false;
    }
        @Step("Click Onliner Bar Menu")
    public void clickOnlinerBarMenu() {
        log.info("Click Onliner Bar Menu");
        driver.findElement(ONLINER_BAR_MENU).click();
    }
    @Step("Click Electronics Button")
    public void clickElectronicsButton() {
        log.info("Click Electronics Button");
        driver.findElement(ELECTRONICS_BUTTON).click();
    }
    @Step("Click eBook and Table Link")
    public void clickEbookAndTableLink() {
        log.info("Click eBook and Table Link");
        driver.findElement(eBOOK_AND_TABLE_LINK).click();
    }
    @Step("Click Drop Down")
    public void clickDropDown() {
        log.info("Click Click Drop Down");
        driver.findElement(DROP_DOWN).click();
    }
    @Step("Click New Indicator")
    public void checkNewIndicator() {
        log.info("Click New Indicator()");
        driver.findElement(NEW_INDICATOR).click();
    }
    @Step("Click Cheap Indicator")
    public void checkCheapIndicator() {
        log.info("Click Cheap Indicator()");
        driver.findElement(CHEAP_INDICATOR).click();
    }
    @Step("Click Advertisement Button")
    public void checkAdvertisementButton() {
        log.info("Click Advertisement Button");
        driver.findElement(ADVERTISEMENT_BUTTON).click();
    }
    @Step("Click Current Input")
    public void clickCurrentInput() {
        log.info("Click Current Input");
        driver.findElement(CURRENT_INPUT).click();}

    @Step("Click eBook Button")
    public void clickEbookButton() {
        log.info("Click eBook Button");
        driver.findElement(eBOOK_BUTTON).click();
    }

    @Step("Setting Price First Input")
    public void setPriceFirstInput() {
        log.info("Setting Price First Input");
        driver.findElement(PRICE_FIRST_INPUT).sendKeys("");
    }
    @Step("Setting Price Next Input")
    public void setPriceNextInput() {
        log.info("Setting Price Next Input");
        driver.findElement(PRICE_NEXT_INPUT).sendKeys("10");
    }
    @Step("Displayed Info Message Catalog Interaction")
    public boolean isDisplayedInfoMessageCatalogInteraction() {
        log.info("Info Message Catalog Interaction");
        driver.findElement(INFO_MESSAGE_CATALOG_INTERACTION).isDisplayed();
    return true;
    }
    @Step("Displayed Input Drop Down")
    public boolean isDisplayedInputDropDown() {
        log.info("Displayed Input Drop Down");
        driver.findElement(INPUT_DROP_DOWN).isDisplayed();
        return true;
    }
    @Step("Setting Price First Valid Input")
    public void setPriceFirstValidInput() {
        log.info("Setting Price First Valid Input");
        driver.findElement(PRICE_FIRST_INPUT).sendKeys("999");
    }
    @Step("Setting Price Next Valid Input")
    public void setPriceNextValidInput() {
        log.info("Setting Price Next Valid Input");
        driver.findElement(PRICE_NEXT_INPUT).sendKeys("2000");
    }
    @Step("Displayed Quantity Info Message Catalog Interaction")
    public boolean isDisplayedMessageCatalogInteraction() {
        log.info("Displayed Quantity Info Message Catalog Interaction");
        driver.findElement(MESSAGE_CATALOG_INTERACTION).isDisplayed();
    return true;}
}
