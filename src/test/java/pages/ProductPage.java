package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
    public class ProductPage extends BasePage{

    private final By FRAME = By.xpath("//*[@id='fast-search-modal']/div/div/iframe");////*[class='modal-iframe']"
    private final By CATALOG_LINK = By.xpath("//a[@class='b-main-navigation__link']");
    private final By CONSTRUCTION_SET_1 = By.xpath("//input[@name='query']");
    private final By PROFILE_BASKET_BUTTON = By.xpath("//div//a[@class='button-style button-style_base-alter button-style_primary product-aside__button product-aside__button_narrow product-aside__button_cart button-style_primary']");
    private final By QUANTITY_INDEX = By.xpath("//div//input[@class='input-style input-style_primary input-style_small input-style_text_center cart-form__input cart-form__input_max-width_xxxxsssss cart-form__input_nonadaptive']");
    private final By QUANTITY_INCREASE_BUTTON = By.xpath("//a[@class='button-style button-style_auxiliary button-style_small cart-form__button cart-form__button_increment helpers_hide_tablet']");
    private  final By BASKET_BUTTON = By.xpath("//a[@class='button-style button-style_base-alter button-style_primary product-aside__button product-aside__button_narrow product-aside__button_cart button-style_expletive']");
    private  final By SEARCH_STRING_INPUT = By.xpath("//div[@id='fast-search']");
    private  final By PRODUCT_NAME_INPUT = By.xpath("//input[@name='query']");
    private final By CLOSE_BUTTON = By.xpath("//*[@id='fast-search-modal']/div/div/iframe");
    private final By PRICE = By.xpath("//div//div[@class='cart-form__offers-part cart-form__offers-part_price cart-form__offers-part_price_specific helpers_hide_tablet']");
    private final By WASHING_MACHINE_LINK = By.xpath("//*[@id='container']/div/div/div/div/div[2]/div[1]/div/ul/li[10]/a");//li[@class='project-navigation__item project-navigation__item_secondary']//*[contains(text(),'Стиральные машины')]");
    private final By WASHING_MACHINE_INPUT_NAME = By.xpath("//div//a[@href='https://catalog.onliner.by/washingmachine/jacky/jwd8542b0bs']");  //*[contains(text(),'           Стирально-сушильная машина Jacky's JW D8542B0BS         ')]");
    private final By TV_LINK = By.xpath("//*[@id='container']/div/div/div/div/div[1]/div/div[1]/ul[2]/li[2]");
    private final By TV_INPUT_NAME = By.xpath("//div[@class='catalog-form__description catalog-form__description_primary catalog-form__description_base-additional catalog-form__description_font-weight_semibold catalog-form__description_condensed-other']//a[@href='https://catalog.onliner.by/tv/xiaomi/tvq250']");
    private final By BACK_BASKET_BUTTON = By.xpath("//div//a[@class='button-style button-style_another button-style_base-alter product-recommended__button']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getCurrentUrl() {

        return null;
    }
    @Step("Click Close Button")
    public void clickCloseButton() {
        log.info("Click Close Button");
        //driver.switchTo().frame(FRAME.findElement(driver));
        driver.findElement(CLOSE_BUTTON).click();
        driver.switchTo().defaultContent();
    }

    @Step("Click Close Iframe")
    public void clickCloseIframe() {
        log.info("Click Close Iframe");
        driver.switchTo().frame(FRAME.findElement(driver));
        driver.switchTo().defaultContent();
    }

    @Step("Click Catalog Link")
    public void clickCatalogLink() {
        log.info("Click Catalog Link");
        driver.findElement(CATALOG_LINK).click();
    }
    @Step("Click Back Basket Button")
    public void clickBackBasketButton() {
        log.info("Click Back Basket Button");
        driver.findElement(BACK_BASKET_BUTTON).click();
    }


    @Step("Click TV Link")
    public void clickTVLink() {
        log.info("Click TV Link");
        driver.findElement(TV_LINK).click();
    }
    @Step("Click TV Input Name")
    public void clickTVInputName() {
        log.info("Click TV Input Name");
        driver.findElement(TV_INPUT_NAME).click();
    }
    @Step("Click Washing Machine Input Name")
    public void clickWashingMachineInputName() {
        log.info("Click Washing Machine Input Name");
        driver.findElement(WASHING_MACHINE_INPUT_NAME).click();
    }
    @Step("Displayed Price")
    public boolean isDisplayedPrice() {
        log.info("Displayed Price");
        driver.findElement(PRICE).isDisplayed();
        return false;
    }

    @Step("Setting Construction Set 1")
    public void setConstructionSet1() {
        log.info("Setting Construction Set 1");
        driver.findElement(CONSTRUCTION_SET_1).sendKeys("Конструктор LEGO Technic 42115 Lamborghini Sian FKP 37");
    }
    @Step("Click Profile Basket Button")
    public void clickProfileBasketButton() {
        log.info("Click Profile Basket Button");
        driver.findElement(PROFILE_BASKET_BUTTON).click();
    }
    @Step("Displayed Quantity Index")
    public boolean isDisplayedQuantityIndex() {
        log.info("Displayed Quantity Index");
        driver.findElement(QUANTITY_INDEX).isDisplayed();
        return false;
    }
    @Step("Click Quantity Increase Button")
    public void clickQuantityIncreaseButton() {
        log.info("Click Quantity Increase Button");
        driver.findElement(QUANTITY_INCREASE_BUTTON).click();
    }

    @Step("Click Basket Button")
    public void clickBasketButton() {
        log.info("Click Basket Button");
        driver.findElement(BASKET_BUTTON).click();
    }
    @Step("Setting Product Name Input")
    public void setProductNameInput() {
        log.info("Setting Product Name Input");
        driver.findElement(PRODUCT_NAME_INPUT).sendKeys("Lego");
    }
    @Step("Click Washing Machine Link")
    public void clickWashingMachineLink() {
        log.info("Click Washing Machine Link");
        driver.findElement(WASHING_MACHINE_LINK).click();
    }
    @Step("Click Search String")
    public void clickSearchString() {
        log.info("Click Search String");
        driver.findElement(SEARCH_STRING_INPUT).click();
    }
}

