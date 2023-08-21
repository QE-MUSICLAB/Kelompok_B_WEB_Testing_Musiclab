package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    public static WebDriver driver;
    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-findmentor']")
    private WebElement verifyLandingPage;
    @FindBy(xpath = "//a[.='Login']")
    private WebElement loginMenuButton;
    @FindBy(css = "[href='/register']")
    private WebElement registerButton;
    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement verifyLandingLoginPage;
    @FindBy(xpath = "//button[@id='btn-register']")
    private WebElement verifyRegisterPage;
    @FindBy(css = "#input-namalengkap")
    private WebElement namaLengkap;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectRole;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement loginEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(xpath = "//button[@id='btn-register']")
    private WebElement buttonRegister;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement popUpSuccess;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement alreadyHave;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement error;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement successPopUpRegister;



    public boolean verifyLandingPage(){
        return verifyLandingPage.isDisplayed();
    }
    public void clickLoginMenuButton(){
        loginMenuButton.click();
    }
    public boolean verifyLandingLoginPage(){
        return verifyLandingLoginPage.isDisplayed();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
    public boolean verifyRegisterLoginPage(){
        return verifyRegisterPage.isDisplayed();
    }
    public void setNamaLengkap(String nama) {
        namaLengkap.sendKeys(nama);
    }
    public void setSelectRole(String role){
        Select a = new Select(selectRole);
        selectRole.click();
        a.selectByVisibleText(role);
    }
    public void setRegisterEmail(String registerEmail){
        loginEmail.sendKeys(registerEmail);
    }
    public void setPassword(String psd){
        password.sendKeys(psd);
    }
    public void clickButtonRegister(){
        buttonRegister.click();
    }
    public boolean verifyPopUpSuccessMessage(){
        return popUpSuccess.isDisplayed();
    }
    public boolean verifyPopUpSuccessMessageAlready(){
        return alreadyHave.isDisplayed();
    }
    public boolean verifyPopUpError(){
        return error.isDisplayed();
    }
    public boolean verifySuccessPopUpRegister(){
        return successPopUpRegister.isDisplayed();
    }


}
