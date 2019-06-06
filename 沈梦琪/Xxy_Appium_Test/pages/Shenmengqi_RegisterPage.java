package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class RegisterPage {

    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;
    @FindBy(className = "android.widget.TextView")
    private WebElement list;
    @FindBy(id = "com.google.blockly.demo:id/iv_me")
    private WebElement mine;
    @FindBy(id = "com.google.blockly.demo:id/btn_register")
    private WebElement register;
    @FindBy(id = "com.google.blockly.demo:id/et_userEmailOrPhone")
    private WebElement reg_name;
    @FindBy(id = "com.google.blockly.demo:id/et_userPassword")
    private WebElement reg_pwd;
    @FindBy(id = "com.google.blockly.demo:id/et_reWriteUserPassword")
    private WebElement reg_sure_pwd;
    @FindBy(id = "com.google.blockly.demo:id/btn_register")
    private WebElement reg_btn;

    public void register(String name,String pwd1,String pwd2) throws Exception{
        action.click(list);
        action.click(mine);
        action.click(register);
        Thread.sleep(2);
        action.type(reg_name,name);
        action.type(reg_pwd,pwd1);
        action.type(reg_sure_pwd,pwd2);
        action.click(reg_btn);
    }

    Actions action;
    public RegisterPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        action=new Actions(driver);
        ll_go.click();
    }

}
