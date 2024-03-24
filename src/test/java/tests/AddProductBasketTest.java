package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
public class AddProductBasketTest extends BaseTest {

    @Attachment
    @Step
    @Description("Positive Search Test Product. Close Iframe")
    @Test(groups = {"positive","smoke"}, retryAnalyzer = Retry.class)
    public void positiveSearchTestProduct() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickCatalogLink();
        productPage.clickSearchString();
        productPage.setConstructionSet1();
        productPage.clickCloseIframe();
        productPage.clickCloseButton();
    Assert.assertEquals(true, onlinerPage.isDisplayedOnlinerLogo());
    }

    @Attachment
    @Step
    @Description("Positive Test Number Products In Basket")
    @Test(groups = {"positive","smoke"}, retryAnalyzer = Retry.class)
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
    Assert.assertEquals(false, productPage.isDisplayedPrice());
    }
    @Attachment
    @Step
    @Description("Negative Test Promo Code In Basket")
    @Test(groups = {"negative","smoke"}, retryAnalyzer = Retry.class)
    public void negativeTestPromoCodeInBasket() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickTVLink();
        productPage.clickTVInputName();
        productPage.clickBasketButton();
        productPage.clickBackBasketButton();
        basketPage.isDisplayedBasketTab();
        basketPage.setSaleBasketTab();
        basketPage.checkApplyButton();
    Assert.assertEquals(false, basketPage.isDisplayedValidationMessage());
    }

    @Attachment
    @Step
    @Description("Positive Delete Products From Basket")
    @Test(groups = {"positive","smoke"}, retryAnalyzer = Retry.class)
    public void positiveTestDeleteProductsFromBasket() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickTVLink();
        productPage.clickTVInputName();
        productPage.clickBasketButton();
        Assert.assertEquals(true, false);
    }
}