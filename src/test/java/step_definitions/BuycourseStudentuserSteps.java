package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.BuycourseStudentuserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BuycourseStudentuserSteps {
    public WebDriver webDriver;

    public BuycourseStudentuserSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("user clicks find mentor button")
    public void userclickfindmentorbutton(){
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setClickbuttonfindmentor();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("user already in find mentor page")
    public void userAlreadyInFindMentorPage() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        Assert.assertTrue(buycourseStudentuserPage.setalreadyfindmentorpage());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user selects favorite mentor with name {string}")
    public void userSelectsFavoriteMentorWithName(String nameMentor) {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setShearcmentorfavorite(nameMentor);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("the user clicks on the desired mentor")
    public void theUserClicksOnTheDesiredMentor() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setClickbtnmentorfavorite();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("The user selects the desired course")
    public void theUserSelectsTheDesiredCourse() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setClickcoursestudent();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("user is already on the training shopping page")
    public void userIsAlreadyOnTheTrainingShoppingPage() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        Assert.assertTrue(buycourseStudentuserPage.setverifikasicoursepage());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("User click beli kursus button")
    public void userClickBeliKursusButton() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setClickbtnbelikursus();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User already in checkout page")
    public void userAlreadyInCheckoutPage() throws InterruptedException {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        Thread.sleep(8000);
        Assert.assertTrue(buycourseStudentuserPage.setverifikasicheckoutpage());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @And("User already on course mentor page")
    public void userAlreadyOnCourseMentorPage() throws InterruptedException {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        Thread.sleep(8000);
        Assert.assertTrue(buycourseStudentuserPage.setverifikasicoursementorpage());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When("User input {string} as check availibility, and {string} as pilih hari to make payment")
    public void userInputAsCheckAvailibilityAndAsPilihHariToMakePayment(String tanggal, String plihanhari) {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setInputcheckavaibility(tanggal);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        buycourseStudentuserPage.setSelectrole(plihanhari);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("user click check visibiliti button")
    public void userClickCheckVisibilitiButton() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setBtnchekcavaibility();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("will bring up a success pop up")
    public void willBringUpASuccessPopUp() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        Assert.assertTrue(buycourseStudentuserPage.setverifikasipopupavisibility());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user click oke")
    public void userClickOke() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setClickokepopupavisibility();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @And("user click to payment button")
    public void userClickToPaymentButton() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        buycourseStudentuserPage.setClickbtnpayment();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User Already on pop up message payment")
    public void userAlreadyOnPopUpMessagePayment() {
        BuycourseStudentuserPage buycourseStudentuserPage = new BuycourseStudentuserPage(webDriver);
        Assert.assertTrue(buycourseStudentuserPage.setverfikasipopuppayment());
    }
}
