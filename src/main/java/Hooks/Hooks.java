package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "Android SDK built for x86");
        cap.setCapability("app", "C://Users//Admin//Desktop//Automation//APK's//EaseMyTrip_5.6.2.apk");
        cap.setCapability("appActivity", "com.easemytrip.common.activity.HomeActivity");
        cap.setCapability("noReset", true);
        cap.setCapability("MobileCapabilityType.AUTOMATION_NAME", "UiAutomator2");
        cap.setCapability("appPackage", "com.easemytrip.android");

        // Initialize the Appium driver
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), cap);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}
