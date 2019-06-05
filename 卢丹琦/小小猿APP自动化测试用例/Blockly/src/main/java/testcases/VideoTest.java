package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.CoursePage;
import pages.VideoPage;

public class VideoTest extends BasePrepare{
    @Test
    public void courseSuccessful() throws InterruptedException {

        //成功播放course版块的视频的测试
        CoursePage coursePage = new CoursePage(driver);
        coursePage.course();
        VideoPage videoPage = new VideoPage(driver);
        videoPage.videoplay();

    }
}
