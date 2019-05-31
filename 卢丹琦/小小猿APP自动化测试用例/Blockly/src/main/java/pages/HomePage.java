package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class HomePage {
    public AndroidDriver driver;
    public Actions action;

    public HomePage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickhome(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_HomePage");

    }

    public void home() throws InterruptedException {
        action.click(clickhome());
    }
}
