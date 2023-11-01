package SeleniumPrograms;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class iSuiteListenerTest1 {
    @BeforeSuite
    public void test1()
    {
        System.out.println("BeforeSuite method in Suite1");
    }

    @Test
    public void test2()
    {
        System.out.println("Main Test method 1");
    }

    @AfterSuite
    public void test3()
    {
        System.out.println("AfterSuite method in Suite1");
    }
}
