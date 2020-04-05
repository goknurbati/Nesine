package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.Kupondas;
import pageObjects.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Step extends BaseClass {
    private static final String LOCALHOST = "http://127.0.0.1:4724/wd/hub";

    @Given("User launch application")
    public void user_launch_application() throws MalformedURLException, InterruptedException {
        driver = new AppiumDriver<MobileElement>(new URL(LOCALHOST),  getDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage = new LoginPage(driver);
        loginPage.clickLogin();
    }
    @Then("User enter username as {string}")
    public void user_enter_username_as(String email) {
        loginPage = new LoginPage(driver);
        loginPage.setUserName(email);
    }
   @Then("User enter password {string}")
    public void user_enter_password(String password) {
        loginPage.setPassword(password);
    }
    @Then("User click login")
    public void user_click_login() {
        loginPage.clickHomePage();
    }
    @When("User click kupondas button")
    public void user_click_kupondas_button() {
        kupondas = new Kupondas(driver);
        kupondas.clickKupondas();
    }
    @When("User click all shares button")
    public void user_click_all_shares_button() {
        kupondas.clickallShare();
    }
    @When("User click play now button")
    public void user_click_play_now_button() {
        kupondas.clickplayNow();
    }
    @Then("verify first activity name as {string}")
    public void verifyFirstActivityNameAs(String name1) {
        kupondas.FirstActivityName();
    }
    @And("verify second activity name as {string}")
    public void verifySecondActivityNameAs(String name2) {
        kupondas.SecondActivityName();
    }
}
