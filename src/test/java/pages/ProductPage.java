package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
    public class ProductPage extends BasePage{


    @Override
    public boolean waitForPageLoaded() {
        return false;
    }


    private final By CATALOG_LINK = By.xpath("//a[@class='b-main-navigation__link']");
    private final By PRODUCT_LEGO = By.xpath("//span[@class='catalog-navigation-classifier__item-title catalog-navigation-classifier__item-title_brand helpers_show_tablet']");
    private final By CONSTRUCTOR_LINK = By.xpath("//span[@class='catalog-navigation-list__dropdown-title']");
    private  final By BUTTON_ADD_TO_CART = By.xpath("//a[@class='button-style button-style_base-alter button-style_primary product-aside__button product-aside__button_narrow product-aside__button_cart button-style_expletive']");
    private  final By BASKET_BUTTON = By.xpath("//a[@class='button-style button-style_another button-style_base-alter product-recommended__button']");

    @Step("Check Catalog Link")
    public void clickCatalogLink() {
        log.info("Check Catalog Link");
        driver.findElement(CATALOG_LINK).click();
    }
    @Step("Check Product Lego")
    public void clickProductLego() {
        log.info("Check Product Lego");
        driver.findElement(PRODUCT_LEGO).click();
    }
    @Step("Check Constructor Link")
    public void clickConstructorLink() {
        log.info("Check Constructor Link");
        driver.findElement(CONSTRUCTOR_LINK).click();
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
    public ProductPage(WebDriver driver){
        super(driver);
    }
}
