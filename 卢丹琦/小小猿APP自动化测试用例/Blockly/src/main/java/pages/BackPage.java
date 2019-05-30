package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class BackPage {
    public AndroidDriver driver;
    public Actions action;

    public BackPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickback(){
        return this.driver.findElementById("com.google.blockly.demo:id/btn_return");

    }

    public void back() throws InterruptedException {
        action.click(clickback());
    }
}
