package testCases;

import org.testng.annotations.Test;
import bases.BaseTest;

public class RegisterTest extends BaseTest{
    @Test
    public void test01(){
        //点击空白区域开始
        webtest.click("id=ll_go");
        //点击菜单
        webtest.click("class=android.widget.TextView");
        //点击我
        webtest.click("id=iv_me");
    }

    //注册
    @Test
    public void register(){
        //1.点击注册
        webtest.click("id=btn_register");
        //2.手机号注册
        webtest.click("id=et_userEmailOrPhone");
        webtest.type("id=et_userEmailOrPhone","15226511111");
        //3.密码
        webtest.click("id=et_userPassword");
        webtest.type("id=et_userPassword","111111");
        //4.确认密码
        webtest.click("id=et_reWriteUserPassword");
        webtest.type("id=et_reWriteUserPassword","111111");
        //5.点击注册
        webtest.click("id=btn_register");
    }
}
