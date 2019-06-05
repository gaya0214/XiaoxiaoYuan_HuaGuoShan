package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BasePrepare;
import pages.GoPage;
import pages.LoginPage;
import pages.MenuPage;

public class GoTest extends BasePrepare{

    @DataProvider
    public Object[][] login(){
        return new Object[][]{{"18032430901","111111"},{"18032430902","111111"},{"18032430903","111111"}};
    }

    @Test(dataProvider="login")
    public void goSuccessful(String tel,String password) throws InterruptedException {

        //登录后成功进入go版块的测试
        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        LoginPage loginPage =new LoginPage(driver);
        loginPage.login(tel,password);
        GoPage goPage = new GoPage(driver);
        goPage.go();

    }
}
