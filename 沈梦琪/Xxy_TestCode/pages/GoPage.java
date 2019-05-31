package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class GoPage {

    @FindBy(id = "com.google.blockly.demo:id/iv_arts")
    private WebElement go;
    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;
    @FindBy(id = "com.google.blockly.demo:id/iv_spin")
    private WebElement list;
    @FindBy(id = "com.google.blockly.demo:id/iv_me")
    private WebElement mine;
    @FindBy(id = "com.google.blockly.demo:id/et_userEmailOrPhone")
    private  WebElement usr_name;
    @FindBy(id = "com.google.blockly.demo:id/et_userPassword")
    private WebElement usr_pwd;
    @FindBy(id = "com.google.blockly.demo:id/btn_login")
    private WebElement login_btn;
    @FindBy(id = "com.google.blockly.demo:id/btn_question_begin")
    private WebElement btn_question_begin;
    @FindBy(id = "com.google.blockly.demo:id/btn_return")
    private WebElement btn_return;
    @FindBy(id = "com.google.blockly.demo:id/btn_question_cancle")
    private WebElement btn_question_cancle;
    @FindBy(id = "com.google.blockly.demo:id/btn_next")
    private WebElement btn_next;
    @FindBy(id = "com.google.blockly.demo:id/btn_pre")
    private WebElement btn_pre;

    //闯关确认界面
    public void forsure(int i){
        i=i-1;
        WebElement btn_num = driver.findElement(By.id("com.google.blockly.demo:id/btn_"+i));
        action.click(btn_num);
    }
    //从关卡选择界面回到首页
    public void btindex(){
        action.click(btn_return);
    }
    //闯关界面
    public void question_begin(int i){
        forsure(i--);
        action.click(btn_question_begin);
    }
    //取消闯关
    public void question_cancle(int i){
        forsure(i--);
        action.click(btn_question_cancle);
    }
    //换页
    public void next_page(){
        action.click(btn_next);
    }
    public void pre_page(){
        action.click(btn_pre);
    }

    Actions action;
    WebDriver driver;
    //进入答题界面，先登录
    public GoPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        action=new Actions(driver);
        action.click(ll_go);
        action.click(go);
    }

    public GoPage(AndroidDriver driver,String name,String pwd){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        this.driver=driver;
        action=new Actions(driver);
        action.click(ll_go);
        action.click(list);
        action.click(mine);
        action.type(usr_name,name);
        action.type(usr_pwd,pwd);
        action.click(login_btn);
        action.click(go);
    }

}
