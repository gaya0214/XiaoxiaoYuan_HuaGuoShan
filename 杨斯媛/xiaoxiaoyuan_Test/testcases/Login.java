package pages

import class Login extends Operation{
    public Login(AndroidDriver driver){
        PageFactory.initElement(driver.this);
        action=new Action(driver);
        action.click(ll_go);
    }

    public void Loginto (){
        action.click(iv_spin);
        action.click(iv_me);
        action.type(usr_name,name);
        action.type(usr_pwd,password);
        action.click(login_btn);
    }
}