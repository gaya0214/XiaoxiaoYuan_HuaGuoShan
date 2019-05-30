package testCases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class HomeTest extends BaseTest {
    //单击主页
    @Test
    public void test01(){
        webtest.click("class=android.widget.TextView");
        webtest.click("id=iv_HomePage");
    }

    //GO
    @Test
    public void go(){
        webtest.click("id=iv_arts");
        webtest.click("id=btn_0");
        webtest.click("id=btn_question_begin");
        webtest.click("name=文本");
        webtest.click("name=打印");
        webtest.type("name=abc","Hello World");
        webtest.click("name=运行");
    }

    //CREAT
    @Test
    public void creat(){
        webtest.click("id=iv_creat");
        webtest.click("name=文本");
        webtest.click("name=打印");
        webtest.type("name=abc","Hello World");
        webtest.click("name=运行");
    }

    //COURSE
    @Test
    public void course(){
        webtest.click("id=iv_tv");
        webtest.click("id=iv_lesson");
        webtest.click("id=bt_start_pause");
        webtest.click("id=iv_return");
    }
}
