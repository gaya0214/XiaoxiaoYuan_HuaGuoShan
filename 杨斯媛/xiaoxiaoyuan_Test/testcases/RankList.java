package testcases;

import Base.BaseTest;
import org.testng.annotations.Test;

public class RankListTest extends BaseTest {
    //进入排行榜
    public void charts(){
        action click(iv_spin);
        action click(iv_charts);
    }

    //查看天梯榜
    @Test
    public void labberList(){
        action.click(iv_spin);
        action.click(iv_charts);
        action.click(fra_labber);
    }

    //查看好友榜
    public void friendsList(){
        action.click(iv_spin);
        action.click(iv_charts);
        action.click(fra_friends);
    }

}
