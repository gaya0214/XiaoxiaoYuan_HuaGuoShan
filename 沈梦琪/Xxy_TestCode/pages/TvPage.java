package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class TvPage {
    @FindBy(id = "com.google.blockly.demo:id/iv_tv")
    private WebElement tv;
    @FindBy(id = "com.google.blockly.demo:id/ll_go")
    private WebElement ll_go;
    @FindBy(id = "com.google.blockly.demo:id/bt_start_pause")
    private WebElement pause;

    public void play(int i){
        List<WebElement> playlist = driver.findElements(By.id("com.google.blockly.demo:id/tv_athor_lesson"));
        WebElement playnode = playlist.get(i--);
        action.click(playnode);
    }

    public void pause(){
        this.play(1);
        action.click(pause);
    }

    WebDriver driver;
    Actions action;
    public TvPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);//与@FindBy同时出现的
        this.driver = driver;
        action=new Actions(driver);
        action.click(ll_go);
        action.click(tv);
    }
}
