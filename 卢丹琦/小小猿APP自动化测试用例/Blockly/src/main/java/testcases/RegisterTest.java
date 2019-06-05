package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BasePrepare;
import pages.MenuPage;
import pages.RegisterPage;


public class RegisterTest extends BasePrepare {

    @DataProvider
    public Object[][] register(){
        return new Object[][]{{"18032430911","111111"},{"18032430912","111111"},{"18032430913","111111"}};
    }

    @Test(dataProvider = "register")
    public void registerSuccessful(String tel,String password) throws InterruptedException {

        //成功注册的测试
        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register(tel,password);
    }

}
