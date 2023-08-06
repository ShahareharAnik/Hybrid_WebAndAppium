//package Core;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class AppHelper {
//    DesiredCapabilities dc = new DesiredCapabilities();
//    AndroidDriver driver;
//
//    public AndroidDriver apkLaunch() throws InterruptedException, MalformedURLException {
//        dc.setCapability(MobileCapabilityType.UDID, "2f25712");
//        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10 pro");
//        dc.setCapability("platformVersion", "11");
//        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
//        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
//        Thread.sleep(6000);
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
//        return driver;
//    }
//}
package Core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppHelper {
    DesiredCapabilities dc = new DesiredCapabilities();
    static AndroidDriver driver;

    public AndroidDriver apkLaunch() throws InterruptedException, MalformedURLException {
        dc.setCapability(MobileCapabilityType.UDID, "276c42c8");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Anik's Nord");
        dc.setCapability("platformVersion", "12.0");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        Thread.sleep(6000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        return driver;


    }
}