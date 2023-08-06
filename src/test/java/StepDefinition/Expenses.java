//package StepDefinition;
//
//import POM.AppElements;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static StepDefinition.Steps.driver;
//
//public class Expenses {
//    AppElements elements;
//    @Given("User see the Homepage and go to Expenses")
//    public void userSeeTheHomepageAndGoToExpenses() {
//        System.out.println("..........................Expenses Report.................................");
//    }
//
//    @When("Click Add and Back")
//    public void clickAddAndBack() throws InterruptedException {
//        elements = new AppElements(driver);
//        elements.Expense();
//        elements.ADDandBack();
//    }
//
//    @Then("Logout")
//    public void logout() throws InterruptedException {
//        elements.Logout();
//    }
//
//}
