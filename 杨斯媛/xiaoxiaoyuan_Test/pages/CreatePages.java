package pages

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class CreatePages extends Elements{
    Action action;
    public CreatePages(AndroidDriver driver){
    PageFactory.initElements(driver.this);
    action.click(ll_go);
    action.click(create);

    }
}