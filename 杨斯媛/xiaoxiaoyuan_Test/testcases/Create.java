package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;

public class Creat extends BasePrepare{
    //创建
    public void create(){
        action.click(iv_creat);
        action.click(workspace);
    }

    //保存
    public void save(){
        action.click("text='保存'");
        action.click(workspace);
    }
    //清空
    public void clean(){
        action.click("text='清空'");
        action.click(workspace);
    }
    //运行
    public void run(){
        action.click("text='运行'");
        action.click(workspace);
    }
}