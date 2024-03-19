package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
    public class SortingTest extends BaseTest {
    @Override
    public void waitForPageLoaded() {
    }
    @Attachment
    @Description("Negative Sorting Test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void negativeSortingTests() throws IndexOutOfBoundsException {
        productPage.clickCatalogLink();
        sortingPage.clickElectronicsButton();
        sortingPage.clickEbookAndTableLink();
        sortingPage.clickEbookButton();
        sortingPage.setPriceFirstInput();
        sortingPage.setPriceNextInput();
        sortingPage.waitForPageLoaded();
        Assert.assertTrue(sortingPage.isDisplayedInfoMessageCatalogInteraction(), "         Упс! У нас нет таких товаров, попробуйте изменить условия поиска       ");
    }

    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveSortingTests() throws IndexOutOfBoundsException {
        productPage.clickCatalogLink();
        sortingPage.clickElectronicsButton();
        sortingPage.clickEbookAndTableLink();
        sortingPage.clickEbookButton();
        sortingPage.clickDropDown();
        sortingPage.checkNewIndicator();
        sortingPage.waitForPageLoaded();
        sortingPage.checkAdvertisementButton();
        sortingPage.clickCurrentInput();
        sortingPage.clickDropDown();
    Assert.assertTrue(sortingPage.isDisplayedInputDropDown());
    }
}