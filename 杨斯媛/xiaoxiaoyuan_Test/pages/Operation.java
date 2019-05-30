package pages

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class Operation {
    Action action;
    WebDriver driver;

    public void sure(int i) {
        WebElement btn_num = driver.findElement( By.id( "com.google.blockly.demo:id/btn_" + i ) );
        action.click( btn_num );
    }

    public void toindex() {
        action.click( btn_return );
    }

    public void question_begin() {
        sure( i-- );
        action.click( btn_question_begin );
    }

    public void question_cancel() {
        sure( i-- );
        action.click( btn_question_cancel );
    }

    public void next_page() {
        action.click( btn_next );
    }

    public void pre_page() {
        action.click( btn_pre );
    }

}
