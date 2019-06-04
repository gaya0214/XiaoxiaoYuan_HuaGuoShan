package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CoursePage;

public class CourseTest extends BasePrepare{

    @Test
    public void courseSuccessful() throws InterruptedException {

        //成功进入course版块的测试
        CoursePage coursePage = new CoursePage(driver);
        coursePage.course();

    }
}
