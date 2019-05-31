package com.example.huaguoshan.testdemo;

import com.example.huaguoshan.base.BaseTest;

/*10.修改个人信息*/
public class Modify_information extends BaseTest {
    public void modify_information()throws Exception{
        Login.login();
            driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]\n" ).click();
            driver.findElementById( "et_username" ).sendKeys( "gaya" );
            driver.findElementById( "et_userSex" ).sendKeys( "女" );
            driver.findElementById( "et_userPhone" ).sendKeys( "13180686518" );
            driver.findElementById( "et_userBirthday" ).sendKeys( "1998-02-14" );
    }
}
