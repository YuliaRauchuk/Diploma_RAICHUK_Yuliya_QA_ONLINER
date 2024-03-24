package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import utils.InvokedListener;
import utils.PropertyReader;
import utils.TestListener;

import java.time.Duration;
@Log4j2
@Listeners({TestListener.class, InvokedListener.class})

    public abstract class BaseTest {
        public static String URL = System.getenv().getOrDefault("URL", PropertyReader.getProperty("url"));
        protected final static String EMAIL = System.getenv().getOrDefault("EMAIL", PropertyReader.getProperty("email"));
        protected final static String PASSWORD = System.getenv().getOrDefault("PASSWORD", PropertyReader.getProperty("password"));
        protected final static String DUPLICATION_PASSWORD =System.getenv().getOrDefault("DUPLICATION_PASSWORD", PropertyReader.getProperty("duplication.password"));

        protected WebDriver driver;
        protected LoginPage loginPage;
        protected RegistrationPage registrationPage;
        protected HomePage homePage;
        protected AccountPage accountPage;
        protected ProductPage productPage;
        protected GoogleAccountPage googleAccountPage;
        protected OnlinerPage onlinerPage;
        protected SortingPage sortingPage;
        protected BasketPage basketPage;


        @BeforeClass(alwaysRun = true)
        public void setUp(ITestContext testContext) throws Exception {
           String browser = System.getProperty("browser", "chrome");
           if (browser.equals("chrome")) {
               driver = new ChromeDriver();
               ChromeOptions options =new ChromeOptions();
               options.addArguments("headless", "window-size=1920.1080");
           } else if (browser.equals("Firefox")) {
                    driver = new FirefoxDriver();
                } else {
                    throw new Exception("Incorrect browser name");
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                testContext.setAttribute("driver", driver);
                testContext.setAttribute("driver", driver);
                homePage = new HomePage(driver);
                loginPage = new LoginPage(driver);
                registrationPage = new RegistrationPage(driver);
                accountPage = new AccountPage(driver);
                productPage = new ProductPage(driver);
                basketPage = new BasketPage(driver);
                googleAccountPage = new GoogleAccountPage(driver);
                onlinerPage = new OnlinerPage(driver);
                sortingPage = new SortingPage(driver);
        }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        if (driver != null)
            driver.get(URL);
    }
    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");
        ((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
