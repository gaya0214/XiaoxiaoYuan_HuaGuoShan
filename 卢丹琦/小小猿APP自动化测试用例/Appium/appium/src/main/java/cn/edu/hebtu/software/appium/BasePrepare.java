package cn.edu.hebtu.software.appium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BasePrepare {
    public static AndroidDriver<WebElement> driver;
    public static AppiumDriverLocalService service;

    @BeforeClass
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



    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }
}
