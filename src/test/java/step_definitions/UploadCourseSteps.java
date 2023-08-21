package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.UploadCoursePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UploadCourseSteps {
    public WebDriver webDriver;

    public UploadCourseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click kursus saya button")
    public void userClickKursusSayaButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setKursusSayaButton();
    }

    @Then("User will direct to kursus saya page")
    public void userWillDirectToKursusSayaPage() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(uploadCoursePage.setVerifyKursusSayaPage());
    }

    @And("User click upload new course button")
    public void userClickUploadNewCourseButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setUploadNewCourseButton();
    }

    @Then("User will direct to upload course page")
    public void userWillDirectToUploadCoursePage() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        Assert.assertTrue(uploadCoursePage.setVerifyUploadCoursePage());
    }

    @And("User upload file on choose file field")
    public void userUploadFileOnChooseFileField() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setInputFile();
    }


    @And("User input {string} as judulkursus, and select {string} as level, and input {string} as deskripsikhusus,and input {string} as apayangdipelajari, and input {string} as prasyaratkhusus, and input {string} as untuksiapakursusini, and input {string} as hargakursus,and input {string} as duration")
    public void userInputAsJudulkursusAndSelectAsLevelAndInputAsDeskripsikhususAndInputAsApayangdipelajariAndInputAsPrasyaratkhususAndInputAsUntuksiapakursusiniAndInputAsHargakursusAndInputAsDuration(String judulKursus, String level, String deskripsiKhusus, String apaYangDipelajari, String prasyaratKhusus, String untukSiapaKursusIni, String hargaKursus, String duration) {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setJudulKursus(judulKursus);
        uploadCoursePage.setPilihLevel(level);
        uploadCoursePage.setDeskripsi(deskripsiKhusus);
        uploadCoursePage.setApaYgDipelajari(apaYangDipelajari);
        uploadCoursePage.setPraSyarat(prasyaratKhusus);
        uploadCoursePage.setUntukSiapa(untukSiapaKursusIni);
        uploadCoursePage.setHarga(hargaKursus);
        uploadCoursePage.setDurasi(duration);
    }

    @And("User click the Upload Kursus button")
    public void userClickTheUploadKursusButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setUploadButton();
    }

    @Then("User will get the pop up messages success post a course")
    public void userWillGetThePopUpMessagesSuccessPostACourse() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.verifySuccessPopUp();
    }

    @Then("User will get the pop up messages failed post a course")
    public void userWillGetThePopUpMessagesFailedPostACourse() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.verifyFailedPopUp();

    }

    @And("User click OK button")
    public void userClickOKButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setOkFailedButton();
    }

    @And("User click edit course button")
    public void userClickEditCourseButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setEditButton();
    }

    @Then("User will direct to update course page")
    public void userWillDirectToUpdateCoursePage() throws InterruptedException {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        Thread.sleep(8000);
        Assert.assertTrue(uploadCoursePage.setVerifyUpdateCoursePage());
    }

    @And("User clear all field data")
    public void userClearAllFieldData() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        uploadCoursePage.clearField();
    }

    @And("User click the Update Kursus button")
    public void userClickTheUpdateKursusButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setUpdateButton();
    }

    @Then("User will get the pop up messages success update a course")
    public void userWillGetThePopUpMessagesSuccessUpdateACourse() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        Assert.assertTrue(uploadCoursePage.verifySuccessPopUp());
    }

    @Then("User will get the pop up messages failed update a course")
    public void userWillGetThePopUpMessagesFailedUpdateACourse() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        Assert.assertTrue(uploadCoursePage.verifyFailedPopUp());
    }

    @And("User click delete course button")
    public void userClickDeleteCourseButton() {
        UploadCoursePage uploadCoursePage = new UploadCoursePage(webDriver);
        uploadCoursePage.setDeleteButton();
    }
}
