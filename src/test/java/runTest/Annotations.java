package runTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import pages.Page;
import utility.Driver;

import java.net.MalformedURLException;

/**
 * Created by magn on 9/27/2017.
 */
public class Annotations {

    static AndroidDriver<AndroidElement> driver;


    /*@BeforeTest
    public void SetUp() throws MalformedURLException, InterruptedException {
        driver = Driver.setCapabilities();
        //Thread.sleep(1500);
        int height = driver.manage().window().getSize().getHeight();
        driver.swipe(5, height * 2 / 3, 5, height / 3, 1000);
        Thread.sleep(5000);
    }*/

    @Test
    public void AOpeningBrowser() throws MalformedURLException, InterruptedException {
        driver = Driver.setCapabilities();
        //Thread.sleep(1500);
        int height = driver.manage().window().getSize().getHeight();
        driver.swipe(5, height * 2 / 3, 5, height / 3, 1000);
        Thread.sleep(5000);
        Page page = new Page(driver);
        page.preference.click();
        page.preference_dependencies.click();
        page.checkbox.click();
        page.wifi_settings.click();
        page.wifi_edit.sendKeys("test");
        page.getButton().click();

/*        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Preference dependencies')]")).click();
        driver.findElement(By.className("android.widget.CheckBox")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("test");
        driver.findElements(By.className("android.widget.Button")).get(1).click();*/

    }
}
