package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import Page.WebDriverEngine;

public class BaseTest{
    AndroidDriver<WebElement> driver;
    public WebDriverEngine web;
    AndroidAction<Action> action;
    @BeforeSuite
    public void startApp() throws Exception{
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "Base.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.google.blockly.demo");
        capabilities.setCapability("appActivity", "com.google.blockly.android.demo.Welcome");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
//    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
