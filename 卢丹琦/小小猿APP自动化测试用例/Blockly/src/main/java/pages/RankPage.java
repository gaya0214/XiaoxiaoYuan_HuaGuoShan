package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class RankPage {
    public AndroidDriver driver;
    public Actions action;

    public RankPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement ranklist(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_charts");
    }

    private WebElement friendrank(){
        return this.driver.findElementById("com.google.blockly.demo:id/fra_friends");
    }

    public void rank() throws InterruptedException {
        action.click(ranklist());
        Thread.sleep(5000);
        action.click(friendrank());

    }


}
