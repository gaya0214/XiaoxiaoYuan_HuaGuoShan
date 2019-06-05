package testCase;

import org.testng.annotations.Test;
import Base.BaseTest;
import Page.WebDriverEngine;
import Page.ElementFinder;
import utils.NSDataProvider;

public class RegisterTest extends BaseTest{

    //注册
    @Test(dataProvider="txt",dataProviderClass= NSDataProvider.class)
    public void loginNopsd(String et_userEmailOrPhone,String et_userPassword){
        web.click("id=btn_register");
        web.click("id=et_userEmailOrPhone");
        web.type("id=et_userEmailOrPhone",et_userEmailOrPhone);
        web.click("id=et_userPassword");
        web.type("id=et_userPassword",et_userPassword);
        web.click("id=et_reWriteUserPassword");
        web.type("id=et_reWriteUserPassword",et_userPassword);
        web.click("id=btn_register");
    }

}
