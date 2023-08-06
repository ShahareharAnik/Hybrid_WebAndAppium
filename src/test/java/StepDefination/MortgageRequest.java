package StepDefination;

import POM.AppElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static StepDefination.Steps.driver;
public class MortgageRequest {
    AppElements element;
    @Given("User can apply for Mortgage")
    public void userCanApplyForMortgage() {
        System.out.println("..................................Mortgage Request..................................................");
    }

    @And("Click on Mortgage Request")
    public void clickOnMortgageRequest() throws InterruptedException {
        element = new AppElements(driver);
        element.mot();
    }

    @And("Input User {string} and {string}")
    public void inputUserFirstNameAndLastName(String a,String b) throws InterruptedException {
        element.Names(a,b);
    }

    @And("input {string}")
    public void inputAge(String n) throws InterruptedException {
        element.Age(n);
    }

    @And("Input Users {string} and {string}")
    public void inputUsersAddressOneAndAddressTwo(String Tasnim,String Hasan ) throws InterruptedException {
        element.Address(Tasnim,Hasan);
    }

    @And("Choice {string}")
    public void choiceCountry(String c) throws InterruptedException {
        element.Cntrs(c);
    }

    @And("Select Users info")
    public void selectUsersInfo() throws InterruptedException {
        element.info();
    }

    @Then("Save These")
    public void saveThese() {
        element.save();
    }
}
