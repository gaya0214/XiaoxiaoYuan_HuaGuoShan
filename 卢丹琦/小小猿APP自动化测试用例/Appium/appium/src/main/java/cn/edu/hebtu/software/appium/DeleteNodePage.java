package cn.edu.hebtu.software.appium;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class DeleteNodePage {

    public void deleteNode(AndroidDriver<WebElement> driver) {
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
