package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.EditProfileStudentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditProfileStudentSteps{

    public WebDriver webDriver;
    public EditProfileStudentSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
    @Given("User already on login page")
    public void verifyloginPage(){
        Assert.assertTrue(editProfileStudentPage.verifyloginpage());
    }


    @And("User click login menu on musiclab website")
    public void userClickLoginMenuOnMusiclabWebsite() {
        editProfileStudentPage.clicklogin();

    }

    @Then("User already on login page musiclab web")
    public void userAlreadyOnLoginPageMusiclabWeb() {
        editProfileStudentPage.verifyloginpage();
    }

    @And("User input {string} as email,input {string} as password and select {string} as role")
    public void userInputAsEmailInputAsPasswordAndSelectAsRole(String urname, String password, String role) {
        editProfileStudentPage.setUserName(urname);
        editProfileStudentPage.setPassword(password);
        editProfileStudentPage.setRole(role);
    }

    @And("User click the login button")
    public void userClickTheLoginButton() {
        editProfileStudentPage.clickloginsukses();
    }

    @Then("User will get the pop up  message login succes")
    public void userWillGetThePopUpMessage(){
        Assert.assertTrue(editProfileStudentPage.setVerifikasiloginsucces());
    }

    @And("User will direct to  homepage")
    public void userWillDirectToHomepage() {
        Assert.assertTrue(editProfileStudentPage.setVerifikasidirecttohomepage());
    }

    @And("User click the profile menu on hompage")
    public void userClickTheProfileMenuOnHompage() {
        editProfileStudentPage.setClicktbtnprofile();
    }

    @And("User already in profile student page")
    public void userAlreadyInProfileStudentPage() {
        editProfileStudentPage.setUseralreadyprofilepage();
    }

    @And("User click the edit profile button at profile student page")
    public void userClickTheEditProfileButtonAtProfileStudentPage() {
        editProfileStudentPage.setClickbtneditprofile();
    }

    @And("User Already in edit profile student page")
    public void userAlreadyInEditProfileStudentPage() {
        Assert.assertTrue(editProfileStudentPage.setverifikasieditprofilepage());
    }

    @And("User edit photo profile")
    public void userEditPhotoProfile() {
        editProfileStudentPage.setClickbtneditpoto();
    }

    @And("the selected photo file has become a profile photo")
    public void theSelectedPhotoFileHasBecomeAProfilePhoto() {
    }

    @When("User input {string} as namalengkap, select {string} as jeniskelamin, input {string} as phone, input {string} as email and input {string} as alamat")
    public void userInputAsNamaLengkapSelectAsJenisKelaminInputAsPhoneInputAsEmailAndInputAsAlamat(String namaLengkap, String JenisKelamin, String NoHP, String Email, String Alamat) {
        editProfileStudentPage.setInputNamalengkap(namaLengkap);
        editProfileStudentPage.setInputJenisKelamin(JenisKelamin);
        editProfileStudentPage.setInputNoHP(NoHP);
        editProfileStudentPage.setInputnewemail(Email);
        editProfileStudentPage.setInputalamat(Alamat);
    }

    @And("User click the update button at edit profile student page")
    public void userClickTheUpdateButtonAtEditProfileStudentPage() {
        editProfileStudentPage.setClickbtnupdate();
    }

    @Then("User will get the pop up messages")
    public void userWillGetThePopUpMessages() {
        Assert.assertTrue(editProfileStudentPage.setverifikasipopupupdatesukses());
    }
}
