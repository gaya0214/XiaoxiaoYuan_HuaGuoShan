package testCases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class RankTest extends BaseTest {

    //查看排行榜
    //天梯榜
    @Test
    public void rank1(){
        webtest.click("class=TextView");
        webtest.click("id=iv_charts");
        webtest.click("id=fra_labber");
        //添加好友
        webtest.click("id=lra_addfriends");
    }

    //好友榜
    @Test
    public void rank2(){
        webtest.click("class=TextView");
        webtest.click("id=iv_charts");
        webtest.click("id=fra_friends");
    }
}
