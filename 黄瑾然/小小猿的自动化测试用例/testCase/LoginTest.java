package testCase;

import org.testng.annotations.Test;
import Base.BaseTest;
import Page.WebDriverEngine;
import Page.ElementFinder;
import utils.NSDataProvider;

public class LoginTest extends BaseTest{

    //登录(信息完整)
    @Test(dataProvider="txt",dataProviderClass= NSDataProvider.class)
    public void login(String et_userEmailOrPhone,String et_userPassword){
        web.click("id=et_userEmailOrPhone");
        web.type("id=et_userEmailOrPhone",et_userEmailOrPhone);
        web.click("id=et_userPassword");
        web.type("id=et_userPassword",et_userPassword);
        web.click("id=btn_login");
    }

    //登录（无密码）
    @Test(dataProvider="txt",dataProviderClass= NSDataProvider.class)
    public void loginNopsd(String et_userEmailOrPhone,String et_userPassword){
        web.click("id=et_userEmailOrPhone");
        web.type("id=et_userEmailOrPhone",et_userEmailOrPhone);
        web.click("id=btn_login");
    }

}
