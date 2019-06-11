package testcases;

import Page.WebDriverEngine;
import org.testng.annotations.Test;

import Base.BaseTest;

public class Menu extends BaseTest{
    //进入主页
    @Test
    public void HomePage(){
        action.click(iv_spin);
        action.click(iv_HomePage);
    }
    //进入排行榜
    @Test
    public void charts(){
        action click(iv_spin);
        action click(iv_charts);
    }
    //进入社区
    @Test
    public void community(){
        action.click(iv_spin);
        action.click(iv_community);
    }
    //进入用户信息
    @Test
    public void me(){
        action.click(iv_spin);
        action.click(iv_me);
    }

}