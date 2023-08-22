package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.DeleteAccountPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeleteAccountSteps {
    public WebDriver webDriver;

    public DeleteAccountSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }


    @When("User click profile button")
    public void userClickProfileButton() {
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(webDriver);
        deleteAccountPage.clickProfileButton();
    }

    @And("User click deactivate account button")
    public void userClickDeactiveAccountButton() throws InterruptedException {
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(webDriver);
        deleteAccountPage.clickDeleteMentor();

    }

    @Then("User click Ya, hapus akun! button")
    public void userClickYaHapusAkunButton() throws InterruptedException {
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(webDriver);
        deleteAccountPage.clickYaHapusAkunButton();
        Thread.sleep(8000);

    }

    @And("User will direct to login page")
    public void userWillDirectToLoginPage() {
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(webDriver);
        Assert.assertTrue(deleteAccountPage.verifyHomePage());
    }
    @And("User will stay at profile page")
    public void userWillStayToLoginPage() {
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(webDriver);
        Assert.assertTrue(deleteAccountPage.verifyHomePage());
    }


    @And("User click delete account button")
    public void userClickDeleteAccountButton() {
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(webDriver);
        deleteAccountPage.clickDeleteButtonStudent();
    }
}
