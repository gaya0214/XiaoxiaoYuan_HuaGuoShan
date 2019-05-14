package cn.edu.hebtu.software.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class AddNodePage {

    public void addNode(AndroidDriver<WebElement> driver){
        for (int i=0;i<2;i++){
            driver.findElementById("com.example.todolist:id/action_new").click();
            driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
            driver.findElementById("com.example.todolist:id/toDoItemDetailET").sendKeys(i+"");
            driver.findElement(By.id("com.example.todolist:id/saveBtn")).click();
            driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
        }
    }
}
