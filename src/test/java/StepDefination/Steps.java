package StepDefination;

import Core.AppHelper;
import POM.AppElements;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class Steps {
    static AndroidDriver driver;
    AppElements elements;
    @Given("app apk is there")
    public void appApkIsThere() throws MalformedURLException, InterruptedException {
        AppHelper helper= new AppHelper();
        driver=helper.apkLaunch();
    }

    @When("user enters {string}and {string}")
    public void userEntersUsernameAndPassWord(String u, String p) throws InterruptedException {
        elements = new AppElements(driver);
        elements.inputField(u,p);
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
    }

    @Then("user will navigate to home screen")
    public void userWillNavigateToHomeScreen() {
        System.out.println("....................................loginOK.................................................");
    }
}
