package com.example.xiaoxiaoyuantest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;

public class appTest {
    public AndroidDriver<WebElement> driver;

//测试create里面的内容

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
    public void test1(){
        //点击空白区域
        driver.findElementById("com.google.blockly.demo:id/tv_wel").click();
        //点击菜单
        driver.findElementById("com.google.blockly.demo:id/iv_spin").click();
        //点击“我”
        driver.findElementById("com.google.blockly.demo:id/iv_me").click();
        //输入用户名和密码
        driver.findElementById("com.google.blockly.demo:id/et_userEmailOrPhone").sendKeys("1234567@123.com");
        driver.findElementById("com.google.blockly.demo:id/et_userPassword").click();
        driver.findElementById("com.google.blockly.demo:id/et_userPassword").sendKeys("123456");
        driver.findElementById("com.google.blockly.demo:id/btn_login").click();


    }
    @Test
    public void test2(){
        //点击go
        driver.findElementById("com.google.blockly.demo:id/iv_arts").click();
        //点击第三颗星星并取消
        driver.findElementById("com.google.blockly.demo:id/btn_2").click();
        driver.findElementById("com.google.blockly.demo:id/btn_question_cancle").click();
    }
    @Test
    public void test3(){
        //点击第三个星星，并点击开始
        driver.findElementById("com.google.blockly.demo:id/btn_question_begin").click();
        //点击看题
        driver.findElementById("btn_question").click();
    }
    @Test
    public void test4(){
        //点击运行
        driver.findElementById("btn_run").click();
        //点击判读
        driver.findElementById("btn_adjust").click();
        //点击跳过
        driver.findElementById("com.google.blockly.demo:id/btn_dialog_jump").click();
    }
    @Test
    public void test5(){
        //点击第三个星星，并点击开始
        driver.findElementById("com.google.blockly.demo:id/btn_question_begin").click();
        //点击看题
        driver.findElementById("btn_question").click();
    }
    @Test
    public void test6(){
        //点击运行
        driver.findElementById("btn_run").click();
    }
    @Test
    public void test7(){
        //点击判读
        driver.findElementById("btn_adjust").click();
    }
    @Test
    public void test8(){
        //点击重试
        driver.findElementById("com.google.blockly.demo:id/btn_dialog_try").click();
    }
    @Test
    public void test9(){
        //点击清空
        driver.findElementById("btn_clear").click();
    }
    @Test
    public void test10(){
        //放大界面
        driver.findElementById("com.google.blockly.demo:id/blockly_zoom_in_button").click();
        //缩小界面
        driver.findElementById("com.google.blockly.demo:id/blockly_zoom_out_button").click();
        //复原
        driver.findElementById("\tcom.google.blockly.demo:id/blockly_center_view_button").click();

    }
    @Test
    public void test11(){
        //点击返回
        driver.findElementById("btn_return").click();
        //再点击返回
        driver.findElementById("btn_return").click();
    }
}
