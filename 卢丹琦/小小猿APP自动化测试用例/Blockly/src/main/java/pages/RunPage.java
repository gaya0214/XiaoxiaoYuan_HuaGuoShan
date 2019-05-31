package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class RunPage {
    public AndroidDriver driver;
    public Actions action;

    public RunPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickrun(){
        return this.driver.findElementById("com.google.blockly.demo:id/btn_run");

    }

    public void run() throws InterruptedException {
        action.click(clickrun());
    }
}
