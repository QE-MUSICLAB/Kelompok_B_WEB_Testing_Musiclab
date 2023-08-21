package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LogoutPage;
import org.openqa.selenium.WebDriver;



public class LogoutSteps {

    public WebDriver webDriver;

    public LogoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }
    @And("User click ok button")
    public void userClickOkButton() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickOkButton();
    }

    @When("User click logout button")
    public void userClickLogoutButton() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickLogoutButton();
    }

    @Then("User will see pop up message You have been Logged out")
    public void userWillSeePopUpMessageYouHaveBeenLoggedOut() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.verifyLogoutLandingPage();
    }

}
