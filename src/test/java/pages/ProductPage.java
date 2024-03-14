package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
    public class ProductPage extends BasePage{

    private final By CATALOG_LINK = By.xpath("//a[@class='b-main-navigation__link']");
    private final By PRODUCT_LEGO = By.xpath("//li[@class='catalog-navigation-classifier__item catalog-navigation-classifier__item_brand'][1]");
    private final By CONSTRUCTION_SET_1 = By.xpath("//input[@name='query']");
    private final By CONSTRUCTION_SET_2 = By.xpath("//input[@name='query']");
    private final By CONSTRUCTION_SET_3 = By.xpath("//input[@name='query']");
    private final By CONSTRUCTION_SET_4 = By.xpath("//input[@name='query']");
    private final By CONSTRUCTOR_BUTTON = By.xpath("//a[@class='search-button-old search-button-old_orange product__button']");
    private  final By BUTTON_ADD_TO_CART = By.xpath("//a[@class='button-style button-style_base-alter button-style_primary product-aside__button product-aside__button_narrow product-aside__button_cart button-style_expletive']");
    private  final By BASKET_BUTTON = By.xpath("//a[@class='button-style button-style_another button-style_base-alter product-recommended__button']");
    private  final By SEARCH_PRODUCT_NAME = By.xpath("//div[@id='fast-search']");
    private  final By SEARCH_STRING_INPUT = By.xpath("//div[@id='fast-search']");
    private  final By PRODUCT_NAME_INPUT = By.xpath("//input[@name='query']");
    private final By CHECK_BOX_COMPARISON = By.cssSelector(".i-checkbox__faux");
    private final By CLOSE_BUTTON = By.xpath("//span[@class='search__close']");
    private final By IMG = By.xpath("//div[@class='result__item result__item_product']");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getCurrentUrl() {

        return null;
    }
    @Step("Check Catalog Link")
    public void clickCatalogLink() {
        log.info("Check Catalog Link");
        driver.findElement(CATALOG_LINK).click();
    }
    @Step("Check Catalog Link")
    public void clickCloseButton() {
        log.info("Check Catalog Link");
        driver.findElement(CLOSE_BUTTON).click();
    }
    @Step("Displayed Img")
    public boolean isDisplayedConstructionSet1() {
        log.info("Displayed Img");
        driver.findElement(IMG).click();
        return true;
    }
    @Step("Check Check Box Comparison")
    public void clickCheckBoxComparison() {
        log.info("Check CheckBox Comparison");
        driver.findElement(CHECK_BOX_COMPARISON).click();
    }

    @Step("Check Product Lego")
    public void clickProductLego() {
        log.info("Check Product Lego");
        driver.findElement(PRODUCT_LEGO).click();
    }
    @Step("Setting Construction Set 1")
    public void setConstructionSet1() {
        log.info("Setting Construction Set 1");
        driver.findElement(CONSTRUCTION_SET_1).sendKeys("Конструктор LEGO Technic 42115 Lamborghini Sian FKP 37");
    }
    @Step("Setting Construction Set 2")
    public void setConstructionSet2() {
        log.info("Setting Construction Set 2");
        driver.findElement(CONSTRUCTION_SET_2).sendKeys("Набор деталей LEGO Duplo 10913 Коробка с кубиками");
    }
    @Step("Setting Construction Set 3")
    public void setConstructionSet3() {
        log.info("Setting Construction Set 3");
        driver.findElement(CONSTRUCTION_SET_3).sendKeys("Конструктор LEGO Technic 42083 Bugatti Chiron");
    }
    @Step("Setting Construction Set 4")
    public void setConstructionSet4() {
        log.info("Setting Construction Set 4");
        driver.findElement(CONSTRUCTION_SET_4).sendKeys("Конструктор LEGO 10282 Кроссовки adidas Originals Superstar");
    }

    @Step("Click Constructor Link")
    public void clickConstructorButton() {
        log.info("Click Constructor Link");
        driver.findElement(CONSTRUCTOR_BUTTON).click();
    }
    @Step("Click Button Add To Cart")
    public void clickButtonAddToCart() {
        log.info("Click Button Add To Cart");
        driver.findElement(BUTTON_ADD_TO_CART).click();
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
    @Step("Click Search Product Name")
    public void clickSearchProductName() {
        log.info("Click Search Product Name");
        driver.findElement(SEARCH_PRODUCT_NAME).click();
    }
    @Step("Click Search String")
    public void clickSearchString() {
        log.info("Click Search String");
        driver.findElement(SEARCH_STRING_INPUT).click();
    }
}

