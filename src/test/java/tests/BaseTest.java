package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import utils.TestListener;
import utils.PropertyReader;
import java.util.concurrent.TimeUnit;



    @Listeners(TestListener.class)

    public abstract class BaseTest {
    protected final static String URL = System.getenv().getOrDefault("URL", PropertyReader.getProperty("url"));
    protected final static String EMAIL = System.getenv().getOrDefault("EMAIL", PropertyReader.getProperty("email"));
    protected final static String PASSWORD = System.getenv().getOrDefault("PASSWORD", PropertyReader.getProperty("password"));

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected RegistrationPage registrationPage;
    protected HomePage homePage;
    protected AccountPage accountPage;
    protected AuthenticationPage authenticationPage;
    protected ProductPage productPage;
    protected BasketPage basketPage;


        @BeforeClass(alwaysRun = true)
        public void setUp(ITestContext testContext) throws Exception {
            String browserName = System.getProperty("browser", "Chrome");
            String headless = System.getProperty("headless", "false");
            if(browserName.equals("Chrome")) {
                ChromeOptions options = new ChromeOptions();
                if(headless.equals("true")) {
                    options.addArguments("--headless");}
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
            } else if(browserName.equals("FireFox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {
                throw new Exception("Incorrect browser name");
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            testContext.setAttribute("driver", driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        accountPage = new AccountPage(driver);
        productPage = new ProductPage(driver);
        basketPage = new BasketPage(driver);
        authenticationPage = new AuthenticationPage(driver);

    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
    driver.get(URL);
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {
    driver.quit();
        }
    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");
        ((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");
    }

    }