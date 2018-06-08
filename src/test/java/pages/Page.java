package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by magn on 10/10/2017.
 */
public class Page {

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preference;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Preference dependencies')]")
    public WebElement preference_dependencies;

    @FindBy(className = "android.widget.CheckBox")
    public WebElement checkbox;

    @FindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public WebElement wifi_settings;

    @FindBy(id = "android:id/edit")
    public WebElement wifi_edit;

/*    @FindBy(className = "android.widget.Button")
    WebElement preference_dependencies;*/


    By button = By.className("android.widget.Button");
    public WebElement getButton() {
        return driver.findElements(button).get(1);
    }
}
