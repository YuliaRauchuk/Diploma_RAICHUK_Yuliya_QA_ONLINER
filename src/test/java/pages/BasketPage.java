package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    @Log4j2
    public class BasketPage extends BasePage {
    private final By BASKET_TAB = By.xpath("//div[@class='cart-form__header']");
    private final By SALE_BASKET_TAB = By.xpath("//div[@class='cart-form__header']");

    private final By APPLY_BUTTON = By.xpath("//div//a[@class='cart-form__link cart-form__link_primary cart-form__link_tiny']");
    private final By DEFAULT_VALIDATION_MESSAGE = By.xpath("//div[@class='default']");

    private final By CART_REMOVE_BUTTON = By.xpath("//div//a[@class='button-style button-style_auxiliary button-style_small cart-form__button cart-form__button_remove']");
    //удаление товара из картзины
    private final By DELETE_VALIDATION_MESSAGE = By.xpath("//div//div[@class='cart-form__description cart-form__description_primary cart-form__description_base-alter cart-form__description_condensed-extra']");
    //подтверждающее сообщение об удалении, карзина пуста
    private final By LINK_RETURN_ITEM = By.xpath("//div//a[@class='cart-form__link cart-form__link_other cart-form__link_small']");
    //вернуть удаленный товар обратно в карзину
    private final By CLOSE_BUTTON = By.xpath("//a[2][@class='cart-form__link cart-form__link_other cart-form__link_small']");
    //закрываеет карзину
    private final By ITEM_EMPTY_BASKET = By.xpath("//div[@class='cart-message__title cart-message__title_big']");
    //пустая карзина
    private final By CATALOG_LINK = By.xpath("//div//a[@href='https://catalog.onliner.by']");

        public BasketPage(WebDriver driver) {
            super(driver);
        }


        @Step("Displayed Basket Tab")
    public boolean isBasketTabDisplayed() {
        log.info("Displayed Basket Tab");
        driver.findElement(BASKET_TAB).isDisplayed();
        return false;
    }

    @Step("Setting Sale Basket Tab")
    public void setSaleBasketTab() {
        log.info("Setting Sale Basket Tab");
        driver.findElement(SALE_BASKET_TAB).sendKeys("SALE");
    }

    @Step("Check Apply Button")
    public void checkApplyButton() {
        log.info("Check Apply Button");
        driver.findElement(APPLY_BUTTON).click();
    }

    @Step("Displayed Validation Message")
    public boolean isValidationMessageDisplayed() {
        log.info("Displayed Validation Message");
        driver.findElement(DEFAULT_VALIDATION_MESSAGE).isDisplayed();
        return false;
    }

    @Step("Check Cart Remove Button")
    public void checkCartRemoveButton() {
        log.info("Check Cart Remove Button");
        driver.findElement(CART_REMOVE_BUTTON).click();
    }

    @Step("Displayed Delete Validation Message")
    public boolean isDeleteValidationMessageDisplayed() {
        log.info("Displayed Delete Validation Message");
        driver.findElement(DELETE_VALIDATION_MESSAGE).isDisplayed();
        return false;
    }

    @Step("Click Link Return Item")
    public void clickLinkReturnItem() {
        log.info("Click Link Return Item");
        driver.findElement(LINK_RETURN_ITEM).click();
    }

    @Step("Click Close Button")
    public void clickCloseButton() {
        log.info("Click Close Button");
        driver.findElement(CLOSE_BUTTON).click();
    }

    @Step("Displayed Item Empty Basket")
    public boolean isItemEmptyBasketDisplayed() {
        log.info("Displayed Item Empty Basket");
        driver.findElement(ITEM_EMPTY_BASKET).isDisplayed();
        return false;
    }

    @Step("Click Catalog Link")
    public void clickCatalogLink() {
        log.info("Click Catalog Link");
        driver.findElement(CATALOG_LINK).click();
    }
}
