package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Kupondas extends BasePage{
    public Kupondas(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By btnKupondas = By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[4]/android.widget.TextView");
    private By allShare = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Tüm Paylaşımlar\"]/android.widget.TextView");
    private By playNow = By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button");
    private By activityName1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    private By activityName2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]");

    public void clickKupondas(){
        driver.findElement(btnKupondas).click();
    }
    public void clickallShare(){
        driver.findElement(allShare).click();
    }
    public void clickplayNow(){
        driver.findElement(playNow).click();
    }
    public void FirstActivityName() {
        String actualName = driver.findElement(activityName1).getText();
        String expectedName = "Juventus FC - Diriangen FC";
        Assert.assertEquals(actualName, expectedName);
    }
    public void SecondActivityName() {
        String actualName = driver.findElement(activityName2).getText();
        String expectedName = "FC Bgu Minsk - Minsk";
        Assert.assertEquals(actualName, expectedName);
    }
}
