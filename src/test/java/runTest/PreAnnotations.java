package runTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utility.Driver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by magn on 10/4/2017.
 */
public class PreAnnotations {

    @BeforeSuite()
    public void RunFirst() throws IOException, InterruptedException {

        Runtime.getRuntime().exec("cmd /c start C:\\Users\\magn.MOBICAPL\\IdeaProjects\\AppiumTr2\\src\\startAppium.bat");
        Thread.sleep(20000);
        //Runtime.getRuntime().exec("cmd /c start C:\\Users\\magn.MOBICAPL\\IdeaProjects\\AppiumTr2\\src\\startEmulator.bat");
        //Thread.sleep(25000);




    }

    /*@AfterSuite()
    public void RunLast() {
        try {
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
