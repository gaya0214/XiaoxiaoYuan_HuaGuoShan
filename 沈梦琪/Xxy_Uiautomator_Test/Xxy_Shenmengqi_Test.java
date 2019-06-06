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
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.login("15226520862","123456");
    }

    @Test
    public void reg_success()throws UiObjectNotFoundException{
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.regsiter("15226510861","123456","123456");
    }

    @Test
    public void menu_click_homepage() throws UiObjectNotFoundException{
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.menu("主页");
    }

    @Test
    public void muteTest()throws UiObjectNotFoundException{
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.mute();
    }

    @Test
    public void tvTest()throws UiObjectNotFoundException {
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.Tv(0);
    }

    @Test
    public void goPageTest()throws UiObjectNotFoundException{
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.question(0);
    }

    @Test
    public void goPageTest_Begin() throws UiObjectNotFoundException{
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.question_begin(0);
    }

    @Test
    public void goPageTest_Cancle()throws UiObjectNotFoundException{
//        Sen_Xxy_Action senXxyAction = new Sen_Xxy_Action();
        senXxyAction.question_cancle(0);
    }
}
