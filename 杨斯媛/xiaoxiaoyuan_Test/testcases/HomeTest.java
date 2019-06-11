package testCase;

import Page.WebDriverEngine;
import org.testng.annotations.Test;

import Base.BaseTest;

public class HomeTest extends BaseTest {

    //进入菜单
    @Test
    public void mainList(){
        action.click(iv_spin);
        action.click(iv_HomePage);
    }

    //进入GO
    @Test
    public void go(){
        action.click(iv_arts);
    }

    //进入CREAT
    @Test
    public void creat(){
        web.click(iv_creat);
    }

    //进入COURSE
    @Test
    public void course(){
        action.click(iv_tv);
    }
}
