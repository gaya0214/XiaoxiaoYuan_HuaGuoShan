package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.RegisterPage;
import utils.DataProviders;

public class RegisterPageTest extends BaseTest {

    private String usename = "15226520861";
    private String usepwd = "123456";

    @Test(description = "注册成功")
    public void registerSuccessful()throws Exception{
        RegisterPage register = new RegisterPage(getDriver());
        register.register(usename,usepwd,usepwd);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }

    @Test(description = "注册失败_两次密码不同",dataProvider = "regster_message_error",dataProviderClass = DataProviders.class)
    public void registerFailError(String regname,String regpwd1,String regpwd2) throws Exception{
        RegisterPage register = new RegisterPage(getDriver());
        register.register(regname,regpwd1,regpwd2);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.RegisterActivity",getDriver().currentActivity());
    }

    @Test(description = "注册失败_信息为空",dataProvider = "regster_message_null",dataProviderClass = DataProviders.class)
    public void registerFailNull(String regname,String regpwd1,String regpwd2)throws Exception{
        RegisterPage register = new RegisterPage(getDriver());
        register.register(regname,regpwd1,regpwd2);
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("com.google.blockly.android.demo.LoginActivity",getDriver().currentActivity());
    }
}
