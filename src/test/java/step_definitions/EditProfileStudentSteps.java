package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.EditProfileStudentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditProfileStudentSteps {

    public WebDriver webDriver;

    public EditProfileStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);

    @Given("User already on login page")
    public void verifyloginPage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setHomepage());
    }


    @And("User click login menu on musiclab website")
    public void userClickLoginMenuOnMusiclabWebsite() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clicklogin();

    }

    @Then("User already on login page musiclab web")
    public void userAlreadyOnLoginPageMusiclabWeb() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.verifyloginpage();
    }

    @And("User input {string} as email,input {string} as password and select {string} as role")
    public void userInputAsEmailInputAsPasswordAndSelectAsRole(String urname, String password, String role) {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setUserName(urname);
        editProfileStudentPage.setPassword(password);
        editProfileStudentPage.setRole(role);
    }

    @And("User click the login button")
    public void userClickTheLoginButton() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickloginsukses();
    }

    @Then("User will get the pop up  message login succes")
    public void userWillGetThePopUpMessage() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Thread.sleep(4000);
        Assert.assertTrue(editProfileStudentPage.setVerifikasiloginsucces());
    }

    @And("user click the succes login button")
    public void userClickTheSuccesLoginButton() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickbtnloginsucces();
    }

    @And("User will direct to  homepage")
    public void userWillDirectToHomepage(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setVerifikasidirecttohomepage());
    }

    @And("User click the profile menu on hompage")
    public void userClickTheProfileMenuOnHompage() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Thread.sleep(4000);
        editProfileStudentPage.setClicktbtnprofile();
    }

    @And("User already in profile student page")
    public void userAlreadyInProfileStudentPage() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Thread.sleep(8000);
        editProfileStudentPage.setUseralreadyprofilepage();
    }
    @And("User click edit profile")
    public void userClickEditProfile() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtneditprofile();
    }
    @And("User Already on edit profile page")
    public void userAlreadyOnEditProfilePage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setverifikasieditprofilepage());
    }

    @When("User input {string} as namalengkap, select {string} as jeniskelamin, input {string} as phone, input {string} as email and input {string} as alamat")
    public void userInputAsNamaLengkapSelectAsJenisKelaminInputAsPhoneInputAsEmailAndInputAsAlamat(String namaLengkap, String JenisKelamin, String NoHP, String Email, String Alamat) throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Thread.sleep(4000);
        editProfileStudentPage.setInputNamalengkap(namaLengkap);
        editProfileStudentPage.setInputJenisKelamin(JenisKelamin);
        editProfileStudentPage.setInputNoHP(NoHP);
        editProfileStudentPage.setInputnewemail(Email);
        editProfileStudentPage.setInputalamat(Alamat);
    }

    @And("User click the update button at edit profile student page")
    public void userClickTheUpdateButtonAtEditProfileStudentPage() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Thread.sleep(4000);
        editProfileStudentPage.setClickbtnupdate();
    }

    @Then("User will get the pop up messages")
    public void userWillGetThePopUpMessages() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Thread.sleep(4000);
        Assert.assertTrue(editProfileStudentPage.setverifikasipopupupdatesukses());
    }



}


