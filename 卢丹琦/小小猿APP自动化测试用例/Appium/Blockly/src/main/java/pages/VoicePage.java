package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class VoicePage {
    public AndroidDriver driver;
    public Actions action;

    public VoicePage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickinto(){
        return this.driver.findElementById("com.google.blockly.demo:id/ll_go");

    }

    public void voice() throws InterruptedException {
        action.click(clickinto());
        Thread.sleep(1000);
        action.click(voice_btn());
    }

    private WebElement voice_btn(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_setting");

    }
}
