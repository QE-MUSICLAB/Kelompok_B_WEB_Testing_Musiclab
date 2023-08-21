package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.SeeSchedulePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SeeScheduleSteps {
    public WebDriver webDriver;

    public SeeScheduleSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User will direct to profile page")
    public void userWillDirectToProfilePage() {
        SeeSchedulePage seeSchedulePage = new SeeSchedulePage(webDriver);
        Assert.assertTrue(seeSchedulePage.setVerfiyProfile());
    }

    @And("User click jadwal button")
    public void userClickJadwalButton() {
        SeeSchedulePage seeSchedulePage = new SeeSchedulePage(webDriver);
        seeSchedulePage.setJadwalButton();
    }

    @Then("User will direct to history belajar page")
    public void userWillDirectToHistoryBelajarPage() {
        SeeSchedulePage seeSchedulePage = new SeeSchedulePage(webDriver);
        Assert.assertTrue(seeSchedulePage.setVerifyHistoryBelajar());
    }
}
