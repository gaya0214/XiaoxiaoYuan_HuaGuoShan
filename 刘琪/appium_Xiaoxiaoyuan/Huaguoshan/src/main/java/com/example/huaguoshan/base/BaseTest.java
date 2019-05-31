package com.example.huaguoshan.base;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

    public static AndroidDriver<WebElement> driver;
    @BeforeSuite
    public void startApp() throws IOException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "Xiaoxiaoyuan.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "com.google.blockly.demo");
        capabilities.setCapability("appActivity", "com.google.blockly.android.demo.Welcome");
        driver =new  AndroidDriver<WebElement>(new URL("http://10.7.90.164:4723/wd/hub"),capabilities);
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
