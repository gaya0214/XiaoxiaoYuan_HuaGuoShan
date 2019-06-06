package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class ResetPage {
    public AndroidDriver driver;
    public Actions action;

    public ResetPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickreset(){
        return this.driver.findElementById("com.google.blockly.demo:id/blockly_center_view_button");

    }

    public void reset() throws InterruptedException {
        action.click(clickreset());
    }
}
