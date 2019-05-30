package testCases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class MeTest extends BaseTest {

    @Test
    public void test01() {
        webtest.click("class=android.widget.TextView");
        webtest.click("id=iv_me");
    }

    //修改个人信息
    @Test
    public void modify() {
        webtest.click("id=iv_me_head_images");
        //用户名
        webtest.type("id=et_userName", "小小猿");
        //性别
        webtest.type("id=et_userSex", "女");
        //电子邮箱
        webtest.type("id=et_userPhone", "123@163.com");
        //出生日期
        webtest.type("id=et_userBirthday", "2019-5-1");
    }


    //个人作品
    @Test
    public void test02() {
        webtest.click("name=个人作品");
    }

    //我的好友
    @Test
    public void test03() {
        webtest.click("name=我的好友");
        //删除好友
        webtest.click("id=btn_friend_delete");
}

    @Test
    public void test04() {
        webtest.click("name=我的好友");
        //添加好友
        webtest.type("id=et_add_friend","12345@qq.com");
        webtest.click("id=btn_add_friend");
    }


    //好友申请
    @Test
    public void test05(){
        webtest.click("name=好友申请");
        //同意
        webtest.click("id=btn_request_accept");
    }

    @Test
    public void test06(){
        webtest.click("name=好友申请");
        //拒绝
        webtest.click("id=btn_request_ignore");
    }

    //我的题库
    @Test
    public void test07(){
        webtest.click("name=我的题库");
    }

    //我的下载
    @Test
    public void test08(){
        webtest.click("name=我的下载");
    }

    //注销
    @Test
    public void test09(){
        webtest.click("id=tv_setting");
    }
}
