package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class ShrinkPage {
    public AndroidDriver driver;
    public Actions action;

    public ShrinkPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickshrink(){
        return this.driver.findElementById("com.google.blockly.demo:id/blockly_zoom_out_button");

    }

    public void shrink() throws InterruptedException {
        action.click(clickshrink());
    }
}
