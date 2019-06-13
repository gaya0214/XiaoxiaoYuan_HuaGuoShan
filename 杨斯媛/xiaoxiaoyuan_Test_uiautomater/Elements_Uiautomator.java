package pages;

import android.bluetooth.BluetoothClass;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiCollection;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.List;

public class Elements_Uiautomator{
    UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    private UiObject ll_go = findObjectById("com.google.blockly.demo:id/ll_go");
    private UiObject list =findObjectById("com.google.blockly.demo:id/iv_spin");
    private UiObject mine =findObjectById("com.google.blockly.demo:id/iv_me");
    private UiObject usrname = findObjectById("com.google.blockly.demo:id/et_userEmailOrPhone");
    private UiObject usrpwd = findObjectById("com.google.blockly.demo:id/et_userPassword");
    private UiObject login_btn = findObjectById("com.google.blockly.demo:id/btn_login");
    //注册
    private UiObject reg = findObjectById("com.google.blockly.demo:id/btn_register");
    private UiObject reg_name = findObjectById("com.google.blockly.demo:id/et_userEmailOrPhone");
    private UiObject reg_pwd1 = findObjectById("com.google.blockly.demo:id/et_userPassword");
    private UiObject reg_pwd2 = findObjectById("com.google.blockly.demo:id/et_reWriteUserPassword");
    private UiObject reg_btn = findObjectById("com.google.blockly.demo:id/btn_register");
    //菜单功能
    private UiObject home_page = findObjectById( "com.google.blockly.demo:id/iv_HomePage");
    private UiObject charts = findObjectById("com.google.blockly.demo:id/iv_charts");
    private UiObject community = findObjectById("com.google.blockly.demo:id/iv_community");
    private UiObject sound = findObjectById("com.google.blockly.demo:id/iv_setting");
    //播放课程
    private UiObject tv = findObjectById("com.google.blockly.demo:id/iv_tv");
    private UiCollection courses = new UiCollection(new UiSelector().resourceId("com.google.blockly.demo:id/lv_lesson"));
    private UiSelector course = new UiSelector().resourceId("com.google.blockly.demo:id/tv_title_lesson");
    private UiObject pause = findObjectById("com.google.blockly.demo:id/bt_start_pause");
    //闯关
    private UiObject go = findObjectById("com.google.blockly.demo:id/iv_arts");
    private UiObject question_begin_btn = findObjectById("com.google.blockly.demo:id/btn_question_begin");
    private UiObject return_index_btn = findObjectById("com.google.blockly.demo:id/btn_return");
    private UiObject question_cancle_btn = findObjectById("com.google.blockly.demo:id/btn_question_cancle");
    private UiObject next_question_page_btn = findObjectById("com.google.blockly.demo:id/btn_next");
    private UiObject pre_question_page_btn = findObjectById("com.google.blockly.demo:id/btn_pre");
    private UiCollection questions = new UiCollection(new UiSelector().resourceId("com.google.blockly.demo:id/hv"));
    private UiSelector question = new UiSelector().className("android.widget.ImageView");
}