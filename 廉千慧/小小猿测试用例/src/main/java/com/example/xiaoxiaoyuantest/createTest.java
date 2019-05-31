package com.example.xiaoxiaoyuantest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class createTest {
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
        //点击create
        driver.findElementById("com.google.blockly.demo:id/iv_creat").click();
        //空白情况下，点击“运行”
        driver.findElementById("btn_run").click();
        //点击保存
        driver.findElementById("btn_save").click();
        //点击清除
        driver.findElementById("btn_clear").click();

    }
}
