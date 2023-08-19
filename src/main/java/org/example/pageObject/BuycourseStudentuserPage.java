package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuycourseStudentuserPage {
    public static WebDriver driver;

    public BuycourseStudentuserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-findmentor']")
    public WebElement clickbuttonfindmentor;
    @FindBy(xpath = "//div[@class='container mx-auto p-9']")
    public WebElement alredyifindmentorpage;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement shearcmentorfavorite;
    @FindBy(css = "[src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    public WebElement clickbtnmentorfavorite;
    @FindBy(xpath = "//div[@class='m-2 mt-7 grid grid-cols-2 space-x-5 gap-14']/div[2]//img[@alt='Album']")
    public WebElement clickcoursestudent;
    @FindBy(id = "root")
    public WebElement verifikasicoursepage;
    @FindBy(id = "btn-belikursus")
    public WebElement clickbtnbelikursus;
    @FindBy(xpath = "//div[@class='w-full min-h-screen flex flex-col bg-white items-center mt-4']")
    public WebElement verifikasicheckoutpage;
    @FindBy(xpath = "//div[@class='container mx-auto w-[80%] p-10']")
    public WebElement verifikasicoursepagementor;
    @FindBy(id = "input-start_date")
    public WebElement inputcheckavaibility;
    @FindBy(id = "select-role")
    public WebElement selectrole;
    @FindBy(xpath = "//button[@class='btn bg-[#3A2BE8] mt-4']")
    public WebElement btnchekcavaibility;
    @FindBy(css = ".swal2-html-container")
    public WebElement verifikasipopupavisibility;
    @FindBy(css = ".swal2-confirm")
    public WebElement clickokepopupavisibility;
    @FindBy(xpath = "//button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']")
    public WebElement clickbtnpayment;
    @FindBy(css = ".swal2-html-container")
    public WebElement popuppayment;

    public void setClickbuttonfindmentor(){
        clickbuttonfindmentor.click();
    }
    public boolean setalreadyfindmentorpage(){
        return alredyifindmentorpage.isDisplayed();
    }
    public void setShearcmentorfavorite(String nameMentor){
        shearcmentorfavorite.sendKeys(nameMentor);
    }
    public void setClickbtnmentorfavorite(){
        clickbtnmentorfavorite.click();
    }
    public void setClickcoursestudent(){
        clickcoursestudent.click();
    }
    public void setBtnchekcavaibility(){
        btnchekcavaibility.click();
    }
    public void setClickokepopupavisibility(){
        clickokepopupavisibility.click();
    }
    public void setClickbtnpayment(){
        clickbtnpayment.click();
    }
    public boolean setverifikasicoursepage(){
        return verifikasicoursepage.isDisplayed();
    }
    public void setClickbtnbelikursus(){
        clickbtnbelikursus.click();
    }
    public boolean setverifikasicheckoutpage(){
        return verifikasicheckoutpage.isDisplayed();
    }
    public boolean setverifikasipopupavisibility(){
        return verifikasipopupavisibility.isDisplayed();
    }
    public boolean setverfikasipopuppayment(){
        return popuppayment.isDisplayed();
    }
    public boolean setverifikasicoursementorpage(){
        return verifikasicoursepagementor.isDisplayed();
    }
    public void setInputcheckavaibility(String check){
        inputcheckavaibility.sendKeys(check);
    }
    public void setSelectrole(String selectRole){
        Select select  = new Select(selectrole);
        selectrole.click();
        select.selectByVisibleText(selectRole);
    }
}
