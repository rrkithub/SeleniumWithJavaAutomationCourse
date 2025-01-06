package TestNGBasics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListernEx implements ITestListener {

    public  void onTestFailure(ITestResult org1){
        System.out.println("fail test....."+org1);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    public  void onTestSuccess(ITestResult org1){
        System.out.println("success test....."+org1);
    }
    public  void onTestSkipped(ITestResult org1){
        System.out.println("skip test....."+org1);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

}
