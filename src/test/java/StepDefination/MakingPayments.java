package StepDefination;

import POM.AppElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static StepDefination.Steps.driver;

public class MakingPayments {
    AppElements elements;
    @Given("User is Shown the HomePage")
    public void userIsShownTheHomePage() {
        System.out.println("..................................User is using Homepage................................................");
    }

    @And("Click on the Payment making")
    public void clickOnThePaymentMaking() throws InterruptedException {
        elements = new AppElements(driver);
        elements.MakePayment();
    }

    @And("Giving {string} And {string}")
    public void givingPhoneNumberAndName(String n,String a) throws InterruptedException {
        elements.PhoneNumber(n);
        elements.Receiver(a);
    }

    @And("Giving {string} and {string}")
    public void givingAmountAndCountry(String n,String a) throws InterruptedException {
        elements.Amount(n);
        elements.Where(a);
    }

    @Then("Click Send payment")
    public void clickSendPayment() throws InterruptedException {
        elements.SendPayment();

    }
}
