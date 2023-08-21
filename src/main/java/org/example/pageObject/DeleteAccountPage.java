package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
    public static WebDriver driver;
    public DeleteAccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[.='Profile']")
    private WebElement profileButton;
    @FindBy(xpath = "//p[@class='text-md text-red-500 font-poppins cursor-pointer']")
    private WebElement deleteButtonStudent;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement hapusYaAccountStudent;
    @FindBy(css = " #btn-deactivateaccount")
    private WebElement deleteButtonMentor;


    @FindBy(css = ".text-2xl")
    private WebElement verifyHomePage;


    public void clickProfileButton(){
        profileButton.click();
    }

    public void clickDeleteButtonStudent(){
        deleteButtonStudent.click();
    }
    public void clickYaHapusAkunButton(){
        hapusYaAccountStudent.click();
    }
    public void clickDeleteMentor(){
        deleteButtonMentor.click();
    }

    public boolean verifyHomePage(){
        return verifyHomePage.isDisplayed();
    }



}
