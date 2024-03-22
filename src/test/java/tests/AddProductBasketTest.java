package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.testng.annotations.Test;
import utils.Retry;


public class AddProductBasketTest extends BaseTest {
    @Attachment
    @Step
    @Description("Positive Search Test Product. Close Iframe")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveSearchTestProduct() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickCatalogLink();
        productPage.clickSearchString();
        productPage.setConstructionSet1();
        productPage.clickCloseIframe();
        productPage.clickCloseButton();
        onlinerPage.isDisplayedOnlinerLogo();
        Assert.assertEquals(true, onlinerPage.isDisplayedOnlinerLogo());
    }

    @Attachment
    @Step
    @Description("Positive Test Number Products In Basket")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveTestNumberProductsInBasket() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickCatalogLink();
        productPage.clickWashingMachineLink();
        productPage.clickWashingMachineInputName();
        productPage.clickBasketButton();
        productPage.clickProfileBasketButton();
        productPage.isDisplayedQuantityIndex();
        productPage.isDisplayedPrice();
        productPage.clickQuantityIncreaseButton();
    Assert.assertTrue(productPage.isDisplayedPrice());
    }
    @Attachment
    @Step
    @Description("Negative Test Promo Code In Basket")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void negativeTestPromoCodeInBasket() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickTVLink();
        productPage.clickTVInputName();
        productPage.clickBasketButton();
        productPage.clickBackBasketButton();
        basketPage.isDisplayedBasketTabDisplayed();
        basketPage.setSaleBasketTab();
        basketPage.checkApplyButton();
    Assert.assertEquals(true, (basketPage.isValidationMessageDisplayed()));
    }


    @Attachment
    @Step
    @Description("Positive Delete Products From Basket")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveTestDeleteProductsFromBasket() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickTVLink();
        productPage.clickTVInputName();
        productPage.clickBasketButton();
        basketPage.waitForPageLoaded();
        Assert.assertEquals(true, false);
    }

        @Override
        public void waitForPageLoaded() {
        }
    }