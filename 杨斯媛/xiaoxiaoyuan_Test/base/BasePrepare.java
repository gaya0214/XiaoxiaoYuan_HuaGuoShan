package com.base

import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.Actions;


public class AndroidCreateSessionTest1{
    private AndroidDriver<WebElement> driver;
    private static AppiumDriverLocalService service;
    private final String PACKAGE="com.google.blockly.demo";

    @BeforeClass
    public void setUp()throes Exception{
        File classpathRoot=new File(System.getProperty("user.dir"));
        File appDir=new File(classpathRoot,"/apps");
        File app=new File(appDir.getCanonicalPath(),"xxy.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","127.0.0.1:62001");
        capabilities.setCapability("app",aap.getAbsolutePath());
        capabilities.setCapability("appPackage","com.google.blockly.demo");
        capabilities.setCapability("unicodeKeyboard",true);
        driver=new AndroidDriver<Element>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testCreateSession(){
        String activity.driver.currentActivity();
        String pkg=driver.getCurrentPackage();
        Assert.assertEuals(activity,".ApiDemos");
        Assert.assertEquals(pkg,"io.appium.android.apis");
    }


}