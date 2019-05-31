package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class GoPage {
    public AndroidDriver driver;
    public Actions action;

    public GoPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement btn_go(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_arts");
    }

    private WebElement btn_next(){
        return this.driver.findElementById("com.google.blockly.demo:id/btn_next");
    }

    public void go() throws InterruptedException {
        action.click(btn_go());
        Thread.sleep(1000);
        action.click(btn_next());

    }
}
