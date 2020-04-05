package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BasePage {
    public AppiumDriver driver;

    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }
    public void zclick(By elementLocation){
        driver.findElement(elementLocation).click();
    }

}
