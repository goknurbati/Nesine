package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Kupondas;
import pageObjects.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static AppiumDriver<MobileElement> driver;
    public LoginPage loginPage;
    public Kupondas kupondas;

    public BaseClass() {
    }

    public void setup(String deviceName, String udid, String platformVersion, String url) throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = getDesiredCapabilities();

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
    public DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","SM-G965F");
        cap.setCapability("udid","2289885c080b7ece");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","10");

        cap.setCapability("appPackage","com.pordiva.nesine.android");
        cap.setCapability("appActivity","com.nesine.ui.taboutside.splash.SplashActivity");
        return cap;
    }

}
