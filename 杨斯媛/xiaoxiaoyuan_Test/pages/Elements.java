package pages

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class Elements{
    Action action;
    WebDriver driver;

    @FindBy(id = "com.google.blockly.demo:id/iv_arts")
    private WebElement iv_arts;
    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;
    @FindBy(id = "com.google.blockly.demo:id/iv_spin")
    private WebElement iv_spin;
    @FindBy(id = "com.google.blockly.demo:id/iv_me")
    private WebElement iv_me;
    @FindBy(id = "com.google.blockly.demo:id/et_userEmailOrPhone")
    private WebElement user_name;
    @FindBy(id = "com.google.blockly.demo:id/et_userPassword")
    private WebElement user_pwd;
    @FindBy(id = "com.google.blockly.demo:id/btn_login")
    private WebElement btn_login;
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
    @FindBy(id="com.google.blockly.demo:id/iv_setting")
    private WebElment iv_setting;
    @FindBy(id="com.google.blockly.demo:id/et_reWriteUserPassword")
    private WebElement writ_pwd;
}