package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class DeletePage {
    public AndroidDriver driver;
    public Actions action;

    public DeletePage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickdelete(){
        return this.driver.findElementById("com.google.blockly.demo:id/blockly_trash_icon");

    }

    public void delete() throws InterruptedException {
        action.click(clickdelete());
    }
}
