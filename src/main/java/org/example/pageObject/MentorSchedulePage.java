package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MentorSchedulePage {
    public static WebDriver driver;
    public MentorSchedulePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//summary[.='Lihat Jadwal']")
    private WebElement arrowButton;
    @FindBy(xpath = "//div[@class='w-[14rem] p-3']")
    private WebElement verifyJadwalMentor;
    @FindBy(xpath= "//div[8]//button[@id='btn-delete']")
    private WebElement deleteOneJadwalMentor;

    @FindBy(xpath= "//button[@id='btn-jadwalsaya']")
    private WebElement jadwalSayaButton;
    @FindBy(xpath= "//h1[@class='text-button font-bold text-2xl']")
    private WebElement verifyHistoryMengajar;
    @FindBy(xpath = "//button[@id='btn-kembali']")
    private WebElement backButton;
    @FindBy(xpath = "//button[@id='btn-editTeacher']")
    private WebElement verifyProfileMentorPage;
    @FindBy(xpath = "//summary[.='Tambah Jadwal']")
    private WebElement arrowButtonAddJadwal;
    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement pilihHari;
    @FindBy (xpath = "//input[@id='input-startTime']")
    private WebElement start_time;
    @FindBy (xpath = "//input[@id='input-endTime']")
    private WebElement endHour;
    @FindBy (xpath = "//button[@id='btn-jadwal']")
    private WebElement uploadButton;
    @FindBy (css= ".swal2-html-container")
    private WebElement popUpSuccessSchedule;
    @FindBy (css= "//div[@class='swal2-html-container']")
    private WebElement popUpServerProblem;









    public void clickArrowButton(){
        arrowButton.click();
    }
    public boolean verifyJadwalMentor(){
        return verifyJadwalMentor.isDisplayed();
    }
    public void clickJadwalSayaButton(){
        jadwalSayaButton.click();
    }
    public boolean verifyJadwalHistory(){
        return verifyHistoryMengajar.isDisplayed();
    }
    public void clickDeleteJadwal(){
        deleteOneJadwalMentor.click();
    }
    public void clickBackButton(){
        backButton.click();
    }
    public boolean verifyProfileMentorPage(){
        return verifyProfileMentorPage.isDisplayed();
    }
    public void clickTambahJadwalSaya(){
       arrowButtonAddJadwal.click();
    }
    public void setPilihHari(String day){
        Select a = new Select(pilihHari);
        pilihHari.click();
        a.selectByVisibleText(day);
    }
    public void setStartHour(String startime){
        start_time.sendKeys(startime);
    }
    public void setEndHour(String endtime){
        endHour.sendKeys(endtime);
    }
    public void clickuploadButton(){
       uploadButton.click();
    }
    public boolean verifyPopUpSuccessSchedule(){
        return popUpSuccessSchedule.isDisplayed();
    }
    public boolean verifyPopUpServerProblem(){
        return popUpServerProblem.isDisplayed();
    }

}
