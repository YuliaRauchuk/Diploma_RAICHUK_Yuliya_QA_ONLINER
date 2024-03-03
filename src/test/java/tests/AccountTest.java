package tests;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;


    public class AccountTest extends BaseTest {

    @Description("Positive Account test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveAccountTests() {
        homePage.getCurrentUrl();
      //  accountPage.waitForPageLoaded();
        homePage.clickButtonEnter();
        registrationPage.clickCheckBox();
        productPage.clickCatalogLink();
        accountPage.clickProfileSetting();
        accountPage.isProfileFormDisplayed();
  //  Assert.assertTrue(accountPage.waitForPageLoaded());
    }
}

