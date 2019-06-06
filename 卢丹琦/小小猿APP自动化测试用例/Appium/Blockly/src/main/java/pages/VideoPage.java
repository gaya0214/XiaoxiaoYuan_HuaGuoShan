package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class VideoPage {

    public AndroidDriver driver;
    public Actions action;

    public VideoPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement video(){
        return this.driver.findElementById("com.google.blockly.demo:id/tv_title_lesson");

    }

    public void videoplay()  {
        action.click(video());
    }


}
