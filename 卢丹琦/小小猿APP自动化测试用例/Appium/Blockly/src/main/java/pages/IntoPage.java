package pages;


import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class IntoPage {

    public AndroidDriver driver;
    public Actions action;

    public IntoPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement clickinto(){
        return this.driver.findElementById("com.google.blockly.demo:id/ll_go");

    }

//    public void clickScreen(int x, int y, int duration, AndroidDriver drivers) {
//        JavascriptExecutor js = (JavascriptExecutor) drivers;
//        HashMap tapObject = new HashMap();
//        tapObject.put("x", x);
//        tapObject.put("y", y);
//        tapObject.put("duration", duration);
//        js.executeScript("mobile: tap", tapObject);
//    }

    public void into(){
        action.click(clickinto());
    }
}
