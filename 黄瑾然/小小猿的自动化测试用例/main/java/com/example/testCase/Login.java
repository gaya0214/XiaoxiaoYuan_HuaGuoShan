package com.example.testCase;

import com.example.base.BaseAppium;
import com.example.base.Builder;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Login extends BaseAppium {

    @Test(priority = 0)
    public void login(String phoneNumber, String password) throws InterruptedException {
        clickView("tv_wel");
        sleep(1000);
        //点击菜单
        clickView("iv_spin");
        clickView("iv_me");
        sleep(300);
        //判断是否已登录
        if (isIdElementExist("btn_login", true)) {
            //输入账号密码
            input(findById("et_userEmailOrPhone"), phoneNumber);
            input(findById("et_userPassword"), password);
            clickView("btn_login");
            sleep(100);
            Assert.assertTrue(isIdElementExist("iv_creat"), "判断是否到了首页");
        } else {
            clickView("iv_spin");
            clickView("iv_HomePage");
        }
    }
}
