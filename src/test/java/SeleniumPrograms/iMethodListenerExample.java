package SeleniumPrograms;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class iMethodListenerExample implements IInvokedMethodListener {
    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After Invocation method and testResult content:::"+method.getTestMethod().getMethodName() +" Test Results:::"+testResult.getTestClass());
        System.out.println("After Invocation method and testResult content and Date:::"+method.getDate());
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Before Invocation method and testResult content:::"+method.getTestMethod().getMethodName() +" Test Results:::"+testResult.getTestClass()+"Con");
        System.out.println("Before Invocation method and testResult content and Date:::"+method.getDate());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        System.out.println("After Invocation method and testResult content:::"+method.getTestMethod().getMethodName() +" Test Results:::"+testResult.getTestClass()+"Context::"+context.getHost());
        System.out.println("After Invocation method and testResult content and Date:::"+method.getDate());
    }


    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        System.out.println("Before Invocation method and testResult content:::"+method.getTestMethod().getMethodName() +" Test Results:::"+testResult.getTestClass()+"ConText::"+context.getAllTestMethods().length);
        System.out.println("Before Invocation method and testResult content and Date:::"+method.getDate());
    }
}
