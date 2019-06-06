package cn.edu.hebtu.software.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class ToDolistDemo1 extends BaseTest{
    private AndroidDriver<WebElement> driver;


    @BeforeMethod
    public void login() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElementById("com.example.todolist:id/nameET").sendKeys("1");
        driver.findElementById("passwordET").sendKeys("1");
        driver.findElement(By.className("android.widget.Button")).click();

           }
      @Test(description = "批量插入，循环")
           public void addNote(){
        for(int i=0;i<5;i++){
            AndroidElement new_node= (AndroidElement) driver.findElement(By.id("action_new"));
            new_node.click();
            driver.findElementById("toDoItemDetailET").sendKeys("first第一个事件");
            driver.findElementById("saveBtn").click();
        }


           }
    @Test(description = "批量删除")
    public void deleteNode(){
        WebElement node=driver.findElementById("toDoItemDetailTv");
        TouchAction dragNDrop = new TouchAction(driver)
                .longPress(element(node)).perform();

        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text('删除')").click();

    }
}
