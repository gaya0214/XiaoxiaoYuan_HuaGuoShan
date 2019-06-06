package com.edu.test.testxxy;

import android.bluetooth.BluetoothClass;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiCollection;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.List;

public class Sen_Xxy_Action {

    public void login(String name,String password)throws UiObjectNotFoundException {
        this.index();
        list.click();
        mine.click();
        //输入用户名、密码，登录
        usrname.setText(name);
        usrpwd.setText(password);
        login_btn.click();
    }

    public void regsiter(String regname,String regpwd1,String regpwd2) throws UiObjectNotFoundException {
        this.index();
        list.click();
        mine.click();
        reg.click();
        reg_name.setText(regname);
        reg_pwd1.setText(regpwd1);
        reg_pwd2.setText(regpwd2);
        reg_btn.click();
    }

    public void menu(String part)throws UiObjectNotFoundException {
        this.index();
        list.click();
        if (part == "主页")
            home_page.click();
        else if (part == "排行榜")
            charts.click();
        else if (part == "社区")
            community.click();
        else if (part == "我")
            mine.click();
        else
            System.out.println("没有此选项，请输入“主页”、“排行榜”、“社区”、“我”任意一项");
    }

    //静音
    public void mute()throws UiObjectNotFoundException{
        this.index();
        sound.click();
    }

    public void Tv(int courseNum)throws UiObjectNotFoundException{
        this.index();
        tv.click();
        UiObject course1 = courses.getChildByInstance(course,courseNum);
        course1.click();
        pause.click();
    }

    public void question(int questionNum)throws UiObjectNotFoundException{
        this.login("15226520862","123456");
        go.click();
        UiObject question1 = questions.getChildByInstance(question,questionNum);
        question1.click();
    }

    public void question_begin(int questionNum)throws UiObjectNotFoundException{
        this.login("15226520862","123456");
        go.click();
        UiObject question1 = questions.getChildByInstance(question,questionNum);
        question1.click();
        question_begin_btn.click();
    }

    public void question_cancle(int questionNum)throws UiObjectNotFoundException{
        this.login("15226520862","123456");
        go.click();
        UiObject question1 = questions.getChildByInstance(question,questionNum);
        question1.click();
        question_cancle_btn.click();
    }

    public void go_next_page()throws UiObjectNotFoundException{
        this.login("15226520862","123456");
        go.click();
        next_question_page_btn.click();
    }



    //Utils

//    public String getDevice(){
//        return device.getCurrentPackageName();
//    }
    public UiObject findObjectById(String objectName){
        return device.findObject(new UiSelector().resourceId(objectName));
    }
    public void index() throws UiObjectNotFoundException{
//        logo.click();//点击进入程序
        ll_go.click();//进入登录页面
    }



    UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    //Pages

    private UiObject ll_go = findObjectById("com.google.blockly.demo:id/ll_go");
    private UiObject list =findObjectById("com.google.blockly.demo:id/iv_spin");
    private UiObject mine =findObjectById("com.google.blockly.demo:id/iv_me");
    private UiObject usrname = findObjectById("com.google.blockly.demo:id/et_userEmailOrPhone");
    private UiObject usrpwd = findObjectById("com.google.blockly.demo:id/et_userPassword");
    private UiObject login_btn = findObjectById("com.google.blockly.demo:id/btn_login");
    //注册
    private UiObject reg = findObjectById("com.google.blockly.demo:id/btn_register");
    private UiObject reg_name = findObjectById("com.google.blockly.demo:id/et_userEmailOrPhone");
    private UiObject reg_pwd1 = findObjectById("com.google.blockly.demo:id/et_userPassword");
    private UiObject reg_pwd2 = findObjectById("com.google.blockly.demo:id/et_reWriteUserPassword");
    private UiObject reg_btn = findObjectById("com.google.blockly.demo:id/btn_register");
    //菜单功能
    private UiObject home_page = findObjectById( "com.google.blockly.demo:id/iv_HomePage");
    private UiObject charts = findObjectById("com.google.blockly.demo:id/iv_charts");
    private UiObject community = findObjectById("com.google.blockly.demo:id/iv_community");
    private UiObject sound = findObjectById("com.google.blockly.demo:id/iv_setting");
    //播放课程
    private UiObject tv = findObjectById("com.google.blockly.demo:id/iv_tv");
    private UiCollection courses = new UiCollection(new UiSelector().resourceId("com.google.blockly.demo:id/lv_lesson"));
    private UiSelector course = new UiSelector().resourceId("com.google.blockly.demo:id/tv_title_lesson");
    private UiObject pause = findObjectById("com.google.blockly.demo:id/bt_start_pause");
    //闯关
    private UiObject go = findObjectById("com.google.blockly.demo:id/iv_arts");
    private UiObject question_begin_btn = findObjectById("com.google.blockly.demo:id/btn_question_begin");
    private UiObject return_index_btn = findObjectById("com.google.blockly.demo:id/btn_return");
    private UiObject question_cancle_btn = findObjectById("com.google.blockly.demo:id/btn_question_cancle");
    private UiObject next_question_page_btn = findObjectById("com.google.blockly.demo:id/btn_next");
    private UiObject pre_question_page_btn = findObjectById("com.google.blockly.demo:id/btn_pre");
    private UiCollection questions = new UiCollection(new UiSelector().resourceId("com.google.blockly.demo:id/hv"));
    private UiSelector question = new UiSelector().className("android.widget.ImageView");
}
