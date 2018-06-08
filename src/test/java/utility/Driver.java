package utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by magn on 9/13/2017.
 */
public class Driver {

    public static AndroidDriver<AndroidElement> setCapabilities() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;
        File f = new File("src");
        File f_app = new File(f, "ApiDemos-debug.apk");
        //File f_app = new File(f, "whitelabel-preRelease.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "My_Nexus_5X");
        capabilities.setCapability(MobileCapabilityType.APP, f_app.getAbsolutePath());

        driver = new AndroidDriver<AndroidElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
