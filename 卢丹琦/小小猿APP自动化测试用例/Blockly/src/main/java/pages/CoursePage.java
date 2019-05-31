package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class CoursePage {
    public AndroidDriver driver;
    public Actions action;

    public CoursePage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickinto(){
        return this.driver.findElementById("com.google.blockly.demo:id/ll_go");

    }

    private WebElement course_btn(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_tv");

    }

    public void course() throws InterruptedException {
        action.click(clickinto());
        Thread.sleep(1000);
        action.click(course_btn());
    }


}
