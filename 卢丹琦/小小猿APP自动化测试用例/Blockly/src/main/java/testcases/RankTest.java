package testcases;


import org.testng.annotations.Test;

import base.BasePrepare;
import pages.LoginPage;
import pages.MenuPage;
import pages.RankPage;

public class RankTest extends BasePrepare{

    @Test
    public void rankSuccessful() throws InterruptedException {

        //成功查看用户等级，并切换不同榜单查看的测试
        MenuPage menuPage = new MenuPage(driver);
        menuPage.menu();
        Thread.sleep(1000);
        RankPage rankPage = new RankPage(driver);
        rankPage.rank();

    }
}
