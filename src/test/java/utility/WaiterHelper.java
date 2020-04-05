package utility;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaiterHelper {
    public AppiumDriver driver;


    public void WaiterHelper(AppiumDriver driver){
        this.driver=driver;
    }
    public void waitForElement(By element, long timeOutInSecond){
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSecond);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }
}
