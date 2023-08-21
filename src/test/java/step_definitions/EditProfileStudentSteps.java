package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.EditProfileStudentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EditProfileStudentSteps {

    public WebDriver webDriver;

    public EditProfileStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on login page")
    public void verifyloginPage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setHomepage());
    }


    @And("User click login menu on musiclab website")
    public void userClickLoginMenuOnMusiclabWebsite() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clicklogin();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Then("User already on login page musiclab web")
    public void userAlreadyOnLoginPageMusiclabWeb() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.verifyloginpage();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User input {string} as email,input {string} as password and select {string} as role")
    public void userInputAsEmailInputAsPasswordAndSelectAsRole(String urname, String password, String role) {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setUserName(urname);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setPassword(password);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setRole(role);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click the login button")
    public void userClickTheLoginButton() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickloginsukses();
    }

    @Then("User will get the pop up  message login succes")
    public void userWillGetThePopUpMessage(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setVerifikasiloginsucces());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
    public void userClickTheProfileMenuOnHompage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClicktbtnprofile();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User already in profile student page")
    public void userAlreadyInProfileStudentPage(){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setUseralreadyprofilepage();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @And("User click edit profile")
    public void userClickEditProfile() throws InterruptedException {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.clickbutneditprofil();
    }
    @And("User Already on edit profile page")
    public void userAlreadyOnEditProfilePage()  {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setverifikasieditprofilepage());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User input {string} as namalengkap, select {string} as jeniskelamin, input {string} as phone, input {string} as email and input {string} as alamat")
    public void userInputAsNamaLengkapSelectAsJenisKelaminInputAsPhoneInputAsEmailAndInputAsAlamat(String namaLengkap, String JenisKelamin, String NoHP, String Email, String Alamat){
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setInputNamalengkap(namaLengkap);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setInputJenisKelamin(JenisKelamin);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setInputNoHP(NoHP);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setInputnewemail(Email);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setInputalamat(Alamat);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click the update button at edit profile student page")
    public void userClickTheUpdateButtonAtEditProfileStudentPage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtnupdate();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User will get the pop up messages")
    public void userWillGetThePopUpMessages()  {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setverifikasipopupupdatesukses());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

// edit password with valid data
    @When("User input {string} as old password, select {string} as new password , and input {string} as confirmation password")
    public void userInputAsOldPasswordSelectAsNewPasswordAndInputAsConfirmationPassword(String Oldpassword, String newPassword, String ConfirmationPassword)  {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setInputoldpassword(Oldpassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setInputnewpassword(newPassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editProfileStudentPage.setInputconfirmationpassword(ConfirmationPassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click the update password button at edit profile student page")
    public void userClickTheUpdatePasswordButtonAtEditProfileStudentPage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtnupdatepassword();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User will get the pop up messages update password")
    public void userWillGetThePopUpMessagesSuccses() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setVerifikasipopupupdatepassword());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("user click button popup message update password")
    public void userClickButtonPopupMessageUpdatePassword() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtnpopupupdatepassword();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @And("user already in homepage musiclab")
    public void userAlreadyInHomepageMusiclab() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setVerifikasibacktohomepage());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @And("user logout account")
    public void userLogoutAccount()  {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtnlogout();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User will get the pop up messages succes logout")
    public void userWillGetThePopUpMessagesSuccesLogout()  {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setverifikasipopupsuccseslogut());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click pop up succes logout button")
    public void userClickPopUpSuccesLogoutButton() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtnpopupsuccseslogout();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @And("User Already on edit profile page before click logout button")
    public void userAlreadyOnEditProfilePageAfterClickLogoutButton()  {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        Assert.assertTrue(editProfileStudentPage.setverifikasipagebeforelogout());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User input {string}, select {string}, and input {string}")
    public void userInputSelectAndInput(String oldpass, String newpass, String confirpass) {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setInputoldpassword(oldpass);
        editProfileStudentPage.setInputnewpassword(newpass);
        editProfileStudentPage.setInputconfirmationpassword(confirpass);
    }

    @And("User edit foto profile")
    public void userEditFotoProfile() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtneditfotoprofile();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User input {string}, select {string}, input {string}, input {string} and input {string}")
    public void userInputSelectInputInputAndInput(String namalgkap, String jeniskelamin, String nomorHP, String mail, String Alamat) {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setInputNamalengkap(namalgkap);
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        editProfileStudentPage.setInputJenisKelamin(jeniskelamin);
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        editProfileStudentPage.setInputNoHP(nomorHP);
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        editProfileStudentPage.setInputnewemail(mail);
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        editProfileStudentPage.setInputalamat(Alamat);
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}


