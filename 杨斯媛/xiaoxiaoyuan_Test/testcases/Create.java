package testcases;

import com.pages.ElementsFinder;
import io.appium.java_client.android.AndroidDriver;
import utils.Actions;
import org.openqa.selenium.support.PageFactory;
import com.base.BasePrepare;

public class Creat extends BasePrepare{
    //进入创建页面
    MenuTest.HomePage();
    HomeTest.create();

    //创建
    public void create(){
        action.click("id=iv_creat");
        //将语句拖入
        CreateMap_Uiautomator.logic();
        CreateMap_Uiautomator.text();
        CreateMap_Uiautomator.string();

    }

    //保存
    public void save(){
        //将语句拖入
        CreateMap_Uiautomator.logic();
        CreateMap_Uiautomator.text();
        CreateMap_Uiautomator.string();
        action.click("text='保存'");
    }

    //清空
    public void clean(){
        //将语句拖入
        CreateMap_Uiautomator.logic();
        CreateMap_Uiautomator.text();
        CreateMap_Uiautomator.string();
        action.click("text='清空'");
    }

    //运行
    public void run(){
        //将语句拖入
        CreateMap_Uiautomator.logic();
        CreateMap_Uiautomator.text();
        CreateMap_Uiautomator.string();
        action.click("text='运行'");
    }
}