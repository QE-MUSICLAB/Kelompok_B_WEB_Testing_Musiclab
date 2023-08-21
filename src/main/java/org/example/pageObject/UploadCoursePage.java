package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UploadCoursePage {
    public static WebDriver driver;

    public UploadCoursePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-kursussaya']")
    private WebElement kursusSayaButton;
    @FindBy(xpath = "//div[@class='container mx-auto p-10']")
    private WebElement verifyKursusSayaPage;
    @FindBy(xpath = "//button[@id='btn-uploadnewcourse']")
    private WebElement uploadNewCourseButton;
    @FindBy(xpath = "//div[@class='w-full min-h-screen']")
    private WebElement verifyUploadCoursePage;
    @FindBy(xpath = "//input[@id='input-header-kursus']")
    private WebElement inputFile;
    @FindBy(xpath = "//input[@id='input-judulkursus']")
    private WebElement judulKursus;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement pilihLevel;
    @FindBy(xpath = "//textarea[@id='input-deskripsikursus']")
    private WebElement deskripsi;
    @FindBy(xpath = "//textarea[@id='input-apayangdipelajari']")
    private WebElement apaYgDipelajari;
    @FindBy(xpath = "//textarea[@id='input-prasayrat-khusus']")
    private WebElement praSyarat;
    @FindBy(xpath = "//textarea[@id='input-untuk-siapa-kursus-ini']")
    private WebElement untukSiapa;
    @FindBy(xpath = "//input[@id='input-harga-kursus']")
    private WebElement harga;
    @FindBy(xpath = "//input[@id='input-duratopn']")
    private WebElement durasi;
    @FindBy(xpath = "//button[@id='btn-uploadkursus']")
    private WebElement uploadButton;
    @FindBy(css = ".swal2-html-container")
    private WebElement successPopUp;
    @FindBy(css = ".swal2-html-container")
    private WebElement failedPopUp;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okFailedButton;
    @FindBy(xpath = "[fdprocessedid='gcykgn']")
    private WebElement editButton;
    @FindBy(xpath = "//div[@class='w-full min-h-screen']")
    private WebElement verifyUpdateCoursePage;
    @FindBy(xpath = "//button[@id='btn-updatekursus']")
    private WebElement updateButton;

    @FindBy(css = "[fdprocessedid='d40rfj']")
    private WebElement deleteButton;

    public static String dir = System.getProperty("user.dir");

    public void setKursusSayaButton() {
        kursusSayaButton.click();
    }
    public boolean setVerifyKursusSayaPage(){
        return verifyKursusSayaPage.isDisplayed();
    }
    public void setUploadNewCourseButton(){
        uploadNewCourseButton.click();
    }
    public boolean setVerifyUploadCoursePage(){
        return verifyUploadCoursePage.isDisplayed();
    }
    public void setInputFile(){
        inputFile.sendKeys(dir + "/DocFoto/Kursi-Panas-Spongebob.jpg");
    }
    public void setJudulKursus(String judul){
        judulKursus.sendKeys(judul);
    }
    public void setPilihLevel(String level){
        Select a = new Select(pilihLevel);
        a.selectByVisibleText(level);
    }
    public void setDeskripsi(String deskripsiKhusus){
        deskripsi.sendKeys(deskripsiKhusus);

    }
    public void setApaYgDipelajari(String apayangdipelajari){
        apaYgDipelajari.sendKeys(apayangdipelajari);
    }
    public void setPraSyarat(String prasyaratKhusus){
        praSyarat.sendKeys(prasyaratKhusus);
    }
    public void setUntukSiapa(String siapa){
        untukSiapa.sendKeys(siapa);
    }
    public void setHarga(String hargaKhusus){
        harga.sendKeys(hargaKhusus);

    }
    public void setDurasi(String duration){
        durasi.sendKeys(duration);
    }
    public void setUploadButton(){
        uploadButton.click();
    }
    public boolean verifySuccessPopUp(){
        return successPopUp.isDisplayed();
    }
    public boolean verifyFailedPopUp(){
        return failedPopUp.isDisplayed();
    }
    public void setOkFailedButton(){
        okFailedButton.click();
    }
    public void setEditButton(){
        editButton.click();
    }
    public boolean setVerifyUpdateCoursePage(){
        return verifyUpdateCoursePage.isDisplayed();
    }

    public void clearField(){
        inputFile.clear();
        judulKursus.clear();
        deskripsi.clear();
        apaYgDipelajari.clear();
        praSyarat.clear();
        untukSiapa.clear();
        harga.clear();
        durasi.clear();
    }
    public void setUpdateButton(){
        uploadButton.click();
    }

    public void setDeleteButton(){
        deleteButton.click();
    }
}
