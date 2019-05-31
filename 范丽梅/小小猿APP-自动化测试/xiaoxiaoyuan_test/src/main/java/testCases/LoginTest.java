package testCases;

import org.testng.annotations.Test;
import bases.BaseTest;
import utils.NSDataProvider;

public class LoginTest extends BaseTest{

    //登录
    @Test(dataProvider="txt",dataProviderClass= NSDataProvider.class)
    public void login(String et_userEmailOrPhone,String et_userPassword){
        //1.用户名
        webtest.click("id=et_userEmailOrPhone");
        webtest.type("id=et_userEmailOrPhone",et_userEmailOrPhone);
        //2.密码
        webtest.click("id=et_userPassword");
        webtest.type("id=et_userPassword",et_userPassword);
        //3.点击登录
        webtest.click("id=btn_login");
    }
}
