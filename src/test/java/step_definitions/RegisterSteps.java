package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    public WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;


    }
    @Given("User already on musiclab website")
    public void userAlreadyOnMusiclabWebsite() {
        RegisterPage registerPage = new RegisterPage(webDriver);
    Assert.assertTrue(registerPage.verifyLandingPage());
    }

    @When("User click login menu")
    public void userClickLoginMenu() {
        RegisterPage registerPage = new RegisterPage(webDriver);
    registerPage.clickLoginMenuButton();
    }

    @Then("User already in login page")
    public void userAlreadyInLoginPage() {
        RegisterPage registerPage = new RegisterPage(webDriver);
    Assert.assertTrue(registerPage.verifyLandingLoginPage());
    }

    @And("User click register on login page")
    public void userClickRegisterOnLoginPage() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterButton();
        Thread.sleep(2000);


    }

    @Then("User already in register page")
    public void userAlreadyInRegisterPage()  {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyRegisterLoginPage());

    }


    @And("User input {string} as namaLengkap, select {string} as role, input {string} as email and input {string} as password")
    public void userInputAsNamaLengkapSelectAsRoleInputAsEmailAndInputAsPassword(String nama, String role, String registerEmail, String psd) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setNamaLengkap(nama);
        registerPage.setSelectRole(role);
        registerPage.setRegisterEmail(registerEmail);
        registerPage.setPassword(psd);

    }

    @And("User click register button")
    public void userClickRegisterButton() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickButtonRegister();
        Thread.sleep(3000);
    }

    @Then("User will get the pop up message {string}")
    public void userWillGetThePopUpMessage(String arg0) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyPopUpSuccessMessage();
    }

    @Then("User will get the pop up message email has been registered")
    public void userWillGetThePopUpMessageEmailHasBeenRegistered() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyPopUpSuccessMessageAlready();

    }

    @And("User will see error")
    public void userWillSeeError() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyPopUpError();
        Thread.sleep(3000);

    }

    @And("User cant click register button")
    public void userCantClickRegisterButton() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterButton();
        Thread.sleep(2000);
    }

    @And("User will see error registred failed")
    public void userWillSeeErrorRegistredFailed() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.verifyPopUpError();
        Thread.sleep(3000);
    }
}
