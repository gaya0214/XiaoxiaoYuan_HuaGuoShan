package testCases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class CommunityTest extends BaseTest {
    //社区
    @Test
    public void test01(){
        webtest.click("class=android.widget.TextView");
        webtest.click("id=iv_community");
    }
}
