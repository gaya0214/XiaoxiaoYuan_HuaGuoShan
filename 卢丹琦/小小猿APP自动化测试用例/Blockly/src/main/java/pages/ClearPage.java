package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class ClearPage {
    public AndroidDriver driver;
    public Actions action;

    public ClearPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickdelete(){
        return this.driver.findElementById("com.google.blockly.demo:id/btn_clear");

    }

    public void delete() throws InterruptedException {
        action.click(clickdelete());
    }

}
