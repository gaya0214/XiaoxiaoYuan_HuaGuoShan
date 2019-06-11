package com.pages;


public class Voice extends Elements{
    //控制音量
        PageFactory.initElement(driver.this);
        action=new Action(driver);
        action.click(ll_go);
        //获取音量按钮状态
        String statu=driver.getStatuBy(id(iv_setting));
    }
    //关闭声音
    public Close(){
        if(statu==0){
            action.click(iv_setting);
        }
        else return 0;
    }
}