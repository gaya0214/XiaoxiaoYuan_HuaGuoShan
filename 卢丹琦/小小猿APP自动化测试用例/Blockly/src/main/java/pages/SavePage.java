package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class SavePage {
    public AndroidDriver driver;
    public Actions action;

    public SavePage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clicksave(){
        return this.driver.findElementById("com.google.blockly.demo:id/btn_run");

    }

    public void save() throws InterruptedException {
        action.click(clicksave());
    }
}
