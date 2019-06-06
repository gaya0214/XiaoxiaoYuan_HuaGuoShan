package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class MenuPage {

    @FindBy(id = "com.google.blockly.demo:id/iv_spin")
    private WebElement list;
    @FindBy(id = "com.google.blockly.demo:id/iv_me")
    private WebElement mine;
    @FindBy(id = "com.google.blockly.demo:id/iv_HomePage")
    private WebElement home_page;
    @FindBy(id = "com.google.blockly.demo:id/iv_charts")
    private WebElement charts;
    @FindBy(id = "com.google.blockly.demo:id/iv_community")
    private WebElement community;
    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;
    @FindBy(id = "com.google.blockly.demo:id/iv_setting")
    private WebElement iv_setting;


    public void index(){
        action.click(list);
        action.click(home_page);
    }

    public void charts(){
        action.click(list);
        action.click(charts);
    }

    public void mine(){
        action.click(list);
        action.click(mine);
    }
    //静音
    public void mute(){
        action.click(iv_setting);
    }

    Actions action;
    public MenuPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        action=new Actions(driver);
        action.click(ll_go);
    }
}
