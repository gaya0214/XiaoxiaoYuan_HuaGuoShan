package cn.edu.hebtu.software.xiaoxiaoyuan_test;

import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiCollection;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import org.junit.Test;

public class Uiautomator {
	private UiDevice device;
	
	@Test
	public void test1(){
		//
	    device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
		device.pressHome();
		UiObject logo = device.findObject(new UiSelector().text("小小猿"));
		logo.click();	
		//点击空白区域开始
		UiObject ll_go =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/ll_go"));
		ll_go.click();
        //点击菜单
		UiObject TextView=device.findObject(new UiSelector().className("android.widget.TextView"));
		TextView.click();
        //点击我
		UiObject iv_me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
		iv_me.click();
	}
	@Test
	public void test2(){
		//注册
		//1.点击注册
		UiObject btn_register =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_register"));
		btn_register.click();
		//2.手机号注册
		UiObject et_userEmailOrPhone =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
		et_userEmailOrPhone.click();
		et_userEmailOrPhone.setText("15226511111");
		//3.密码
		UiObject et_userPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPassword"));
		et_userPassword.click();
		et_userPassword.setText("111111");
		//4.确认密码
		UiObject et_reWriteUserPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_reWriteUserPassword"));
		et_reWriteUserPassword.click();
		et_reWriteUserPassword.setText("111111");
		//5.点击注册
		UiObject btn_register =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_register"));
		btn_register.click();
	}
	@Test
	public void test3(){
        //登录
        //1.用户名
		UiObject et_userEmailOrPhone =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userEmailOrPhone"));
		et_userEmailOrPhone.click();
		et_userEmailOrPhone.setText("15226513121");
        //2.密码
		UiObject et_userPassword =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPassword"));
		et_userPassword.click();
		et_userPassword.setText("111111");
        //3.点击登录
		UiObject btn_login =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_login"));
		btn_login.click();
	}
	@Test
	public void test4(){
        //我
		UiObject iv_me =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me"));
		iv_me.click();
        //修改个人信息
		UiObject iv_me_head_images =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_me_head_images"));
		iv_me_head_images.click();
		//用户名
		UiObject et_userName =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userName"));
		et_userName.setText("小小猿");
		//性别
		UiObject et_userSex =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userSex"));
		et_userSex.setText("女");
		//电子邮箱
		UiObject et_userPhone =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userPhone"));
		et_userPhone.setText("123@163.com");
		//出生日期
		UiObject et_userBirthday =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_userBirthday"));
		et_userBirthday.setText("2019-5-1");

        //个人作品
		UiObject works =device.findObject(new UiSelector().text("个人作品"));
		works.click();
		//我的好友
		UiObject friend =device.findObject(new UiSelector().text("我的好友"));
		friend.click();
		UiObject btn_friend_delete =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_friend_delete"));
		btn_friend_delete.click();
		//添加好友
		UiObject et_add_friend =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/et_add_friend"));
		et_add_friend.setText("12345@qq.com");
		UiObject btn_add_friend =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_add_friend"));
		btn_add_friend.click();
		//好友申请
		UiObject apply =device.findObject(new UiSelector().text("好友申请"));
		apply.click();
		UiObject btn_add_friend =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_add_friend"));
		btn_add_friend.click();
		UiObject btn_request_accept =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_request_accept"));
		btn_request_accept.click();
		UiObject btn_request_ignore =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/btn_request_ignore"));
		btn_request_ignore.click();
		//我的题库
		UiObject question =device.findObject(new UiSelector().text("我的题库"));
		question.click();
		//我的下载
		UiObject download =device.findObject(new UiSelector().text("我的下载"));
		download.click();
		//注销
		UiObject tv_setting =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/tv_setting"));
		tv_setting.click();
	}
	@Test
	public void test5(){
        //社区
		UiObject iv_community =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_community"));
		iv_community.click();
	}
	@Test
	public void test6(){
		//查看排行榜
		UiObject TextView =device.findObject(new UiSelector().className("android.widget.TextView"));
		TextView.click();
		UiObject iv_charts =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_charts"));
		iv_charts.click();
		//1.天梯榜
		UiObject fra_labber =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/fra_labber"));
		fra_labber.click();
		UiObject lra_addfriends =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/lra_addfriends"));
		lra_addfriends.click();
		//2.好友榜
		UiObject fra_friends =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/fra_friends"));
		fra_friends.click();
	}
	@Test
	public void test7(){
        //单击主页
		UiObject TextView =device.findObject(new UiSelector().className("android.widget.TextView"));
		TextView.click();
		UiObject iv_HomePage =device.findObject(new UiSelector().resourceId("com.google.blockly.demo:id/iv_HomePage"));
		iv_HomePage.click();

	}	
}
