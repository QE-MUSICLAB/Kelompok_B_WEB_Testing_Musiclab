package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.example.pageObject.DeleteAccountPage;
import org.example.pageObject.EditMentorProfilePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EditMentorSteps {
    public WebDriver webDriver;

    public EditMentorSteps(){
        super();
        this.webDriver = Hooks.webDriver;


    }
    @And("User click edit profile button")
    public void userClickEditProfileButton() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        editMentorProfilePage.clickEditProfileButton();
    }

    @And("User will input {string} as namaLengkap, input {string} as deskripsi select {string} as jenisKelamin, {string} as noHp, input {string} asemail, input {string} as instagram account link, and input {string} as alamat")
    public void userWillInputAsNamaLengkapInputAsDeskripsiSelectAsJenisKelaminAsNoHpInputAsemailInputAsInstagramAccountLinkAndInputAsAlamat(String nama, String deskripsi, String jenisKelamin, String noHp, String email, String instagram, String alamat) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        editMentorProfilePage.setNama(nama);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setDeskripsi(deskripsi);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setSelectJenisKelamin(jenisKelamin);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setdNoHP(noHp);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setEmail(email);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setInstagram(instagram);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setAlamat(alamat);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @When("User click update button")
    public void userClickUpdateButton() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        editMentorProfilePage.clickButtonUpdate();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User will get the pop up message success update mentor profile")
    public void userWillGetThePopUpMessage() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpUpdateMentor());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User clear all data field")
    public void userClearAllDataField() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        editMentorProfilePage.clearField();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

//    @Then("User will get the pop up message Please Fill The Form with Correct Format")
//    public void UserWillGetThePopUpMessageTitlePleaseFillTheFormWithCorrectFormat() throws InterruptedException {
//        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
////        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        Thread.sleep(5000);
//        Assert.assertTrue(editMentorProfilePage.verifyPopUpFailedUpdate());
//    }
    @And("User will get the pop up message Please Fill The Form with Correct Format")
    public void userWillGetThePopUpMessagePleaseFillTheFormWithCorrectFormat() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpFailedUpdate());
    }

    @And("User select {string} as instrument")
    public void userSelectAsInstrument(String instrument) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setSelectInstrument(instrument);
    }

    @When("User click update instument button")
    public void userClickUpdateInstumentButton() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickinstrumentButton();
    }

    @And("User will get the pop up message success add mentor instrument")
    public void userWillGetThePopUpMessageSuccessAddMentorInstrument() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpUpdateInstrument());
    }

    @And("User click ok on pop up message")
    public void userClickOkOnPopUpMessage() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickOkButtonInstrument();
    }

    @And("User will get the pop up message Failed")
    public void userWillGetThePopUpMessageFailed() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpFailedUpdateInstrument());
    }

    @And("User click ok on pop up message Failed")
    public void userClickOkOnPopUpMessageFailed() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickPopUpButtonFailedInstrument();
    }

    @And("User select {string} as genre")
    public void userSelectAsGenre(String Genre) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setselectGenre(Genre);
    }

    @When("User click update genre button")
    public void userClickUpdateGenreButton() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickButtonGenre();

    }

    @And("User will get the pop up message success add mentor genre")
    public void userWillGetThePopUpMessageSuccessAddMentorGenre() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifypopUpSuccessGenre());
    }

    @And("User input {string} as old password, input {string} as new password and input {string} as confirmation password")
    public void userInputAsOldPasswordInputAsNewPasswordAndInputAsConfirmationPassword(String oldpassword, String newpassword, String confirmpassword) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setInputPass(oldpassword, newpassword, confirmpassword);

    }

    @When("User click update password button")
    public void userClickUpdatePasswordButton() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickUpdateButtonPassword();
    }

    @And("User will see pop up message Password Succesfully Updated")
    public void userWillSeePopUpMessagePasswordSuccesfullyUpdated() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpSuccessUpdatePass());
    }

    @And("User click ok on pop up message Password Succesfully Updated")
    public void userClickOkOnPopUpMessagePasswordSuccesfullyUpdated() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickOkButtonUpdatePass();
    }

    @And("User will see pop up message Please Fill with Incorrect Format")
    public void userWillSeePopUpMessagePleaseFillWithIncorrectFormat() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifypopUpFailedUpdatePass());
    }

    @And("User click ok on pop up message Password Please Fill with Incorrect Format")
    public void userClickOkOnPopUpMessagePasswordPleaseFillWithIncorrectFormat() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickOkButtonFailedUpdatePasss();
    }
    @And("User select {string} as Tipe Sertifikat, input {string} as nama sertifikat, choose a file under {string}")
    public void userSelectAsTipeSertifikatInputAsNamaSertifikatChooseAFileUnderKb(String tipeSertifikat, String namaSertifikat,String file) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setSelectTipeSertifikat(tipeSertifikat);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setFieldNamaSertifikat(namaSertifikat);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.uploadCertificateMentor();
    }


    @When("User click the upload sertifikat button")
    public void userClickTheUploadSertifikatButton() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickButtonUpdateSertifikat();

    }
    @And("User click ok on pop up message {string}")
    public void userClickOkOnPopUpMessage(String arg0) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickOkButtonUpdatePass();
    }

    @And("User select {string} as Tipe Sertifikat, User don't select nama sertifikat, choose a file under {string}")
    public void userSelectAsTipeSertifikatUserDonTSelectNamaSertifikatChooseAFileUnder(String tipeSertifikat, String file) {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.setSelectTipeSertifikat(tipeSertifikat);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.uploadCertificateMentor();

    }

    @And("User clear all data")
    public void userClearAllData() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clearField();
    }


    @And("User click choose profile picture file")
    public void userClickChooseProfilePictureFile() throws InterruptedException {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        Thread.sleep(8000);
        editMentorProfilePage.uploadProfilePicture();
        Thread.sleep(8000);
    }

    @And("User click ok on pop up message Please Fill The Form with Correct Format")
    public void userClickOkOnPopUpMessagePleaseFillTheFormWithCorrectFormat() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickOkButtonUpdatePass();
    }

    @And("User click ok on pop up message success update mentor password")
    public void userClickOkOnPopUpMessageSuccessUpdateMentorPassword() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        editMentorProfilePage.clickOkButtonUpdatePass();
    }

    @And("User will get the pop up message title Please Fill The Form with Correct Format")
    public void userWillGetThePopUpMessageTitlePleaseFillTheFormWithCorrectFormat() {
    }

    @And("User will get the pop up message error bind data")
    public void userWillGetThePopUpMessageErrorBindData() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpFailedUpdateInstrument());
    }

    @And("User click ok on pop up message error bind data")
    public void userClickOkOnPopUpMessageErrorBindData() {
        EditMentorProfilePage editMentorProfilePage = new EditMentorProfilePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(editMentorProfilePage.verifyPopUpFailedUpdateInstrument());
    }
}
