package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class CreatePage {

    @FindBy(id = "com.google.blockly.demo:id/iv_creat")
    private WebElement create;
    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;

    Actions action;
    public CreatePage(AndroidDriver driver){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        action=new Actions(driver);
        action.click(ll_go);
        action.click(create);
    }
}
