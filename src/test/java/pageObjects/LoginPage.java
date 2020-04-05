package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utility.WaiterHelper;

    public class LoginPage extends BasePage {
    
    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    WaiterHelper waithelper;
    private By btnLogin = By.id("btn_login");
    private By txtUserName = By.id("username_edit");
    private By txtPassword = By.id("password_edit");
    private By loginBtn = By.id("login_btn");

    //"Giriş Yap" - Anasayfa
    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }
    public void setUserName(String email){
        //waithelper.waitForElement(txtUserName,60);
        driver.findElement(txtUserName).clear();
        driver.findElement(txtUserName).sendKeys(email);
    }
   public void setPassword(String password){
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);
    }
    //KullanıcıAdı - Şifre ile giriş yap
    public void clickHomePage(){
        driver.findElement(loginBtn).click();
    }
}
