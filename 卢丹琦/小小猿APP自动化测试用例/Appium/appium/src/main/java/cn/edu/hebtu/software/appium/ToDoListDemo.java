package cn.edu.hebtu.software.appium;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class ToDoListDemo {
    private AndroidDriver<WebElement> driver;

    @BeforeSuite
    public void startUp() throws IOException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "todolist.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "127.0.0.1:52001");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("noReset",true);//保留历史数据
        capabilities.setCapability("appPackage", "com.example.todolist");
        capabilities.setCapability("appActivity", ".LoginActivity");
        capabilities.setCapability("unicodeKeyboard",true);
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeClass
    public void login(){
        driver.findElementById("com.example.todolist:id/nameET").sendKeys("1");
        driver.findElementById("com.example.todolist:id/passwordET").sendKeys("1");
        driver.findElementById("com.example.todolist:id/loginBtn").click();
        driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
    }

    @Test(description = "批量添加")
    public void addNode(){
        for (int i=0;i<2;i++){
            driver.findElementById("com.example.todolist:id/action_new").click();
            driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
            driver.findElementById("com.example.todolist:id/toDoItemDetailET").sendKeys(i+"");
            driver.findElement(By.id("com.example.todolist:id/saveBtn")).click();
            driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
        }
    }

    @Test(description = "批量删除")
    public void deleteNode() {
        List<WebElement> listlength = driver.findElementsById("toDoItemDetailTv");
        int length = listlength.size();
        for (int j = 0; j < length; j++) {
            WebElement node = listlength.get(0);
            TouchAction dragNode = new TouchAction(driver).longPress(element(node)).perform();
            List<WebElement> delete = driver.findElementsById("android:id/title");
            delete.get(1).click();
            driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
            driver.findElementById("android:id/button1").click();
            driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);

        }
    }

}
