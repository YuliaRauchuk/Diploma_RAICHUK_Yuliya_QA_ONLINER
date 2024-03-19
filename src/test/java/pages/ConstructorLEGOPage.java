package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
    public class ConstructorLEGOPage extends BasePage {

        public ConstructorLEGOPage(WebDriver driver) {
            super(driver);
        }

    private final By PRODUCT_NAME_SELECTOR = By.cssSelector("");


    @Step
    public List<String> getSortingListItemName() {
    List<WebElement> listItemName = driver.findElements(PRODUCT_NAME_SELECTOR);
        return listItemName.stream().map(WebElement::getText).collect(Collectors.toList());
}

}