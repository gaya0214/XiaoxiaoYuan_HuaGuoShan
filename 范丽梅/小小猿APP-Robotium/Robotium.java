package cn.edu.hebtu.software.xiaoxiaoyuan_test;

import com.robotium.solo.Solo;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)

public class Robotium {
	
	    @Rule
		public ActivityTestRule<NotesList> activityTestRule =new ActivityTestRule<>(NotesList.class);
		private Solo solo;
		
		@Before
		public void setUp() throws Exception {
        solo = new Solo(InstrumentationRegistry.getInstrumentation(),
        activityTestRule.getActivity());
    }

		@After
		public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
		@Test
		public void test1(){
		solo.unlockScreen();
		//点击空白区域开始
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.ll_go));
		//点击我
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.iv_me));
		//注册
        //1.点击注册
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_register));
        //2.手机号注册
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userEmailOrPhone));
		solo.typeText(0, "15226511111");
        //3.密码
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userPassword));
		solo.typeText(0, "111111");
        //4.确认密码
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_reWriteUserPassword));
		solo.typeText(0, "111111");
		//5.点击注册
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_register));
		}
		
		@Test
		public void test2(){
		//登录
        //1.用户名
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userEmailOrPhone));
		solo.typeText(0, "15226511111");
        //2.密码
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userPassword));
		solo.typeText(0, "111111");
        //3.点击登录
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_login));
		}
		
		@Test
		public void test3(){
		//我
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.iv_me));
        //修改个人信息
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.iv_me_head_images));
        //用户名
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userName));
		solo.typeText(0, "小小猿");
        //性别
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userSex));
		solo.typeText(0, "女");
        //电子邮箱
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userPhone));
		solo.typeText(0, "123@163.com");
        //出生日期
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_userBirthday));
		solo.typeText(0, "2019-5-1");
        //我的好友
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_friend_delete));
        //添加好友
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.et_add_friend));
		solo.typeText(0, "123@163.com");
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_add_friend));
        //好友申请
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_add_friend));
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_request_accept));
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.btn_request_ignore));
        //注销
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.tv_setting));
		}
		
		@Test
		public void test4(){
        //社区
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.iv_community));
		}
		
		@Test
		public void test5(){
		//查看排行榜
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.iv_charts));
        //1.天梯榜
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.fra_labber));
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.lra_addfriends));
        //2.好友榜
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.fra_friends));
        //单击主页
		solo.clickOnView(solo.getView(com.google.blockly.demo.R.id.iv_HomePage));	
	}
}
