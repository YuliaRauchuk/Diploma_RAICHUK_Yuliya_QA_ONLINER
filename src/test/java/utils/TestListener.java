package utils;

import lombok.extern.log4j.Log4j2;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Date;

@Log4j2
    public class TestListener implements ITestListener {
        @Override
        public void onTestStart(ITestResult result) {
            ITestListener.super.onTestStart(result);
            log.info(String.format("Test %s started at %s", result.getName(), new Date()));
        }
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        log.info(String.format("Test %s succeeded", result.getName()));
    }
    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("Test " + result.getName() + " failed");
    }
}
