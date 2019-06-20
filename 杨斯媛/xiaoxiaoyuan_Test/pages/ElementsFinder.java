package pages

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class Elements{
   private  AndroidDriver<WebElement> driver;

   public ElementFinder(AndroidDriver driver)
   {
       this.driver=driver;
   }
    public WebElement findElement(String target){
       WebElement element=null;
       try{
           element=findElementByPerfix(target);
       }catch(Exception e){
           Log.info(e.toString());
       }
       return element;
    }

    public WebElement findElementByPerfix(String locator)
    {
        String target=locator.trim();
        if(target.startsWith("id="))
        {
            locator=locator.substring("id=".length());
            return driver.findElement(By.id(locator));
        }else if ((target.startsWith("class="))
        {
            locator=locator.substring("class=".length());
            return driver.findElement(By.className(locator));
        }else if ((target.startsWith("class="))
        {
            locator=locator.substring("class=".length());
            return driver.findElement(By.className(locator));
        }
    }
    public void testFindElmentByAccessibilityId(){
        //通过Accessibility查找页面元素，在Android布局文件中是"content-desc"
        List<WebElement>searchParametersElement=(List<WebElement>)driver.findElementsByAccessibility
    }
}