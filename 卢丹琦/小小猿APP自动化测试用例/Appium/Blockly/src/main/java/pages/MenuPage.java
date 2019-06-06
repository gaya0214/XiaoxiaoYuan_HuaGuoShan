package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class MenuPage {
    public AndroidDriver driver;
    public Actions action;

    public MenuPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickinto(){
        return this.driver.findElementById("com.google.blockly.demo:id/ll_go");

    }

    private WebElement menu_btn(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_spin");

    }

    public void menu() throws InterruptedException {
        action.click(clickinto());
        Thread.sleep(1000);
        action.click(menu_btn());
    }


}
