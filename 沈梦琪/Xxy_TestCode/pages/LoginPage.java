package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.servlet.annotation.WebListener;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class LoginPage {
    @FindBy(id = "com.google.blockly.demo:id/et_userEmailOrPhone")
    private  WebElement usr_name;
    @FindBy(id = "com.google.blockly.demo:id/et_userPassword")
    private WebElement usr_pwd;
    @FindBy(id = "com.google.blockly.demo:id/btn_login")
    private WebElement login_btn;
    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;
    @FindBy(id = "com.google.blockly.demo:id/iv_spin")
    private WebElement list;
    @FindBy(id = "com.google.blockly.demo:id/iv_me")
    private WebElement mine;


    Actions action;
    public LoginPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        action=new Actions(driver);
        action.click(ll_go);
    }

    public void login(String name,String password){
        action.click(list);
        action.click(mine);
        action.type(usr_name,name);
        action.type(usr_pwd,password);
        action.click(login_btn);
    }

}