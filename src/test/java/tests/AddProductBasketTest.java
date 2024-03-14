package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Retry;

import java.util.Arrays;


    public class AddProductBasketTest extends BaseTest {
        @Description("Positive Search Product Test")
        // @Test(groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
        public void searchTest() {
            String itemName = "Lego";
            //constructorLEGOPage.();
            // constructorLEGOPage.();
            //constructorLEGOPage.();
            Assert.assertEquals(constructorLEGOPage.getSortingListItemName(), Arrays.asList("Конструктор LEGO Technic 42115 Lamborghini Sian FKP 37", "Набор деталей LEGO Duplo 10913 Коробка с кубиками", "Конструктор LEGO Technic 42083 Bugatti Chiron", "Конструктор LEGO 10282 Кроссовки adidas Originals Superstar"));
        }

        @Description("Positive Add Product Basket Test")
        @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
        public void positiveAddProductBasketTests() throws IndexOutOfBoundsException {
            onlinerPage.isDisplayedOnlinerLogo();
            productPage.clickCatalogLink();
            productPage.clickSearchString();
            productPage.setConstructionSet1();
            productPage.clickCloseButton();//не получается нажать на крестик, чтобы очистить стороку поиска
            //не получается выбрать чек бокс, чтобы сравнить ексколько видов товара
            //не получается добавить выбранный товар в карзину, как следствие, проверить работу карзины и как отработывает биллинг
        }

            @Description("Positive Test Number Products In Basket")
            @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
            public void positiveTestNumberProductsInBasket () throws IndexOutOfBoundsException {
            }
            @Description("Negative Test Promo Code In Basket")
            @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
            public void negativeTestPromoCodeInBasket () throws IndexOutOfBoundsException {
            }

            @Override
            public void waitForPageLoaded () {

            }
        }