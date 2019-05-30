package com.example.xiaoxiaoyuantest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class menuTest {
    public AndroidDriver<WebElement> driver;

    @BeforeClass
    public void SetUp() throws IOException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "xiaoxiaoyuan.apk");
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.google.blockly.demo");
        capabilities.setCapability("appActivity", "com.google.blockly.android.demo.Welcome");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @Test
    public void test1() {
        //点击空白区域
        driver.findElementById("com.google.blockly.demo:id/tv_wel").click();
        //点击菜单
        driver.findElementById("com.google.blockly.demo:id/iv_spin").click();
        //点击排行榜
        driver.findElementById("com.google.blockly.demo:id/iv_charts").click();
        //点击好友榜
        driver.findElementById("com.google.blockly.demo:id/fra_friends").click();
    }
    @Test
    public void test2(){
        //点击菜单
        driver.findElementById("com.google.blockly.demo:id/iv_spin").click();
        //点击“我”
        driver.findElementById("com.google.blockly.demo:id/iv_me").click();
        //点击“注册”
        driver.findElementById("com.google.blockly.demo:id/btn_register").click();
        //开始注册
        driver.findElementById("com.google.blockly.demo:id/et_userEmailOrPhone").sendKeys("15226553668");
        driver.findElementById("com.google.blockly.demo:id/et_userPassword").click();
        driver.findElementById("com.google.blockly.demo:id/et_userPassword").sendKeys("123456");
        driver.findElementById("com.google.blockly.demo:id/et_reWriteUserPassword").click();
        driver.findElementById("com.google.blockly.demo:id/et_reWriteUserPassword").sendKeys("123456");
        driver.findElementById("com.google.blockly.demo:id/btn_register").click();

    }
    @Test
    public void test3(){
        //点击菜单
        driver.findElementById("com.google.blockly.demo:id/iv_spin").click();
        //返回主页
        driver.findElementById("com.google.blockly.demo:id/iv_HomePage").click();

    }
    public void test4(){
        //点击声音按钮，是否能关闭声音
        driver.findElementById("com.google.blockly.demo:id/iv_setting").click();
        //点击声音按钮，是否能打开
        driver.findElementById("com.google.blockly.demo:id/iv_setting").click();
    }
    @Test
    public void test5(){
        //点击“我”
        driver.findElementById("com.google.blockly.demo:id/iv_me").click();
        //修改用户名
        driver.findElementById("et_userName").click();
        int i;
        for (i=0;i<5;i++) {
            driver.findElementById("et_userName").clear();
        }
        driver.findElementById("et_userName").sendKeys("newname");

    }
    @Test
    public void test6(){
        //添加手机号
        driver.findElementById("et_userPhone").click();
        driver.findElementById("et_userPhone").sendKeys("18889811131");
    }
    @Test
    public void test7(){
        //添加出生日期
        driver.findElementById("et_userBirthday").click();
        driver.findElementById("et_userBirthday").sendKeys("1998-10-10");
    }



}
