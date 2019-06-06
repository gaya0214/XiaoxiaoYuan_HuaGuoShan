package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
    AndroidDriver<WebElement> driver;
    @BeforeSuite
    public void startApp() throws IOException {

        File cr = new File(System.getProperty("user.dir"));
        File ad = new File(cr+"/apps");
        File app = new File(ad.getCanonicalPath(), "todolist.apk");
        DesiredCapabilities c = new DesiredCapabilities();
        c.setCapability("deviceName", "127.0.0.1:62001");

        c.setCapability("noReset",true);//保留历史数据

        c.setCapability("appPackage", "com.example.todolist");
        c.setCapability("appActivity", ".LoginActivity");
        c.setCapability("unicodeKeyboard",true);
        c.setCapability("resetKeyboard",true);
        driver =new  AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),c);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
