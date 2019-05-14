package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import sun.rmi.runtime.Log;


public class BasePrepare {

    public AndroidDriver<WebElement> driver;

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

//    @AfterSuite
//    public void tearDown() {
//        driver.quit();
//    }

}
