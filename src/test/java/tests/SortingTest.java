package tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
    public class SortingTest extends BaseTest {

    @Attachment
    @Description("Negative Sorting Test")
    @Test(groups = {"negative","Smoke"}, retryAnalyzer = Retry.class)
    public void negativeSortingTests() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickCatalogLink();
        sortingPage.clickElectronicsButton();
        sortingPage.clickEbookAndTableLink();
        sortingPage.clickEbookButton();
        sortingPage.setPriceFirstInput();
        sortingPage.setPriceNextInput();
        Assert.assertTrue(sortingPage.isDisplayedInfoMessageCatalogInteraction(), "         Упс! У нас нет таких товаров, попробуйте изменить условия поиска       ");
    }
    @Attachment
    @Description("Positive Sorting Test")
    @Test(groups = {"positive","Smoke"}, retryAnalyzer = Retry.class)
    public void positiveSortingTests() throws IndexOutOfBoundsException {
        onlinerPage.isDisplayedOnlinerLogo();
        productPage.clickCatalogLink();
        sortingPage.clickElectronicsButton();
        sortingPage.clickEbookAndTableLink();
        sortingPage.clickEbookButton();
        sortingPage.clickDropDown();
        sortingPage.checkNewIndicator();
        sortingPage.checkAdvertisementButton();
        sortingPage.clickCurrentInput();
        sortingPage.clickDropDown();
    Assert.assertTrue(sortingPage.isDisplayedInputDropDown());
    }
}