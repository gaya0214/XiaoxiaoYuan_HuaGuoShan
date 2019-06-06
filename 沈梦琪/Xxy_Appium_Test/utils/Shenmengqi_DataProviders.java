package utils;

import org.testng.annotations.DataProvider;

import base.BaseTest;

public class DataProviders extends BaseTest {
    @DataProvider(name = "login_message_error")
    public static Object[][] login_error()
    {
        return new Object[][] {{"15226520863","123456"},{"15226520862","1111111"}};
    }
    @DataProvider(name = "login_message_null")
    public static Object[][] login_null()
    {
        return new Object[][] {{"","123456"},{"15226520862",""}};
    }

    @DataProvider(name = "regster_message_error")
    public static Object[][] reg_message_error()
    {
        return new Object[][]{{"15226520860","123456","234567"}};
    }
    @DataProvider(name = "regster_message_null")
    public static Object[][] reg_message_null()
    {
        return new Object[][]{{"","123456","234567"},{"15226520860","","234567"},{"15226520860","123456",""}};
    }
}