package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class  LoginPage {

//   不可用
//  @FindBy(id = "nameET")
//    private WebElement txt_name;

    private WebElement txt_name(){
       return this.driver.findElementById("nameET");
    }

    private WebElement txt_password(){
        return this.driver.findElementById("passwordET");
    }

    private WebElement btn_submit(){
        return this.driver.findElementById("loginBtn");
    }

    @FindAll({@FindBy(id="android:id/title")})
    public List<WebElement> elementList;
    public AndroidDriver driver;
    public Actions action;

    private  WebElement getTxt_name(){
        return driver.findElement(By.id(""));
    }


    public LoginPage(AndroidDriver driver){
        this.driver=driver;
//        PageFactory.initElements(driver,this);与@FindBy同时出现的
        action=new Actions(driver);
    }

    public void login(String name,String password){
          action.type(txt_name(),name);
          action.type(txt_password(),password);
          action.click(btn_submit());
    }
}
