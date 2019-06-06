package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
    private AndroidDriver<WebElement> driver;

    public AndroidDriver<WebElement> getDriver(){
        return this.driver;
    }

    @BeforeMethod
    public void startUp() throws IOException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "xxy.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "127.0.0.1:52001");
//        capabilities.setCapability("app", app.getAbsolutePath());//每次运行前都安装一次apk
//        capabilities.setCapability("noReset",true);//保留历史数据
        capabilities.setCapability("appPackage", "com.google.blockly.demo");
//        capabilities.setCapability("appActivity", ".flyout.NoCategoriesToolboxActivity");
//        capabilities.setCapability("unicodeKeyboard",true);
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Log.getLog();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}