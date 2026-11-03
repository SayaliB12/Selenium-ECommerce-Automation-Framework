
package com.DemoWebShop.generic_utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernsImplemention extends BaseClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("-- Test Method Execution Started --");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("-- Test Method Executed Successfully --");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("-- Test Method Execution Failed --");

        ScreenshotUtility ssu = new ScreenshotUtility();

        try {
            ssu.capturewebpage(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporter.log("-- Test Method Execution Skipped --");
    }

    @Override
    public void onStart(ITestContext context) {
        Reporter.log("-- Test Execution Initiated --");
    }

    @Override
    public void onFinish(ITestContext context) {
        Reporter.log("-- Test Execution Finished --");
    }
}


