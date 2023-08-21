package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditMentorProfilePage {
    public static WebDriver driver;
    public EditMentorProfilePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-editTeacher']")
    private WebElement editProfileButton;
    @FindBy(xpath = "//input[@class='input input-bordered w-10/12 lg:w-9/12 bg-bg-input border-slate-300 text-black font-semibold font-poppins bg-white']")
    private WebElement namaLengkapField;
    @FindBy(xpath = "//textarea[@id='input-deskripsi']")
    private WebElement deskripsiField;
    @FindBy(xpath = "//select[@id='select-jeniskelamin']")
    private WebElement jenisKelaminField;
    @FindBy(xpath = "//input[@id='input-telepon']")
    private WebElement noHpField;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='input-socialmedia-instagram']")
    private WebElement InstagramAccountField;
    @FindBy(xpath = "//textarea[@id='input-address']")
    private WebElement alamatField;
    @FindBy(xpath = "//button[@id='btn-Update']")
    private WebElement updateButton;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement verifyPopUpUpdateMentor;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement verifyPopUpFailedMentor;
    @FindBy (xpath = "//select[2]")
    private WebElement selectInstrument;
    @FindBy (xpath = "//button[@id='btn-submitinstrument']")
    private WebElement instrumentButton;
    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement popUpUpdateInstrument;
    @FindBy (xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpSuccessInstrument;
    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement popUpFailedInstrument;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement popUpButtonFailedInstrument;
    @FindBy (xpath = "//select[3]")
    private WebElement selectGenre;
    @FindBy (xpath = "//button[.='Update Genres']")
    private WebElement buttonGenre;
    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessGenre;
    @FindBy (xpath = "//input[@id='input-oldpassword']")
    private WebElement inputOldPassword;
    @FindBy (xpath = "//input[@id='input-newpassword']")
    private WebElement inputNewPassword;
    @FindBy (xpath = "//input[@id='input-confirmpassword']")
    private WebElement inputConfirmPassword;
    @FindBy (xpath = "//button[.='Update Password']")
    private WebElement updateButtonPassword;
    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement popUpSuccessUpdatePass;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okButtonUpdatePass;
    @FindBy (xpath = "//h2[@class='swal2-title']")
    private WebElement popUpFailedUpdatePass;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okButtonFailedUpdatePass;
    @FindBy (xpath = "//input[@class='file-input h-10 w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto mt-5 border-none']")
    private WebElement buttonChooseFileCertificate;
    public static String dir = System.getProperty("user.dir");
    @FindBy (xpath = "//button[@id='btn-uploadsertifikat']")
    private WebElement buttonUpdateSertifikat;
    @FindBy (xpath = "//select[@id='select-role']")
    private WebElement selectTipeSertifikat;
    @FindBy (xpath = "//input[@class='input input-bordered   border-slate-300  w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto  text-black font-semibold font-poppins']")
    private WebElement namaSertifikatField;
    @FindBy (xpath = "//input[@class='file-input h-10 w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto mt-5 border-none']")
    private WebElement chooseButton;


    public void clickEditProfileButton() {
        editProfileButton.click();
    }

        public void setNama (String nama) {
        namaLengkapField.clear();
        namaLengkapField.sendKeys(nama);
    }
    public void setDeskripsi (String deskripsi) {
        deskripsiField.clear();
        deskripsiField.sendKeys(deskripsi);
    }
    public void setSelectJenisKelamin (String jenisKelamin) {
        Select a = new Select(jenisKelaminField);
        a.selectByVisibleText(jenisKelamin);
    }
    public void setdNoHP (String noHP) {
        noHpField.clear();
        noHpField.sendKeys(noHP);
    }
    public void setEmail (String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void setInstagram (String instagram) {
        InstagramAccountField.clear();
        InstagramAccountField.sendKeys(instagram);
    }
    public void setAlamat (String alamat) {
        alamatField.clear();
        alamatField.sendKeys(alamat);
    }
    public void clickButtonUpdate () {
        updateButton.click();
    }
    public boolean verifyPopUpUpdateMentor(){
        return verifyPopUpUpdateMentor.isDisplayed();
    }
    public void clearField () {
        namaLengkapField.clear();
        deskripsiField.clear();
        noHpField.clear();
        emailField.clear();
        InstagramAccountField.clear();
        alamatField.clear();
    }
    public boolean verifyPopUpFailedUpdate(){
        return verifyPopUpFailedMentor.isDisplayed();
    }
    public void setSelectInstrument (String instrument) {
        Select a = new Select(selectInstrument);
        a.selectByVisibleText(instrument);
    }
    public void clickinstrumentButton() {
        instrumentButton.click();
    }
    public boolean verifyPopUpUpdateInstrument() {
        return popUpUpdateInstrument.isDisplayed();
    }
    public void clickOkButtonInstrument () {
        popUpSuccessInstrument.click();
    }
    public boolean verifyPopUpFailedUpdateInstrument() {
        return popUpFailedInstrument.isDisplayed();
    }
    public void clickPopUpButtonFailedInstrument () {
        popUpButtonFailedInstrument.click();
    }
    public void setselectGenre (String Genre) {
        Select a = new Select(selectGenre);
        a.selectByVisibleText(Genre);
    }
    public void clickButtonGenre () {
        buttonGenre.click();
    }
    public boolean verifypopUpSuccessGenre() {
        return popUpSuccessGenre.isDisplayed();
    }
    public void setInputPass (String oldpassword, String newpassword, String confirmpassword) {
        inputOldPassword.sendKeys(oldpassword);
        inputNewPassword.sendKeys(newpassword);
        inputConfirmPassword.sendKeys(confirmpassword);
    }
    public void clickUpdateButtonPassword() {
        updateButtonPassword.click();
    }

    public boolean verifyPopUpSuccessUpdatePass(){
        return popUpSuccessUpdatePass.isDisplayed();
    }
    public void clickOkButtonUpdatePass() {
        okButtonUpdatePass.click();
    }
    public boolean verifypopUpFailedUpdatePass(){
        return popUpFailedUpdatePass.isDisplayed();
    }
    public void clickOkButtonFailedUpdatePasss() {
        okButtonFailedUpdatePass.click();
    }
    public void uploadCertificateMentor () {
        buttonChooseFileCertificate.
        sendKeys(dir+"/DocFoto/BassMasterSertifikat.jpg");
    }
    public void clickButtonUpdateSertifikat() {
        buttonUpdateSertifikat.click();}
    public void setSelectTipeSertifikat (String tipeSertifikat) {
        Select a = new Select(selectTipeSertifikat);
        a.selectByVisibleText(tipeSertifikat);
    }
    public void setFieldNamaSertifikat (String namaSertifikat) {
        namaSertifikatField.clear();
        namaSertifikatField.sendKeys(namaSertifikat);
    }

    public void uploadProfilePicture () {
        buttonChooseFileCertificate.sendKeys(dir+"/DocFoto/ProfilePic.jpg");
    }





}







