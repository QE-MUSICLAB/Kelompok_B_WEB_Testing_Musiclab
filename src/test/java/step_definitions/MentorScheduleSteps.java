package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.MentorSchedulePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MentorScheduleSteps {
    public WebDriver webDriver;

    public MentorScheduleSteps(){
        super();
        this.webDriver = Hooks.webDriver;


    }
    @Then("User click arrow button at lihat jadwal")
    public void userClickArrowButtonAtLihatJadwal() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.clickArrowButton();
    }

    @And("User will see their schedule")
    public void userWillSeeTheirSchedule() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        Assert.assertTrue(mentorSchedulePage.verifyJadwalMentor());
    }

    @And("User click one x button to delete their schedule")
    public void userClickOneXButtonToDeleteTheirSchedule() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.clickDeleteJadwal();

    }

    @Then("User click button jadwal saya")
    public void userClickButtonJadwalSaya() throws InterruptedException {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.clickJadwalSayaButton();
        Thread.sleep(5000);
    }

    @And("User will see history mengajar")
    public void userWillSeeHistoryMengajar() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
       mentorSchedulePage.verifyJadwalHistory();
    }

    @And("User click back kembali button")
    public void userClickBackKembaliButton() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.clickBackButton();
    }

    @And("User back to profile page")
    public void userBackToProfilePage() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        Assert.assertTrue(mentorSchedulePage.verifyProfileMentorPage());
    }

    @And("User click arrow button on tambah jadwal")
    public void userClickArrowButtonOnTambahJadwal() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.clickTambahJadwalSaya();
    }

    @And("User input {string} as day,{string} as star time, and {string} as end time")
    public void userInputAsDayAsStarTimeAndAsEndTime(String day, String startime, String endtime) {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.setPilihHari(day);
        mentorSchedulePage.setStartHour(startime);
        mentorSchedulePage.setEndHour(endtime);
    }

    @And("User click the Upload Jadwal button")
    public void userClickTheUploadJadwalButton() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        mentorSchedulePage.clickuploadButton();
    }

    @Then("User will get the pop up message success post a schedule")
    public void userWillGetThePopUpMessageSuccessPostASchedule() {
        MentorSchedulePage mentorSchedulePage = new MentorSchedulePage(webDriver);
        Assert.assertTrue(mentorSchedulePage.verifyPopUpSuccessSchedule());
    }

}
