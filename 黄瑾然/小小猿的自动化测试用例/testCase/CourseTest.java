package testCase;

import org.testng.annotations.Test;

import Base.BaseTest;

public class CourseTest extends BaseTest{

    //查看教程并暂停
    public void studyAstop(){
        web.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]");
        web.click("xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]");
        web.click("id=bt_start_pause");
    }
}

