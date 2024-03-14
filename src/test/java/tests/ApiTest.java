package tests;

import io.qameta.allure.Attachment;
import jdk.jfr.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import utils.Retry;

@Log4j2
public class ApiTest extends BaseTest {

    

    @Attachment
    @Description("Positive ... test")
    @Test(groups = {"smoke"}, retryAnalyzer = Retry.class)
    public void positiveApiTests() {

    }

    @Override
    public void waitForPageLoaded() {

    }
}
