package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {
    public static WebDriver driver;
    public ChatPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "btn-findmentor")
    private WebElement clickbtnfindmentor;
    @FindBy(css = ".container")
    public WebElement useralreadyfindmentorpage;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement usersearchementor;
    @FindBy(css = "[src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    public WebElement clickmentorselected;
    @FindBy(css = ".container")
    public WebElement useralreadypagementor;
    @FindBy(css = ".px-16")
    public WebElement clicklihatchatbutton;
    @FindBy(id = "send")
    public WebElement sendchatmentor;
    @FindBy(xpath = "//button[@class='btn w-28 rounded-xl text-white']")
    public WebElement clicksendchatmentor;
    @FindBy(xpath = "//label[@class='btn']")
    public WebElement clickclosebutton;
    @FindBy(xpath = "//ul[@class='menu menu-horizontal px-1 lg:flex hidden']//a[.='Logout']")
    public WebElement userclicklogoutonmentorpage;
    @FindBy(xpath = "//a[.='Chat']")
    public WebElement clickbuttonchatstudent;
    @FindBy(xpath = "//div[@class='flex flex-row']")
    public WebElement verifikasipagementorchatstudent;
    @FindBy(xpath = "//label[@class='btn font-semibold']")
    public WebElement clickbtnseemessagestudent;
    @FindBy(css = "svg")
    public WebElement clickbtnbackpage;

    public void setClickbtnfindmentor(){
        clickbtnfindmentor.click();
    }
    public void setClickmentorselected(){
        clickmentorselected.click();
    }
    public void setClicklihatchatbutton(){
        clicklihatchatbutton.click();
    }
    public void setClicksendchatmentor(){
        clicksendchatmentor.click();
    }
    public void setClickclosebutton(){
        clickclosebutton.click();
    }
    public void setClickbuttonchatstudent(){
        clickbuttonchatstudent.click();
    }
    public void setUserclicklogoutonmentorpage(){
        userclicklogoutonmentorpage.click();
    }
    public void setClickbtnseemessagestudent(){
        clickbtnseemessagestudent.click();
    }
    public void setClickbtnbackpage(){
        clickbtnbackpage.click();
    }
    public boolean setUseralreadyfindmentorpage(){
        return useralreadyfindmentorpage.isDisplayed();
    }
    public boolean setUseralreadypagementor(){
        return useralreadypagementor.isDisplayed();
    }
    public boolean setuserverifikasipagementorchatstudent(){
        return verifikasipagementorchatstudent.isDisplayed();
    }
    public void setUsersearchementor(String namamentor){
        usersearchementor.sendKeys(namamentor);
    }
    public void setSendchatmentor(String Chatmentor){
        sendchatmentor.sendKeys(Chatmentor);
    }

}
