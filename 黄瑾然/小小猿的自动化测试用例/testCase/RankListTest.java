package testCase;

import Base.BaseTest;
import org.testng.annotations.Test;

public class RankListTest extends BaseTest {

    //查看天梯榜
    @Test
    public void labberList(){
        web.click("id=iv_spin");
        web.click("id=iv_charts");
        web.click("id=fra_labber");
    }

    //查看好友榜
    public void friendsList(){
        web.click("id=iv_spin");
        web.click("id=iv_charts");
        web.click("id=fra_friends");
    }

}
