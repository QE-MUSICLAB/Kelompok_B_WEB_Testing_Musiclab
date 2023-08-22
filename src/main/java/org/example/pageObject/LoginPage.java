package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement loginButton;
    @FindBy(css = ".swal2-html-container")
    private WebElement loginPopUpSuccess;
    @FindBy(xpath = "//a[.='Profile']")
    private WebElement profileButton;
    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement loginEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectRole;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement dataNotFoundPopUp;


    public void clickLoginButton(){
        loginButton.click();
    }
    public boolean verifyLoginPagePopUp(){
        return loginPopUpSuccess.isDisplayed();
    }
    public boolean verifyHomePage(){
        return profileButton.isDisplayed();
    }
    public void setRegisterEmail(String registerEmail){
        loginEmail.sendKeys(registerEmail);
    }
    public void setPassword(String psd){
        password.sendKeys(psd);
    }
    public void setSelectRole(String role){
        Select a = new Select(selectRole);
        selectRole.click();
        a.selectByVisibleText(role);
    }
    public boolean verifyFailedLogin(){
        return dataNotFoundPopUp.isDisplayed();
    }




}
