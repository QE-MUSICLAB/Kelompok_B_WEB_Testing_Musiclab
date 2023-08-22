package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.EditProfileStudentPage;
import org.example.pageObject.MyCourseMentorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyCourseMentorSteps {
    public WebDriver webDriver;

    public MyCourseMentorSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User click kursuss saya button")
    public void userclickkurussayabutton(){
        MyCourseMentorPage myCourseMentorPage = new MyCourseMentorPage(webDriver);
        myCourseMentorPage.setClickbtnkursussaya();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User already on kursus saya mentor page")
    public void userAlreadyOnKursusSayaMentorPage(){
        MyCourseMentorPage myCourseMentorPage = new MyCourseMentorPage(webDriver);
        Assert.assertTrue(myCourseMentorPage.verifykursussayapage());
        webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
    @When("user mentor logout")
    public void userMentorLogout() {
        EditProfileStudentPage editProfileStudentPage = new EditProfileStudentPage(webDriver);
        editProfileStudentPage.setClickbtnlogout();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @And("User back to home profile click kembali button")
    public void userBackToHomeProfileClickKembaliButton() {
        MyCourseMentorPage myCourseMentorPage = new MyCourseMentorPage(webDriver);
        myCourseMentorPage.setClickbtnback();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
