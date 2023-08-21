package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        LoginPage loginPage = new LoginPage(webDriver);
    }
    @And("User click login button")
    public void userClickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLoginButton();

    }


    @And("User input string} as email,and input {string} as password, and select {string} as role")
    public void userInputAsEmailAndInputAsPasswordAndSelectAsRoleAndUserClickLoginButton(String registerEmail, String psd, String role)  {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setRegisterEmail(registerEmail);
        loginPage.setPassword(psd);
        loginPage.setSelectRole(role);


    }
    @Then("User will see pop up message login success")
    public void userWillSeePopUpMessageLoginSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(loginPage.verifyLoginPagePopUp());

    }

    @And("User will direct to homepage")
    public void userWillDirectToHomepage () {
    LoginPage loginPage = new LoginPage(webDriver);
    Assert.assertTrue(loginPage.verifyHomePage());
        }


    @Then("User will see pop up message data not found")
    public void userWillSeePopUpMessageDataNotFound() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyFailedLogin());

    }

    @And("^User input \"([^\"]*)\" as email,and input \"([^\"]*)\" as password, and select \"([^\"]*)\" as role$")
    public void userInputAsEmailAndInputAsPasswordAndSelectAsRole(String registerEmail, String psd, String role) throws Throwable {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setRegisterEmail(registerEmail);
        loginPage.setPassword(psd);
        loginPage.setSelectRole(role);

    }
}
