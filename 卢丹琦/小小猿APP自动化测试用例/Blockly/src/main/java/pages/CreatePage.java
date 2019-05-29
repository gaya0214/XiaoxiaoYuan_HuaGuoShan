package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class CreatePage {
    public AndroidDriver driver;
    public Actions action;

    public CreatePage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickinto(){
        return this.driver.findElementById("com.google.blockly.demo:id/ll_go");

    }

    public void create() throws InterruptedException {
        action.click(clickinto());
        Thread.sleep(1000);
        action.click(create_btn());
    }

    private WebElement create_btn(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_creat");

    }
}
