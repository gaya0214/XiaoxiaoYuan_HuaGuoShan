package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class MagnifyPage {
    public AndroidDriver driver;
    public Actions action;

    public MagnifyPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickmagnify(){
        return this.driver.findElementById("com.google.blockly.demo:id/blockly_zoom_in_button");

    }

    public void magnify() throws InterruptedException {
        action.click(clickmagnify());
    }
}
