package sampleTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class androidTest {
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities cap;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.vizorapps.klondike");
        cap.setCapability("appActivity", "MainActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);

        new TouchAction(driver).tap(PointOption.point(1700,150)).release().perform();
        Thread.sleep(5000);
        new TouchAction(driver).tap(PointOption.point(300,1000)).release().perform();
        Thread.sleep(5000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        el1.click();
        Thread.sleep(10000);
        new TouchAction(driver).tap(PointOption.point(880,540)).release().perform();
        Thread.sleep(2500);
        driver.quit();
    }
}
