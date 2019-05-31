package pages;

import org.openqa.selenium.WebElement;

public class WebDriverEngine {
    ElementFinder finder = null;

    public void type(String locator, String value) {
        WebElement element = finder.findElement(locator);
        if (element != null) {
            element.sendKeys(value);
        }
    }

    public void click(String locator) {

        WebElement element = finder.findElement(locator);
        if (element != null) {
            element.click();
            this.pause(3000);
        }
    }

    private void pause(int time) {
        if (time <= 0) {
            return;
        }
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
