package com.example.testCase;

import com.example.base.BaseAppium;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register extends BaseAppium {

    //手机注册
    @Test(priority = 0)
    public void registerWphone(String phoneNumber, String password) throws InterruptedException {

        sleep(1000);
        //点击菜单
        clickView("iv_spin");
        clickView("iv_me");
        sleep(300);
        //判断是否已登录
        if (isIdElementExist("btn_login", false)) {
            //输入账号密码
            clickView("btn_register");
            sleep(3000);
            input(findById("et_userEmailOrPhone"), phoneNumber);
            input(findById("et_userPassword"), password);
            input(findById("et_reWriteUserPassword"),password);
            clickView("btn_register");
            sleep(100);
            Assert.assertTrue(isIdElementExist("btn_login"), "判断是否到了登录界面");
        } else {
            clickView("iv_spin");
            clickView("iv_HomePage");
        }
    }

    //邮箱注册
    @Test(priority = 1)
    public void registerWemail(String emailNumber, String password) throws InterruptedException {

        sleep(1000);
        //点击菜单
        clickView("iv_spin");
        clickView("iv_me");
        sleep(300);
        //判断是否已登录
        if (isIdElementExist("btn_login", false)) {
            //输入账号密码
            clickView("btn_register");
            sleep(3000);
            clickView("tv_emailRegister");
            sleep(1000);
            input(findById("et_userEmailOrPhone"), emailNumber);
            input(findById("et_userPassword"), password);
            input(findById("et_reWriteUserPassword"),password);
            clickView("btn_register");
            sleep(100);
            Assert.assertTrue(isIdElementExist("btn_login"), "判断是否到了登录界面");
        } else {
            clickView("iv_spin");
            clickView("iv_HomePage");
        }
    }

}
