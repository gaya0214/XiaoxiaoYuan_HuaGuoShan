package com.example.huaguoshan.base;


import com.example.huaguoshan.utils.Log;
import com.example.huaguoshan.utils.ReadProperties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

    public String driverType;
    public static AndroidDriver<WebElement> driver;
    @BeforeSuite
    public AndroidDriver<WebElement> startApp(String driverType) throws IOException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "Xiaoxiaoyuan.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "com.google.blockly.demo");
        capabilities.setCapability("appActivity", "com.google.blockly.android.demo.Welcome");
        driver =new  AndroidDriver<WebElement>(new URL("http://10.7.90.164:4723/wd/hub"),capabilities);
        return null;
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


    @BeforeSuite
    public void doBeforeSuite() throws Exception {

        driverType= ReadProperties.getPropertyValue("driverType");
        driver = this.startApp(driverType);
        driver.manage().window().maximize();
        Log.info(driverType);
    }

    public static String getCfgProperty(String string) {
        return null;
    }
}