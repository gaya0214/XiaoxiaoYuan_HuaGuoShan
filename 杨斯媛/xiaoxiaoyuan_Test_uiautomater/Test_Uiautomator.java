  package com.edu.test.testxxy;

import android.support.test.uiautomator.UiObjectNotFoundException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Sen_XxyTest extends Sen_Xxy_BaseTest{

    Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
    @Test
    public  void login_success() throws UiObjectNotFoundException  {
        senXxyAction.login("1731234567","123456");
    }

    @Test
    public void reg_success()throws UiObjectNotFoundException{
        senXxyAction.regsiter("1731234567","123456","123456");
    }

    @Test
    public void menu_click_homepage() throws UiObjectNotFoundException{
        senXxyAction.menu("主页");
    }

    @Test
    public void muteTest()throws UiObjectNotFoundException{
        senXxyAction.mute();
    }

    @Test
    public void tvTest()throws UiObjectNotFoundException {
        senXxyAction.Tv(0);
    }

    @Test
    public void goPageTest()throws UiObjectNotFoundException{
        senXxyAction.question(0);
    }

    @Test
    public void goPageTest_Begin() throws UiObjectNotFoundException{
        senXxyAction.question_begin(0);
    }

    @Test
    public void goPageTest_Cancle()throws UiObjectNotFoundException{
        senXxyAction.question_cancle(0);
    }
}
