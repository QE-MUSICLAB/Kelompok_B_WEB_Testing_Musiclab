package step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.EditProfileStudentPage;
import org.example.pageObject.StudentSchedulePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StudentScheduleSteps {
    public WebDriver webDriver;

    public StudentScheduleSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click jadwal button")
    public void userclickjadwalbutton(){
        StudentSchedulePage studentSchedulePage = new StudentSchedulePage(webDriver);
        studentSchedulePage.setClickbtnjadwal();
        webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @And("User Already jadwal page")
    public void userAlreadyJadwalPage()  {
        StudentSchedulePage studentSchedulePage = new StudentSchedulePage(webDriver);
        Assert.assertTrue(studentSchedulePage.setalreadyjadwalpage());
        webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

    }

    @When("User click kembali button")
    public void userClickKembaliButton() {
        StudentSchedulePage studentSchedulePage = new StudentSchedulePage(webDriver);
        studentSchedulePage.setClickbtnkembali();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User direct to profile page")
    public void userDirectToProfilePage() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setUseralreadyprofilepage();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User logout")
    public void userLogout() {
        StudentSchedulePage studentSchedulePage = new StudentSchedulePage(webDriver);
        studentSchedulePage.setBtnlogout();
        webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
}
