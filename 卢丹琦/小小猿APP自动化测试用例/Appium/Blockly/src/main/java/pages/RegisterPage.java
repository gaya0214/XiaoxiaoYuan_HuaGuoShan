package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class RegisterPage {
    public AndroidDriver driver;
    public Actions action;

    public RegisterPage(AndroidDriver driver){
        this.driver=driver;
        action=new Actions(driver);
    }

    private WebElement me(){
        return this.driver.findElementById("com.google.blockly.demo:id/iv_me");
    }

    private WebElement btn_register(){
        return this.driver.findElementById("com.google.blockly.demo:id/btn_register");
    }

    private WebElement txt_name(){
        return this.driver.findElementById("com.google.blockly.demo:id/et_userEmailOrPhone");
    }

    private WebElement txt_password(){
        return this.driver.findElementById("com.google.blockly.demo:id/et_userPassword");
    }

    private WebElement txt_repassword(){
        return this.driver.findElementById("com.google.blockly.demo:id/et_reWriteUserPassword");
    }

    public void register(String name,String password) throws InterruptedException {

        action.click(me());
        Thread.sleep(1000);
        action.click(btn_register());
        Thread.sleep(1000);
        action.type(txt_name(),name);
        action.type(txt_password(),password);
        action.type(txt_repassword(),password);
        action.click(btn_register());
    }
}
