package cn.edu.hebtu.software.appium;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class LoginPageLu {

    public void login(AndroidDriver<WebElement> driver){
        driver.findElementById("com.example.todolist:id/nameET").sendKeys("1");
        driver.findElementById("com.example.todolist:id/passwordET").sendKeys("1");
        driver.findElementById("com.example.todolist:id/loginBtn").click();
        driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
    }
}
