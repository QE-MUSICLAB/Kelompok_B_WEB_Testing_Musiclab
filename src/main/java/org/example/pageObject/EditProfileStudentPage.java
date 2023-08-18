package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditProfileStudentPage {

    public static WebDriver driver;

    public EditProfileStudentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class='w-full h-[45rem] flex flex-col items-center justify-center']")
    private WebElement homepage;

    @FindBy(css= "[href='/login']")
    private WebElement clicklogin;

    @FindBy(xpath = "//div[@class='flex flex-col  flex-1 w-full h-auto justify-center items-center text-6xl font-bold text-white']")
    private WebElement verifikasiloginpage;

    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement userName;

    @FindBy(css = ".swal2-html-container")
    private WebElement verifikasiloginsucces;
    @FindBy(css = ".swal2-confirm")
    private WebElement clickbuttonsucces;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement Role;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement btnloginsukses;

    @FindBy(xpath = "//div[@class='w-full h-[45rem] flex flex-col items-center justify-center']")
    private WebElement directtohomepage;

    @FindBy(xpath = "//a[.='Profile']")
    private WebElement clicktbtnprofile;

    @FindBy(xpath = "//div[@class='w-full min-h-screen']")
    private WebElement alreadystudentprofilepage;

    @FindBy(css = ".text-black.text-md")
    private WebElement clickbtneditprofile;
    @FindBy(xpath = "//div[@class='flex-1 flex-col ']")
    private WebElement verifikasieditprofilepage;
    @FindBy(xpath = "//input[@id='input-file']")
    private WebElement clickbtneditpoto;
    @FindBy(xpath = "//input[@id='input-oldpassword']")
    private WebElement inputoldpassword;
    @FindBy(xpath = "//input[@id='input-newpasword']")
    private WebElement inputnewpassword;
    @FindBy(xpath = "//input[@id='input-confirmpassword']")
    private WebElement inputconfirmationpassword;

    @FindBy(xpath = "//input[@id='input-namalengkap']")
    private WebElement inputNamalengkap;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement inputJenisKelamin;
    @FindBy(xpath = "//input[@id='input-telepon']")
    private WebElement inputNoHP;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputnewemail;
    @FindBy(xpath = "//textarea[@id='input-address']")
    private WebElement inputalamat;
    @FindBy(xpath = "//button[@id='btn-Update']")
    private WebElement clickbtnupdate;
    @FindBy(xpath = "//div[@class='swal2-popup swal2-modal animate__animated animate__fadeIn animate__faster']")
    private WebElement popupupdatesuccses;

    public boolean setHomepage(){
        return homepage.isDisplayed();
    }


    public void clicklogin(){
        clicklogin.click();
    }
    public void clickbtnloginsucces(){
        clickbuttonsucces.click();
    }
    public void setUserName(String urName){
        userName.sendKeys(urName);
    }
    public void setPassword(String Password){
        password.sendKeys(Password);
    }
    public void setRole(String role){
        Select rule = new Select(Role);
        Role.click();
        rule.selectByVisibleText(role);
    }
    public void clickloginsukses(){
        btnloginsukses.click();
    }
    public boolean verifyloginpage(){
        return verifikasiloginpage.isDisplayed();
    }
    public boolean setVerifikasiloginsucces(){
        return verifikasiloginsucces.isDisplayed();
    }
    public boolean setVerifikasidirecttohomepage(){
        return directtohomepage.isDisplayed();
    }
    public void setClicktbtnprofile(){
        clicktbtnprofile.click();
    }
    public boolean setUseralreadyprofilepage(){
        return alreadystudentprofilepage.isDisplayed();
    }
    public void setClickbtneditprofile(){
        clickbtneditprofile.click();
    }
    public boolean setverifikasieditprofilepage(){
        return verifikasieditprofilepage.isDisplayed();
    }
    public void setClickbtneditpoto(){
        clickbtneditpoto.click();
    }
    public void setInputoldpassword(String InputOldpassword){
        inputoldpassword.sendKeys(InputOldpassword);
    }
    public void setInputnewpassword(String InputnewPassword){
        inputnewpassword.sendKeys(InputnewPassword);
    }
    public void setInputconfirmationpassword(String InputConfirmationPassword){
        inputconfirmationpassword.sendKeys(InputConfirmationPassword);
    }
    public void setInputNamalengkap(String InputNamaLengkap){
        inputNamalengkap.sendKeys(InputNamaLengkap);
    }
    public void setInputJenisKelamin(String Jeniskelamin){
        Select jeniskelamin = new Select(inputJenisKelamin);
        inputJenisKelamin.click();
        jeniskelamin.selectByVisibleText(Jeniskelamin);
    }
    public void setInputNoHP(String INputnomorHP){
        inputNoHP.sendKeys(INputnomorHP);
    }
    public void setInputnewemail(String InputNewemail){
        inputnewemail.sendKeys(InputNewemail);
    }
    public void setInputalamat(String alamat){
        inputalamat.sendKeys(alamat);
    }
    public void setClickbtnupdate(){
        clickbtnupdate.click();
    }
    public boolean setverifikasipopupupdatesukses(){
        return popupupdatesuccses.isDisplayed();
    }
}
