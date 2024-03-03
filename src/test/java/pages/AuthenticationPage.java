package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

    @Log4j2
    public class AuthenticationPage extends BasePage {

        public AuthenticationPage(WebDriver driver) {
            super(driver);
        }
    }