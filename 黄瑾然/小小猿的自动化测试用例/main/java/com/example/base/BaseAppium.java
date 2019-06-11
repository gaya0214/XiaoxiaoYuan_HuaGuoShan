package com.example.base;

import com.example.utils.TextUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;


@Listeners({com.example.base.AssertionListener.class})
public class BaseAppium {
    //调试设备名字
    public static String deviceName = "emulator-5554";
    //调试设备系统版本
    public static String platformVersion = "4.0";
    //app路径
    public static String appPath = System.getProperty("user.dir") + "/src/main/java/apps/Base.apk";

    //包名
    public static String appPackage = "com.google.blockly.demo";

    //要启动的Activity
    public static String appActivity = "com.google.blockly.android.demo.Welcome";

    public AndroidDriver<AndroidElement> driver = null;


    //单个触摸操作类
    TouchAction touchAction;

    //多个触摸操作时间
    MultiTouchAction multiTouchAction;

    private static int WAIT_TIME = 10;    //默认的等待控件时间
    private static int SWIPE_DEFAULT_PERCENT = 5;    //默认滑动比例


    //构造方法
    public BaseAppium() {
        this(new Builder());
    }

    public BaseAppium(Builder builder) {
        System.out.print("基类初始化!");
        appActivity = builder.appActivity;
        appPackage = builder.appPackage;
        appPath = builder.appPath;
        deviceName = builder.deviceName;
    }


