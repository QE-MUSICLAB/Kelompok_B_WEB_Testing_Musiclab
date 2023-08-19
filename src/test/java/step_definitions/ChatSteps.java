package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.ChatPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChatSteps {
    public WebDriver webDriver;

    public ChatSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click find mentor button")
    public void userclickfindmentorbutton (){
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClickbtnfindmentor();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user already on page find mentor")
    public void userAlreadyOnPageFindMentor() {
        ChatPage chatPage = new ChatPage(webDriver);
        Assert.assertTrue(chatPage.setUseralreadyfindmentorpage());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user searches for a mentor in the search option by selecting {string} as a mentor")
    public void userSearchesForAMentorInTheSearchOptionBySelectingWahidSitorusAsAMentor(String namaMentor) {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setUsersearchementor(namaMentor);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user clicks on the selected mentor")
    public void userClicksOnTheSelectedMentor() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClickmentorselected();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user already in mentor page")
    public void userAlreadyInMentorPage() {
        ChatPage chatPage = new ChatPage(webDriver);
        Assert.assertTrue(chatPage.setUseralreadypagementor());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user click lihat chat button")
    public void userClickLihatChatButton() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClicklihatchatbutton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user writes message for mentor with word {string}")
    public void userWritesMessageForMentorWithWord(String chatmentor) {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setSendchatmentor(chatmentor);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user click send chat mentor after create value")
    public void userClickSendChatMentorAfterCreateValue() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClicksendchatmentor();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user click close button")
    public void userClickCloseButton() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClickclosebutton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("user logs out of the mentor page")
    public void userLogsOutOfTheMentorPage() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setUserclicklogoutonmentorpage();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
// chat student dari mentor
    @When("user clicks the chat button")
    public void userClicksTheChatButton() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClickbuttonchatstudent();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user already in page mentor chat students")
    public void userAlreadyInPageMentorChatStudents() {
        ChatPage chatPage = new ChatPage(webDriver);
        Assert.assertTrue(chatPage.setuserverifikasipagementorchatstudent());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click see message student")
    public void userClickSeeMessageStudent() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClickbtnseemessagestudent();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user writes message for student with word {string}")
    public void userWritesMessageForStudentWithWord(String chatstudent) {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setSendchatmentor(chatstudent);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user click back page button")
    public void userClickBackPageButton() {
        ChatPage chatPage = new ChatPage(webDriver);
        chatPage.setClickbtnbackpage();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
