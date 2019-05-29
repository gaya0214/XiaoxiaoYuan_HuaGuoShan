package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;


public class LoginPageTest extends BaseTest {

    @Test(description = "login_sucessful")
    public void loginSuccessful(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("15226520862","123456");
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "login_fail_usrname")
    public void loginFailUsename(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("12345678901","123456");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "login_null_usrname")
    public void loginNullUsename(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("","123456");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "login_null_usrpwd")
    public void loginFailUsepwd(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("15226520862","111111");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }

    @Test(description = "login_nul_usrpwd")
    public void loginNullUsepwd(){
        LoginPage loginPage =new LoginPage(getDriver());
        loginPage.login("15226520862","");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.HomePage",getDriver().currentActivity());
    }
}