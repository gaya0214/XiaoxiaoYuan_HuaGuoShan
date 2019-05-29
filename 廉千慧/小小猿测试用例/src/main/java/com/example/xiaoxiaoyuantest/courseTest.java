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

public class courseTest {
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
    public void test1(){
        //点击空白区域
        driver.findElementById("com.google.blockly.demo:id/tv_wel").click();
        //点击“教程”
        driver.findElementById("com.google.blockly.demo:id/iv_tv").click();
        //点击第一个视频
        driver.findElementByClassName("android.widget.ImageView").click();

    }
    @Test
    public void test2(){
        //点击播放
        driver.findElementById("com.google.blockly.demo:id/bt_start_pause").click();
        //点击暂停
        driver.findElementById("com.google.blockly.demo:id/bt_start_pause").click();
    }
}
