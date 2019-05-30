package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.RegisterPage;

public class RegisterPageTest extends BaseTest {

    private String usename = "15226520861";
    private String usepwd = "123456";

    @Test(description = "register_succseful")
    public void registerSuccessful(){
        RegisterPage register = new RegisterPage(getDriver());
        register.register(usename,usepwd,usepwd);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }

    @Test(description = "register_fail_null_usename")
    public void registerFailNullUsename(){
        RegisterPage register = new RegisterPage(getDriver());
        register.register("",usepwd,usepwd);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }

    @Test(description = "register_fail_null_usepwd")
    public void registerFailNullUsepwd(){
        RegisterPage register = new RegisterPage(getDriver());
        register.register(usename,"","");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }

    @Test(description = "register_fail_error_usepwd")
    public void registerFailErrorUsepwd(){
        RegisterPage register = new RegisterPage(getDriver());
        register.register(usename,usepwd,"234567");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }
}
