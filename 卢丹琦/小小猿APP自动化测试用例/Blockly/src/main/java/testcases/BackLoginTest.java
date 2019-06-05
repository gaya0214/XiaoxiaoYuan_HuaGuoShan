package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BasePrepare;
import pages.BackLoginPage;
import pages.LoginPage;
import pages.MenuPage;

public class BackLoginTest extends BasePrepare{

    @DataProvider
    public Object[][] login(){
        return new Object[][]{{"18032430901","111111"},{"18032430902","111111"},{"18032430903","111111"}};
    }


    @Test(dataProvider="login")
    public void BackLoginSuccessful(String tel,String password) throws InterruptedException {

        //登录后点击注册，再点击返回登录后登录的成功测试情况
        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        BackLoginPage backLoginPage =new BackLoginPage(driver);
        backLoginPage.backlogin(tel,password);

    }
}
