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
        this.login("1731234567","123456");
        go.click();
        UiObject question1 = questions.getChildByInstance(question,questionNum);
        question1.click();
    }

    public void question_begin(int questionNum)throws UiObjectNotFoundException{
        this.login("1731234567","123456");
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

}