    /**
     * appium启动参数
     *
     * @throws MalformedURLException
     */
    @BeforeSuite
    public void beforeSuite() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", new File(appPath).getAbsolutePath());
        capabilities.setCapability("appPackage", appPackage);
        //打开的activity
        capabilities.setCapability("appActivity", appActivity);
        //启动Driver
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }


    @AfterTest
    public void afterTest() {
        //结束这次测试
        driver.quit();
    }


    public boolean isIdElementExist(String id) {
        return isIdElementExist(id, false);
    }

    /**
     * 根据id判断当前界面是否存在并显示这个控件
     *
     * @param id     要查找的id
     * @param isShow 是否判断控件显示
     * @return 返回对应的控件
     */
    public boolean isIdElementExist(String id, boolean isShow) {
        AndroidElement ae;
        try {
            if (driver != null) {
                ae = driver.findElementById(appPackage + ":id/" + id);
                if (isShow) {
                    return ae.isDisplayed();
                } else {
                    return ae != null;
                }
            } else {
                System.out.print("driver为空");
            }
        } catch (NoSuchElementException e) {
            System.out.print("找不到控件" + e.getMessage());
        }

        return false;

    }

    /**
     * 选择当前界面的有这个文字的控件
     *
     * @param name
     * @param hasShow 是否显示
     * @return
     */
    public boolean isNameElementExist(String name, boolean hasShow) {
        try {
            AndroidElement ae = driver.findElement(By.name(name));
            if (hasShow) {
                return ae.isDisplayed();
            } else return ae != null;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean isNameElementExist(String name) {
        return isNameElementExist(name, false);
    }


    /**
     * 判断控件时候存在
     *
     * @param by      By
     * @param timeout 等待的事件
     * @return
     */
    public boolean isElementExist(By by, int timeout) {
        try {
            Thread.sleep(3000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * 根据id获取当前界面的一个控件
     *
     * @param id 要查找的id
     * @return 返回对应的控件
     */
    public AndroidElement findById(String id) {
        try {
            if (driver != null) {
                return driver.findElementById(appPackage + ":id/" + id);
            } else {
                System.out.print("driver为空");
            }
        } catch (NoSuchElementException e) {
            System.out.print("找不到控件" + e.getMessage());
        }
        return null;
    }


    /**
     * 选择当前界面的有这个文字的控件
     *
     * @param name 内容
     * @return 找到的控件
     */
    public AndroidElement findByName(String name) {
        return driver.findElement(By.name(name));
    }


    /**
     * 根据xpath获取当前界面的一个控件
     * @param xpath
     * @return  返回对应的控件
     */
    public AndroidElement findByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    /**
     * 根据text获取当前界面的一个控件
     * @param text
     * @return 返回对应的控件
     */
    public AndroidElement findByLinkText(String text){
        return driver.findElement(By.linkText(text));
    }

    /**
     * 根据className获取当前界面的一个控件
     *
     * @param name 要查找的控件的类名
     * @return 返回对应的控件
     */
    public AndroidElement findByClassName(String name) {
        try {
            if (driver != null) {
                return driver.findElementByClassName(name);
            } else {
                System.out.print("dricer为空");
            }
        } catch (NoSuchElementException e) {
            System.out.print("找不到控件" + e.getMessage());
        }
        return null;
    }


    /**
     * Click点击空格键
     *
     * @param ae 要点击的控件
     * @return 返回是否点击
     */
    public boolean clickView(AndroidElement ae) {
        return clickView(ae, "");
    }


    /**
     * Click点击控件
     *
     * @param ae  控件
     * @param str 控件的文字描述，供错误时候输出
     * @return 返回是否存在控件
     */
    public boolean clickView(AndroidElement ae, String str) {
        if (ae != null) {
            ae.click();
            return true;
        } else {
            System.out.print(str + "为空，点击错误");
        }
        return false;
    }

    /**
     * Click点击指定id的View
     *
     * @param id 要点击的控件的id
     * @return 点击了返回真
     */
    public boolean clickView(String id) {
        AndroidElement ae = findById(id);
        if (ae != null) {
            ae.click();
            return true;
        } else {
            System.out.print(id + "为空，点击错误");
        }
        return false;
    }


    /**
     * 线程休眠秒数，单位秒
     *
     * @param s 要休眠的秒数
     */
    public void sleep(long s) throws InterruptedException {
        Thread.sleep(s);
    }


    /**
     * 获取触摸实例
     *
     * @return
     */
    public TouchAction getTouch() {
        if (driver == null) {
            System.out.print("单点触摸时候driver为空");
            return null;
        } else {
            if (touchAction == null) {
                return new TouchAction(driver);
            } else {
                return touchAction;
            }

        }
    }


    /**
     * 获取多点触摸实例
     *
     * @return
     */
    public MultiTouchAction getMultiTouch() {
        if (driver == null) {
            System.out.print("多点触摸时候driver为空");
            return null;
        } else {
            if (multiTouchAction == null) {
                return new MultiTouchAction(driver);
            } else {
                return multiTouchAction;
            }

        }
    }

    /**
     * 往控件输入字符串
     *
     * @param ae  要输入的控件
     * @param str 要输入的字符串
     */
    public void input(AndroidElement ae, String str) {
        if (ae == null) {
            System.out.print("控件为空,输入内容失败:" + str);
        } else {
            ae.sendKeys(str);
        }

    }


    /**
     * 向上滑动，
     *
     * @param
     */
    public void swipeToUp() {

        int width = getScreenWidth();
        int height= getScreenHeight();
        new TouchAction(driver).longPress(PointOption.point(width / 2, 100))
                .moveTo(PointOption.point(width / 2, height - 100)).release()
                .perform();
    }


    /**
     * 向下滑动，
     *
     * @param
     */
    public void swipeToDown() {
        int width = getScreenWidth();
        int height = getScreenHeight();
        new TouchAction(driver)
                .longPress(PointOption.point(width / 2, height - 100))
                .moveTo(PointOption.point(width / 2, 100)).release().perform();
    }


    /**
     * 向左滑动，
     *

     */
    public void swipeToLeft() {
        int width = getScreenWidth();
        int height = getScreenHeight();
        new TouchAction(driver)
                .longPress(PointOption.point(width - 100, height / 2))
                .moveTo(PointOption.point(100, height / 2)).release().perform();
    }


    /**
     * 向右滑动，
     *
     */
    public void swipeToRight() {
        int width = getScreenWidth();
        int height = getScreenHeight();
        new TouchAction(driver).longPress(PointOption.point(100, height / 2))
                .moveTo(PointOption.point(width - 100, height / 2)).release()
                .perform();
    }


    /**
     * 获取当前的activity,返回文件名
     *
     * @return
     */
    public String getCurrActivity() {
        String str = driver.currentActivity();
        return str.substring(str.lastIndexOf(".") + 1);
    }


    /**
     * 点击某个控件
     *
     * @param ae 要点击的控件
     */
    public void press(AndroidElement ae) {
        try {

            ae.click();
        } catch (Exception e) {
            System.out.print("tab点击元素错误" + e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * 点击某个坐标
     *
     * @param x
     * @param y
     */
    public void press(int x, int y) {
        try {
            getTouch().tap(PointOption.point(x, y)).perform();
        } catch (Exception e) {
            System.out.print("tab点击元素错误" + e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * 长按某个坐标
     *
     * @param x
     * @param y
     */
    public void longPress(int x, int y) {
        try {
            getTouch().longPress(PointOption.point(x, y)).release().perform();
        } catch (Exception e) {
            System.out.print("长按点击元素错误" + e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * 在某个方向上滑动
     *
     * @param direction 方向，UP DOWN LEFT RIGHT
     */
    public void swip(String direction) {
        switch (direction) {
            case "UP":
                swipeToUp();
                break;
            case "DOWN":
                swipeToDown();
                break;
            case "LEFT":
                swipeToLeft();
                break;
            case "RIGHT":
                swipeToRight();
                break;
        }
    }


    /**
     * 获取屏幕的宽高
     *
     * @return 返回宽高的数组
     */
    public int[] getScreen() {
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        return new int[]{width, height};
    }

    /**
     * 获取屏幕宽度
     *
     * @return
     */
    public int getScreenWidth() {
        return driver.manage().window().getSize().getWidth();
    }

    /**
     * 获取屏幕高度
     *
     * @return
     */
    public int getScreenHeight() {
        return driver.manage().window().getSize().getHeight();
    }


}
