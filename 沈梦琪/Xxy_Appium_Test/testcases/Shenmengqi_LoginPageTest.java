package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.DataProviders;


public class LoginPageTest extends BaseTest {

    @Test(description = "登录成功")
    public void loginSuccessful(String username,String pwd){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("15226520862","123456");
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "登录失败_用户名/密码错误",dataProvider = "login_message_error",dataProviderClass = DataProviders.class)
    public void loginFailUsename(String username,String pwd){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login(username,pwd);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }

    @Test(description = "登录失败_用户名/密码为空",dataProvider = "login_message_null",dataProviderClass = DataProviders.class)
    public void loginFailUsepwd(String username,String pwd){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login(username,pwd);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }
}