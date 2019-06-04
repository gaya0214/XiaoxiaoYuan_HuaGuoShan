package testCase;

import Base.BaseTest;
import org.testng.annotations.Test;

public class MeTest extends BaseTest{

    //进入我的
    public void test(){
        web.click("id=iv_spin");
        web.click("id=iv_me");
    }

    //修改个人信息
    @Test
    public void changeMessage() {
        web.type("id=et_userName","bean");
        web.type("id=et_userBirthday","1111.1.1");
    }

    //修改头像
    @Test
    public void changeTmage(){
        web.click("id=btn_exitUserImage");
        web.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView");
    }

    //删除好友
    @Test
    public void friendsList(){
        web.click("id=ll_me_my_friend");
        web.click("id=btn_friend_delete");
    }

    //添加好友
    @Test
    public void friendsAdd(){
        web.click("id=ll_me_my_friend");
        web.type("id=et_add_friend","admin");
        web.click("id=btn_add_friend");
    }

    //查看好友申请
    @Test
    public void friendsRequest(){
        web.click("id=ll_me_friend_request");
    }

}
