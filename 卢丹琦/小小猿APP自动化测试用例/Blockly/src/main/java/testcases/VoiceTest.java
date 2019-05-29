package testcases;

import org.testng.annotations.Test;

import base.BasePrepare;
import pages.VoicePage;

public class VoiceTest extends BasePrepare{

    @Test
    public void voiceSuccessful() throws InterruptedException {

        VoicePage voicePage = new VoicePage(driver);
        voicePage.voice();

    }
}
