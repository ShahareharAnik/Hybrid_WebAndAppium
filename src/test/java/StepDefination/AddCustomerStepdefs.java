package StepDefination;

import Core.Helper;
import POM.Webelements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddCustomerStepdefs {
   static WebDriver driver;
    Webelements web ;
    @io.cucumber.java.en.Given("^Manager lands on the XYZ bank home page$")
    public void managerLandsOnTheXYZBankHomePage() {
        Helper hp = new Helper();
        driver = hp.chromeLaunch();


    }


    @When("manager clicks on bank  manager login option")
    public void managerClicksOnBankManagerLoginOption() throws InterruptedException {
        web=new Webelements(driver);
        web.ManagerLogIn();

    }

    @And("click on the add customer tab")
    public void clickOnTheAddCustomerTab() throws InterruptedException {
        Thread.sleep(2000);
    web.AddCustomer();
        
    }

    @And("sends customer {string} and {string} and {string}")
    public void sendsCustomerFirstNameAndLastNameAndPostCode(String FirstName,String lastName,String postCode) throws InterruptedException {
        Thread.sleep(4000);
       web.CustomerData(FirstName,lastName,postCode);

        
    }

    @And("clicks on the customer button")
    public void clicksOnTheCustomerButton() throws InterruptedException {
        Thread.sleep(2000);
       web.clickButton();
      //  Alert simpleAlert = driver.switchTo().alert();
        //simpleAlert.accept();
    }

    @Then("go to the next page")
    public void goToTheNextPage() {
        System.out.println("...............");
    }
}
