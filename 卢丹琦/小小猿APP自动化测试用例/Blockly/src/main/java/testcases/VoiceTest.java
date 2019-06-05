package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.VoicePage;

public class VoiceTest extends BasePrepare{

    @Test
    public void voiceSuccessful() throws InterruptedException {

        //成功进入主界面后设置静音的测试
        VoicePage voicePage = new VoicePage(driver);
        voicePage.voice();

    }
}
