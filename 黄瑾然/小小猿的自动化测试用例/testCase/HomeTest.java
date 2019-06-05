package testCase;

import Page.WebDriverEngine;
import org.testng.annotations.Test;

import Base.BaseTest;

public class HomeTest extends BaseTest {

    //进入菜单
    @Test
    public void mainList(){
        web.click("id=iv_spin");
        web.click("id=iv_HomePage");
    }

    //GO
    @Test
    public void go(){
        web.click("id=iv_arts");
    }

    //CREAT
    @Test
    public void creat(){
        web.click("id=iv_creat");
    }

    //COURSE
    @Test
    public void course(){
        web.click("id=iv_tv");
    }

    //静音
    @Test
    public void silence(){
        web.click("id=iv_setting");
    }
}
